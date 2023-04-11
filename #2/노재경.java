import java.util.Scanner;

public class Main {

    private static final String START_QUESTION = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    private static final String FIRST = "\"재귀함수가 뭔가요?\"";
    private static final String SECOND = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    private static final String THIRD = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    private static final String FOURTH = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    private static final String ANSWER = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    private static final String LAST = "라고 답변하였지.";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        System.out.println(START_QUESTION);
        printRecursive(0, count);
    }

    private static void printRecursive(int count, int goal) {
        if(count==goal){
            System.out.println("_".repeat(count*4)+FIRST);
            System.out.println("_".repeat(count*4)+ ANSWER);
            System.out.println("_".repeat(count*4)+LAST);
            return;
        }

        System.out.println("_".repeat(count*4)+FIRST);
        System.out.println("_".repeat(count*4)+SECOND);
        System.out.println("_".repeat(count*4)+THIRD);
        System.out.println("_".repeat(count*4)+FOURTH);
        printRecursive(count+1, goal);
        System.out.println("_".repeat(count*4)+LAST);
    }
}
