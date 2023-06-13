package problem1;
import java.util.Scanner;
public class SolutionHM {
    static StringBuilder sb = new StringBuilder(); // 이동 순서가 담길 배열
    static int count = 0; // 이동 횟수
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        hanoi(num, 1, 2, 3); // 막대기 세 개를 순서대로 1, 2, 3으로 지정해줌

        System.out.println(count); // 이동 횟수
        System.out.println(sb); // 이동 순서
    }
    public static void hanoi(int num, int start, int mid, int end) {
        count++; // 이동 횟수 증가 (저장)
        // 이동할 원반의 수가 1개라면
        // sb에 start에서 end로 이동하는 것을 추가하고 함수를 종료
        if( num == 1 ) {
            sb.append(start + " " + end + "\n"); // 1번에서 3번으로 이동
            return;
        }

        // 이동할 원판의 수가 1개가 아닐 때 -->  재귀적으로 하노이 함수를 호출
        hanoi(num-1, start, end, mid); // 1->3->2 순서 (num-1개의 원판을 start에서 mid로 이동)

        // 제일 큰 원판을 1번에서 3번으로 이동 (start에서 end로 이동)
        sb.append(start + " " + end + "\n");

        // 셋째: n-1개를 2번에서 3번으로 이동 (mid에서 end로 이동)
        // 2번에 남아있는 원판들을 1번을 이용해서 3번으로 옮기기
        hanoi(num-1, mid, start, end); // 2->1->3 순서
    }
}

