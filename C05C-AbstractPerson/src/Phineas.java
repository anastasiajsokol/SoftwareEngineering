public class Phineas extends Person {
    // from the Phineas and Ferb theme song
    private final String[] THINGS_TO_DO = {
        "Building a rocket",
        "Fighting a mummy",
        "Climbing up the Eiffel Tower",
        "Discovering something that doesn't exist",
        "Giving a monkey a shower",
        "Surfing tidal waves",
        "Creating nano bots",
        "Locating Frankenstein's brain",
        "Finding a dodo bird",
        // what is this missing item?
        "Driving our sister insane",
    };

    // from the running gag throughout the show
    private final String[] A_LITTLE_YOUNG = {
        "rollercoaster engineers",
        "restoring a national monument",
        "movie directors",
        "building a submarine",
    };

    // counters for THINGS_TO_DO and A_LITTLE_YOUNG respectively
    private int todo;
    private int nextQuestion;

    /**
     *  Create a new person representing Phineas Flynn
    **/
    public Phineas(){
        super("Phineas Flynn", "Junior Engineer");
        todo = 0;
        nextQuestion = 0;
    }

    @Override
    public void whatIDo(){
        // choose the next thing from the theme song (loop back around)
        System.out.println(THINGS_TO_DO[todo % THINGS_TO_DO.length]);
        todo += 1;
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
        // this is always Phineas' response
        System.out.println("Yes, yes we are.");
    }
}
