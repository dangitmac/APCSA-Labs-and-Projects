// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// PlayerCode

public class Player extends Team {
    private String playerName;
    private int number;

    public Player(String name, String city, String playerName, int number) {
        super(name, city);
        this.playerName = playerName;
        this.number = number;
    }

    public String toString() {
        return playerName + " is number " + number + ". He plays for the " + super.toString() + ".";
    }
}
