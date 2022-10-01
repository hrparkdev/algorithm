package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if ((num - j) >= i) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write('\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}