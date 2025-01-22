
/**
 *  Detective class
 *  
 *  @author Anastasia Sokol
 *  @author Gray Willits
 * 
 *  @date January 21, 2025
**/

public class Detective {
    private String name;
    private int badgeNumber;

    public Detective(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    @Override
    public String toString() {
        return "Detective [Badge=" + badgeNumber + ", Name=" + name + "]";
    }
}
