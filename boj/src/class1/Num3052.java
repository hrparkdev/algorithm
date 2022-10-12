package class1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] modArray = new int[10];
        int count = 0;
        for (int i = 0; i < modArray.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            modArray[i] = num % 42;
        }

        int[] DeduplicationArray = Arrays.stream(modArray).distinct().toArray();
        bw.write(Integer.toString(DeduplicationArray.length));

        br.close();
        bw.flush();
        bw.close();
    }
}
