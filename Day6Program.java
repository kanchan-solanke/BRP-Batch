import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are : ");
        //loop for finding and printing all prime numbers between given range

        for (int i = start; i <= end; i++) {
            int count = 0;
            //logic for checking number is prime or not

            for (int j = 1; j <= i; j++) {
                //condition for getting the factors of number n
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
        sc.close();
    }
}