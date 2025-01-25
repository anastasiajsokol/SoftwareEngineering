/**
 *  A person representing Phineas Flynn from the show Phineas and Ferb
 * 
 *  @author Anastasia Soko
 *  @author Gray Willits
**/

public class Phineas extends Person {
    // from the Phineas and Ferb theme song
    private final String[] THINGS_TO_DO = {
        "building a rocket",
        "fighting a mummy",
        "climbing up the Eiffel Tower",
        "discovering something that doesn't exist",
        "giving a monkey a shower",
        "surfing tidal waves",
        "creating nano bots",
        "locating Frankenstein's brain",
        "finding a dodo bird",
        // what is this missing item?
        "driving our sister insane",
    };

    // from the running gag throughout the show
    private final String[] A_LITTLE_YOUNG = {
        "rollercoaster engineers",
        "restoring a national monument",
        "movie directors",
        "building a submarine",
    };

    // levels of annoyance at being asked
    private final String[] YES = {
        "Yes, yes I am, thanks for asking",
        "Yes, yes I am.",
        "Yes.",
        "YES!",
        "YES, WHY DO YOU KEEP LETTING ME GET AWAY WITH THIS!?",
    };

    // counters for THINGS_TO_DO and A_LITTLE_YOUNG respectively
    private int todo;
    private int nextQuestion;

    // make Phineas get more annoyed the more times you ask
    private int timesAskedAboutAge;

    /**
     *  Create a new person representing Phineas Flynn
    **/
    public Phineas(){
        super("Phineas Flynn", "Junior Engineer");
        todo = nextQuestion = timesAskedAboutAge = 0;
    }

    @Override
    public void whatIDo(){
        // choose the next thing from the theme song (loop back around)
        String thingToDo = THINGS_TO_DO[todo % THINGS_TO_DO.length];
        todo += 1;

        // format into message
        System.out.printf("Finding a good way to spend the summer, like %s.\n", thingToDo);
    }

    @Override
    public void askQuestion(){
        // choose the next activity from the running gag
        String activity = A_LITTLE_YOUNG[nextQuestion % A_LITTLE_YOUNG.length];
        nextQuestion += 1;

        // put it in the standard format
        System.out.printf("Aren't you boys a little young to be %s?\n", activity);
    }

    @Override
    public void answerQuestion(){
        // choose an answer based on how many times he has been asked
        int level = Math.min(timesAskedAboutAge, YES.length - 1);
        timesAskedAboutAge += 1;

        System.out.println(YES[level]);
    }
}
