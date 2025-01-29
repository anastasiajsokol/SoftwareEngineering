"""
    Package up general Java directories into the Eclipse package format
    TODO: inject the project name into .project!
"""

import shutil
import sys
import os

ROOT = os.path.dirname(os.path.abspath(__file__))
LASTNAME = "Willits_Sokol"

def package_directory(path: str):
    path = os.path.abspath(path)
    src = os.path.join(path, "src")
    bin = os.path.join(path, "bin")

    name = os.path.basename(path)


    print("faking project meta files...")

    template = os.path.join(ROOT, "template")
    # TODO: properly parse .project (for now just copy settings)
    # files = [".project", ".classpath", ".settings/org.eclipse.jdt.core.prefs"]
    files = [".settings/org.eclipse.jdt.core.prefs"]

    os.makedirs(os.path.join(path, ".settings"), exist_ok=True)
    for file in files:
        origsin = os.path.join(template, file)
        destination = os.path.join(path, file)
        shutil.copyfile(origsin, destination)
    
    print("faking project binary folder...")
    
    os.makedirs(bin, exist_ok=True)

    for root, _, files in os.walk(src):
        if not os.path.samefile(root, src):
            print("ERROR: Currently the package tool is unable to compile subdirectories of src")
            break
        
        working_directory = os.getcwd()
        os.chdir(root)

        for file in files:
            os.system(f"javac {file} -d {bin}")

        os.chdir(working_directory)
    
    print("compressing...")
    shutil.make_archive(f"{name}_{LASTNAME}", 'zip', path)

if __name__ == "__main__":
    if len(sys.argv) != 2 or "help" in sys.argv[1]:
        print("a silly packager to pretend that I am using Eclipse")
        print("usage: directory")
        sys.exit(1)
    
    package_directory(sys.argv[1])
