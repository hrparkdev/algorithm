package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        bw.write(Double.toString(a / b));

        br.close();
        bw.flush();
        bw.close();
    }
}
