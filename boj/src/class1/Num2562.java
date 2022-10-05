package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (max < num) {
                max = num;
                index = i + 1;
            }
        }

        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(index));

        br.close();
        bw.flush();
        bw.close();
    }
}