package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] countArray = new int[10];
        int intNum = 1;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            intNum *= temp;
        }

        String strNum = Integer.toString(intNum);
        String[] strNumArray = strNum.split("");
        for (int i = 0; i < strNumArray.length; i++) {
            for (int j = 0; j < countArray.length; j++) {
                if (Integer.parseInt(strNumArray[i]) == j) {
                    countArray[j]++;
                }
            }
        }

        for (int i = 0; i < countArray.length; i++) {
            bw.write(Integer.toString(countArray[i]));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}