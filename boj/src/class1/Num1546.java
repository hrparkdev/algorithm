package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int subjectNum = Integer.parseInt(st.nextToken());

        double[] rawScoreArray = new double[subjectNum];
        for (int i = 0; i < subjectNum; i++) {
            int score = Integer.parseInt(st2.nextToken());
            rawScoreArray[i] = score;
        }

        double maxScore = rawScoreArray[0];
        for (int i = 1; i < subjectNum; i++) {
            if (maxScore < rawScoreArray[i]) {
                maxScore = rawScoreArray[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < subjectNum; i++) {
            sum += rawScoreArray[i] / maxScore * 100;
        }

        double average = sum / subjectNum;
        bw.write(Double.toString(average));

        br.close();
        bw.flush();
        bw.close();
    }
}