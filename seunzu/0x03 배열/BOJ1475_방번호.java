package barkingDog.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1475_방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] arr = new int[10];
        for (int i = 0; i < n.length(); i++) {
            arr[n.charAt(i) - '0']++;
        }

        // ver 2
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[10];
//        while (n > 0) {
//            arr[n % 10]++;
//            n /= 10;
//        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9)
                continue;
            answer = Math.max(answer, arr[i]);
        }

        answer = Math.max(answer, (arr[6] + arr[9] + 1) / 2);
        System.out.println(answer);
    }
}
