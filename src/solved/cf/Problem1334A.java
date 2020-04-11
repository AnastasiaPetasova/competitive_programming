package solved.cf;

import java.util.Scanner;

/*
https://codeforces.com/contest/1334/problem/A
 */

public class Problem1334A {

    public static void main(String[] args) {
        new Problem1334A().solve();
    }

    void solve(){

        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++){

            int n = scanner.nextInt();
            int[][] test = new int[n][2];
            boolean correct = true;

            test[0][0] = scanner.nextInt();
            test[0][1] = scanner.nextInt();
            if (test[0][0] < test[0][1]) correct = false;

            for (int i = 1; i < n; i++){
                int tries = test[i][0] = scanner.nextInt();
                int successes = test[i][1] = scanner.nextInt();
                if (tries < successes) correct = false;
                if (test[i - 1][1] > successes) correct = false;
                if (test[i - 1][0] > tries) correct = false;
                if (successes - test[i - 1][1] > tries - test[i - 1][0]) correct = false;
            }

            System.out.println(correct ? "YES" : "NO");

        }
    }
}
