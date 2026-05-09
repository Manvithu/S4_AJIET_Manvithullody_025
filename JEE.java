import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] ranks = new int[N];

        for (int i = 0; i < N; i++) {
            ranks[i] = sc.nextInt();
        }

        int minRank = ranks[0];
        int count = 0;

        for (int i = 1; i < N; i++) {
            if (ranks[i] < minRank) {
                count++;
                minRank = ranks[i];
            }
        }

        System.out.println(count);
    }
}
