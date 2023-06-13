package problem4;

public class SolutionHM {
    /* n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
     예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
     사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서
     타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
     [ 제한사항 ]
     주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
     각 숫자는 1 이상 50 이하인 자연수입니다.
     타겟 넘버는 1 이상 1000 이하인 자연수입니다.
    */
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    // 현재 탐색 깊이 : depth / 목표값 : target / 현재까지의 누적 합 : result
    public void dfs(int[] numbers, int depth, int target, int result){
        if (depth == numbers.length){ // 탐색 깊이가 배열의 길이와 동일될때 곧 트리 끝에 도착했다면
            if (target == result){ // target 값과 누적합(합계)가 같을 시
                this.answer++; // ++해줌
            }
            return;
        }
        // 트리의 끝에 도달치 않은 경우
        // depth를 1 증가시켜 다음 깊이로 이동
        // 모든 가능한 조합을 탐색하며 누적합이 목표값과 동일한 경우를 카운트해 answer 값을 반환한다 !
        dfs(numbers, depth+1, target, result + numbers[depth] );// 양수를 더한 값
        dfs(numbers, depth+1, target, result - numbers[depth] );// 음수를 더한 값
    }
}
