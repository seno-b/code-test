package interview.sixshop;

public class Test1 {

  public static int solution(int[] estimates, int k) {
    int answer = 0;

    // k 일수동안 이벤트 진행
    // estimates 추정 접속자 수
    // k일수동안 추정접속자 수의 최대 합을 구하라

    int tmp = 0;
    int sizeUp = 0;
    for (int i = 0; i < estimates.length; i++) {

      tmp += estimates[i];

      if (i == (k + sizeUp) - 1) {
        i = sizeUp;
        sizeUp++;
        if (answer < tmp) {
          answer = tmp;
        }
        tmp = 0;
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{5, 1, 9, 8, 10, 5}, 3));
    System.out.println(solution(new int[]{10, 1, 10, 1, 1, 4, 3, 10}, 6));
  }
}
