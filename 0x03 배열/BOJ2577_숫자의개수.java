package barkingDog.array;

import java.util.Scanner;

public class BOJ2577_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(value);

        // 0 ~ 9까지 숫자 개수 저장
        int[] cnt = new int[10];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - '0']++; // 문자 -> 정수
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
        }
    }
}