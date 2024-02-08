// Mac Dang - February 12, 2023
// AP Computer Science A - Mr. Schneider
// lab11
// ClientCode

public class StatsMain {
    public static void main(String[] args) {
        Quarterback p1 = new Quarterback("Seahawks", "Seattle", "Russel Wilson", 9, 17, 5000, 250);
        System.out.println(p1.toString());
        int avgPerGame = p1.activity();
        System.out.println("He averages " + avgPerGame + " points each game\n");

        Receiver p2 = new Receiver("Rams", "Los Angeles", "Cooper Kupp", 10, 15, 4500, 400);
        System.out.println(p2.toString());
        avgPerGame = p2.activity();
        System.out.println("He averages " + avgPerGame + " points each game\n");

        RunningBack p3 = new RunningBack("Saints", "New Orleans", "Alvin Kamara", 41, 16, 3600, 175);
        System.out.println(p3.toString());
        avgPerGame = p3.activity();
        System.out.println("He averages " + avgPerGame + " points each game\n");
    }
}
