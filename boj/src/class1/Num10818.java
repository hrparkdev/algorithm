package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st2.nextToken());
        int min = num;
        int max = num;
        for (int i = 1; i < count; i++) {
            int num2 = Integer.parseInt(st2.nextToken());
            if (min > num2) {
                min = num2;
            }

            if (max < num2) {
                max = num2;
            }
        }

        bw.write(Integer.toString(min) + " " + Integer.toString(max));

        br.close();
        bw.flush();
        bw.close();
    }
}
