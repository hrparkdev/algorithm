package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int dan = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= 9; i++) {
            bw.write(dan + " * " + i + " = " + (dan * i));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
