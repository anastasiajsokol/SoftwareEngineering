/**
 * 	Defines a Pirate who gives random responses
 * 
 * 	@author Anastasia Sokol
 * 	@author Gray Willits
**/

import java.util.Random;

public class Pirate extends Person {
	private final String[] preludes = {
		"Arrg there matey!",
		"Ahoy there!",
		"*Squawk* Ah that be my parrot!",
	};

	private final String[] questions = {
		"What's yer favorite kind of pickle?",
		"Have you ever gotten scurvey?",
		"I love your peg leg! Who's your supplier?",
	};

	private final String[] answers = {
		"I used to be an adventurer like you, but then I took an arrow to the knee.",
		"Ay once my parrot found a whole chest of gold buried in the sand!",
		"We are nice pirates, no plundering or any of that...",
	};

	private final String[] conclusions = {
		"See ye on the seven seas!",
		"Avast!",
		"The decks won't swab themselves!",
	};

	public Pirate(String myName, String occupation) {
		super(myName, occupation);
	}

	@Override
	public void whatIDo(){
		System.out.println("Ey I'm a pirate through-and-through!");
	}

	@Override
	public void askQuestion() {
		// create a random generator
		Random random = new Random();

		// pick random choices from prelude and questions
		String prelude = preludes[random.nextInt(preludes.length)];
		String question = questions[random.nextInt(questions.length)];

		// display with a space between them
		System.out.printf("%s %s\n", prelude, question);
	}

	@Override
	public void answerQuestion() {
		// create a random generator
		Random random = new Random();

		// pick an answer and print it
		String answer = answers[random.nextInt(answers.length)];

		System.out.print(answer);

		// add an optional conclusion
		if(random.nextBoolean()){
			// decide on a conclusion
			String conclusion = conclusions[random.nextInt(conclusions.length)];
			System.out.printf(" %s", conclusion);
		}

		// newline
		System.out.println();
	}

}
