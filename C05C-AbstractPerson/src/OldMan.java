/**
 * 	Defines an old man who only gives the same responses
 * 
 * 	@author Anastasia Sokol
 * 	@author Gray Willits
**/

public class OldMan extends Person {

	public OldMan(String myName) {
		super(myName, "retired");
	}
	
	/*
	 * Asks for their name
	*/
	@Override
	public void askName() {
		System.out.println("What's your name sonny?");
	}

	/*
	 * Responds with their occupation
	*/
	@Override
	public void whatIDo() {
		System.out.println("I'm retired.");
	}

	/*
	 * Asks a single question
	*/
	@Override
	public void askQuestion() {
		System.out.println("Where are your parents? They need to make sure that you stay off my lawn!");
	}

	/*
	 * Answers questions with a single response
	 */
	@Override
	public void answerQuestion() {
		System.out.println("What? Can you speak up, I can't hear very well.");
	}

}
