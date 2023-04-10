import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        bw.write((int) (Math.pow(2, count) - 1) + "\n"); // 전체 횟수는 2^n -1 번

        hanoi(count, 1, 3, 2);
        bw.flush();
        bw.close();
    }

    private static void hanoi(int count, int from, int to, int other) throws IOException {
        if(count==0){
            return;
        }
        hanoi(count-1, from, other, to); // n-1 개를 남은 위치로 이동
        bw.write(from + " " + to + "\n");  // 마지막 원반을 이동
        hanoi(count-1, other, to, from); // n-1 개를 목표 지점으로 이동
    }
}
