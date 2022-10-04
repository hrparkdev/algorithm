package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }

        int lastNum = sum % 10;
        bw.write(Integer.toString(lastNum));

        br.close();
        bw.flush();
        bw.close();
    }
}