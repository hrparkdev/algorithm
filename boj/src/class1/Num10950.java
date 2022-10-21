package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st2.nextToken());
            int numB = Integer.parseInt(st2.nextToken());
            int sum = numA + numB;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
