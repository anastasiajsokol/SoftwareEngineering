/**
 * 	Defines an old man who only gives one response
 * 
 * 	@author Anastasia Sokol
 * 	@author Gray Willits
**/

public class OldMan extends Person {

	public OldMan(String myName) {
		super(myName, "retired");
	}
	
	@Override
	public void askName() {
		System.out.println("What's your name sonny?");
	}
	
	@Override
	public void whatIDo() {
		System.out.println("I'm retired.");
	}

	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void answerQuestion() {
		System.out.println("What? Can you speak up, I can't hear very well.");
	}

}
