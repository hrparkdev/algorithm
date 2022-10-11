package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] reverseArray = new int[2];
        int max = 0;
        for (int i =  0; i < reverseArray.length; i++) {
            String strNum = st.nextToken();
            String reverse = "";

            for (int j = strNum.length() - 1; j >= 0; j--) {
                reverse += strNum.charAt(j);
            }

            reverseArray[i] = Integer.parseInt(reverse);

            if (max < reverseArray[i]) {
                max = reverseArray[i];
            }
        }

        bw.write(Integer.toString(max));

        br.close();
        bw.flush();
        bw.close();
    }
}
