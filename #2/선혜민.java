package problem2;
import java.util.Scanner;
public class SolutionHM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(cnt);
    }
    // 전역 변수 선언 이유 -> ____를 누적
    // temp recursive 메소드 별로 ____를 담는
    static String underbar = "";
    private static void recursive(int i) {
        String temp = underbar; // 반복적으로 출력되면서 ____가 점점 추가된다.)
        // i가 0이라면, 재귀 호출을 종료
        if(i == 0) {
            System.out.println(temp + "\"재귀함수가 뭔가요?\"");
            System.out.println(temp + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(temp + "라고 답변하였지.");
            return; // if문 이후의 문장을 실행할 필요없도록 리턴
        }
        // i가 0이 아닌 경우
        System.out.println(temp + "\"재귀함수가 뭔가요?\"");
        System.out.println(temp + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(temp + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(temp + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
        // 후, underbar에 "____"을 추가
        underbar += "____";

        recursive(i-1); // 재귀적으로 호출 --> i-1을 인자로 전달

        System.out.println(temp + "라고 답변하였지."); // 종료 시 이 문장 마지막으로 출력
    }
}
