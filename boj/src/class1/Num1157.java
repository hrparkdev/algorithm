package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();
        String uppercaseWord = word.toUpperCase();
        int[] countArray = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char uppercase = uppercaseWord.charAt(i);
            int index = uppercase - 'A';
            countArray[index]++;
        }

        int maxCountIndex = 0;
        boolean isDuplication = false;
        for (int i = 1; i < countArray.length; i++) {
            if (countArray[maxCountIndex] < countArray[i]) {
                maxCountIndex = i;
            }
        }

        for (int i = 0; i < countArray.length; i++) {
            if (maxCountIndex == i) {
                continue;
            }

            if (countArray[maxCountIndex] == countArray[i]) {
                isDuplication = true;
                break;
            }
        }

        if (isDuplication) {
            bw.write("?");
        } else {
            bw.write(maxCountIndex + 'A');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}