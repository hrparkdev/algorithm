package class1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] alphabetArray = st.nextToken().split("");
        int[] countArray = new int[26];
        Arrays.fill(countArray, -1);

        for (int i = 0; i < alphabetArray.length; i++) {
            int ascii = (int) alphabetArray[i].charAt(0);
            int index = ascii - 97;

            if (countArray[index] != -1) {
                continue;
            }
            countArray[index] = i;
        }

        for (int i = 0; i < countArray.length; i++) {
            bw.write(countArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
