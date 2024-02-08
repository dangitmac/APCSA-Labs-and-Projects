// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// QuarterbackCode

public class Quarterback extends FootballPlayer {
    private int passingYards;

    public Quarterback(String name, String city, String playerName, int number, int gamesPlayed, int points, int passingYards) {
        super(name, city, playerName, number, gamesPlayed, points);
        this.passingYards = passingYards;
    }

    public int activity() {
        return passingYards / super.gamesPlayed;
    }

    public int pointsGame() {
        return super.points / super.gamesPlayed;
    }

    public String toString() {
        return super.toString() + "\n" + "He plays Quarterback and he averages " + pointsGame() + " passing yards each game.";
    }
}
