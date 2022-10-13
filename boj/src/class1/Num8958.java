package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseNum = Integer.parseInt(st.nextToken());
        for (int i = 0; i < testCaseNum; i++) { // 5번
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String[] inputArray = st2.nextToken().split(""); // "OOXXOXXOOO"
            int count = 0;
            int sum = 0;

            for (int j = 0; j < inputArray.length; j++) { // 10번
                if (inputArray[j].equals("O")) {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            bw.write(Integer.toString(sum));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
