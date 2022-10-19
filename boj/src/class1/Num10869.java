package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(numA + numB));
        bw.newLine();
        bw.write(Integer.toString(numA - numB));
        bw.newLine();
        bw.write(Integer.toString(numA * numB));
        bw.newLine();
        bw.write(Integer.toString(numA / numB));
        bw.newLine();
        bw.write(Integer.toString(numA % numB));

        br.close();
        bw.flush();
        bw.close();
    }
}
