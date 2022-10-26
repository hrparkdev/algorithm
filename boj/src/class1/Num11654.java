package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char input = st.nextToken().charAt(0);
        int ascii = (int)input;
        bw.write(Integer.toString(ascii));

        br.close();
        bw.flush();
        bw.close();
    }
}
