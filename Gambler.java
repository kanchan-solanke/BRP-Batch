import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a stake value");
        double stake = sc.nextDouble();
        System.out.println(stake);
        System.out.println("Enter a trail value");
        double trail = sc.nextDouble();
        System.out.println(trail);
        System.out.println("Enter a goal value");
        double goal = sc.nextDouble();
        System.out.println(goal);

        int bets = 0, wins = 0;
        for (int i = 0; i < trail; i++)      //where a gambler starts with certain stake
        {
            double cash = stake;          // stake is the money risked
            while (cash > 0 && cash < goal)      //until he/she goes broke or reaches the goal
            {
                bets++;
                if (Math.random() < 0.5)       //places fair Re 1  0 to <1
                    cash++;
                else
                    cash--;
            }
            if(cash == goal)
                wins++;
            }
        System.out.println("Number of times win are: "+wins+trail);
        System.out.println("Average of bets won :"+ wins/trail);
        System.out.println("Percent of won :"+1.0 * bets/trail);
        }

}
