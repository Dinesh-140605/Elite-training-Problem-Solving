import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            width += (a <= h) ? 1 : 2;
        }
        System.out.println(width);
        sc.close();
    }
}

