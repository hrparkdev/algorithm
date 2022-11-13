package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        String str;

        while (true) {
            str = br.readLine();
            if (str == null) {
                break;
            }
            st = new StringTokenizer(str);

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            sb.append(numA + numB).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}