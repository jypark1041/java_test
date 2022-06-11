package BaekJoon;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int YYYY = sc.nextInt();
        if (YYYY % 4 == 0 && YYYY % 100 != 0 || YYYY % 400 == 0) {
            System.out.println(1);
        } else
            System.out.println(0);

    }
}
