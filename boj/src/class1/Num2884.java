package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        minute -= 45;
        if (minute < 0) {
            hour--;
            minute += 60;
        }

        if (hour < 0) {
            hour += 24;
        }

        bw.write(hour + " " + minute);

        br.close();
        bw.flush();
        bw.close();
    }
}