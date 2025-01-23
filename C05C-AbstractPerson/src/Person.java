/**
 *  Abstract person class
 * 
 *  @author Anastasia Sokol
 *  @author Gray Willits
**/
public abstract class Person {
    private String name;
    private String occupation;

    Person(String name, String occupation){
        this.name = name;
        this.occupation = occupation;
    }

    void askName(){
        // TODO: display question for name
    }

    void giveName(){
        // TODO: display name
    }

    void whatIDo(){
        // TODO: display occupation
    }

    abstract void askQuestion();
    
    abstract void answerQuestion();
}
