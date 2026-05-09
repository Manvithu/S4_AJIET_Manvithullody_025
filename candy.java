import java.util.Scanner;

public class CandyJar {
    public static void main(String[] args) {

        int N = 10; 
        int K = 5; 
        int jar = N;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candies to buy: ");
        int order = sc.nextInt();

        if (order > jar) {
            System.out.println("INVALID INPUT");
        }
        else {

            jar = jar - order;

            System.out.println("Candies sold: " + order);


            if (jar <= K)
            {
                jar = N;
            }

            System.out.println("Candies available in jar: " + jar);
        }

        sc.close();
    }
}
