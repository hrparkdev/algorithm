package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int numCount = Integer.parseInt(st.nextToken());
        String strNum = st2.nextToken();
        int sum = 0;

        for (int i = 0; i < numCount; i++) {
            int num = Character.getNumericValue(strNum.charAt(i));
            sum += num;
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}