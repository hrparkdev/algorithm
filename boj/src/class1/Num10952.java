package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            if (numA == 0 && numB == 0) {
                break;
            }
            int sum = numA + numB;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}