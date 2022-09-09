package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num1152 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}