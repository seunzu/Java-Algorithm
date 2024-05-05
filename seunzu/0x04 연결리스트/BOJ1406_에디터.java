package barkingDog.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class BOJ1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> left = new LinkedList<>();
        ListIterator<Character> cursor = left.listIterator(left.size());

        String str = br.readLine();
        for (char ch : str.toCharArray()) {
            cursor.add(ch);
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command.charAt(0)) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    cursor.add(st.nextToken().charAt(0));
                    break;
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : left) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
