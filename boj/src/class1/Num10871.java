package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int numA = Integer.parseInt(st.nextToken());
        String minNums = "";

        for (int i = 0; i < count; i++) {
            int numB = Integer.parseInt(st2.nextToken());
            if (numB < numA) {
                minNums += numB + " ";
            }
        }

        bw.write(minNums);

        br.close();
        bw.flush();
        bw.close();
    }
}
