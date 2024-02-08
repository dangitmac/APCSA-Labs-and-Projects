// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// RunningBackCode

public class RunningBack extends FootballPlayer {
    private int rushingYards;

    public RunningBack(String name, String city, String playerName, int number, int gamesPlayed, int points, int rushingYards) {
        super(name, city, playerName, number, gamesPlayed, points);
        this.rushingYards = rushingYards;
    }

    public int activity() {
        return rushingYards/super.gamesPlayed;
    }

    public int pointsGame() {
        return super.points / super.gamesPlayed;
    }

    public String toString() {
        return super.toString()+"\n"+ "He plays Running Back and he averages "+ pointsGame() + " running yards each game.";
    }
}

