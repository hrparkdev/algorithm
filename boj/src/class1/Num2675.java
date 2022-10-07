package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testNum = Integer.parseInt(st.nextToken());
        for (int i = 0; i < testNum; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int repeatNum = Integer.parseInt(st2.nextToken());
            String str = st2.nextToken();
            String[] strArray = str.split(""); // ['A', 'B', 'C']
            for (int j = 0; j < strArray.length; j++) {
                for (int k = 0; k < repeatNum; k++) {
                    bw.write(strArray[j]);
                }
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
