// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// ReceiverCode

public class Receiver extends FootballPlayer {
    private int recievingYards;

    public Receiver(String name, String city, String playerName, int number, int gamesPlayed, int points, int recievingYards) {
        super(name, city, playerName, number, gamesPlayed, points);
        this.recievingYards = recievingYards;
    }

    public int activity() {
        return recievingYards/super.gamesPlayed;
    }

    public int pointsGame() {
        return super.points / super.gamesPlayed;
    }

    public String toString() {
        return super.toString()+"\n"+ "He plays Receiver and he averages "+ pointsGame() + " receiving yards each game.";
    }
}



