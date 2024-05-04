package barkingDog.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 97]++; // 0 ~ 25까지 인덱스
        }

        for (int i = 0; i < 26; i++) {
            sb.append(a[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
