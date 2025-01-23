/**
 *  Abstract person class
 * 
 *  @author Anastasia Sokol
 *  @author Gray Willits
**/
public abstract class Person {
    private String myName;
    private String occupation;

    public Person(String myName, String occupation) {
        this.myName = myName;
        this.occupation = occupation;
    }

    /*
     * Displays the person asking another person their name
    */
    public void askName() {
        System.out.println("What is your name?");
    }

    /*
     * Displays a person giving their name
    */
    public void giveName() {
        System.out.println("My name is " + myName);
    }

    /*
     * Displays the person's occupation
    */
    public void whatIDo() {
        System.out.println("I am a" + ("aeiouAEIOU".contains(occupation.substring(0, 1)) ? "n " : " ") + occupation);
    }

	/*
	 * Displays a question
	*/
    public abstract void askQuestion();
    
	/*
	 * Displays an answer to a question
	*/
    public abstract void answerQuestion();
}




