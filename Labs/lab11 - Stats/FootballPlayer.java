// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// FootballPlayer

public class FootballPlayer extends Player {
    int gamesPlayed;
    int points;

    public FootballPlayer(String name, String city, String playerName, int number, int gamesPlayed, int points) {
        super(name, city, playerName, number);
        this.gamesPlayed = gamesPlayed;
        this.points = points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getPointsGames() {
        return points;
    }

    public String toString() {
        return super.toString() + "\n" + "He plays Football and he played in " + Integer.toString(gamesPlayed) + " games.";
    }
}

