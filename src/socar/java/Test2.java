package socar.java;

public class Test2 {

  /*
   * 자연수 N개가 중복없이 들어있는 배열이 있습니다. 이때, 서로 다른 두 원소의 위치를 바꾸는 Swap 연산을 이용해 원소들의 위치를 바꿔 서로 인접한
   * 원소의 차가 K이하가 되도록 하려 합니다. 단, Swap 연산을 최대한 적게 사용해야 합니다.
   *
   * 배열 numbers가 매개변수로 주어질 때, 서로 인접한 원소의 차가 K이하가 되도록 하는데 필요한 Swap 횟수의 최솟값을 return 하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * - number의 길이(N)는 1 이상 8 이하입니다.
   * - nmbers의 원소는 1 이상 100 이하인 자연수입니다.
   *    숫자는 중복없이 들어있습니다.
   * - K는 1 이상 100 이하인 자연수입니다.
   * - 서로 인접한 원소의 차가 K 이하가 되도록 할 수 있는 방법이 없다면 -1을 return 하세요

   * */
  public static int solution(int[] numbers, int K) {

    int answer = 0;

    // 그룹핑
    for (int i = 0; i < numbers.length; i++) {
      int firstGroupOne = numbers[i];
      int firstGroupTwo = numbers[i + 1];

      if (firstGroupOne + firstGroupTwo > K) {
        int secondGroupOne = numbers[i + 2];
        int secondGroupTwo = numbers[i + 3];

        if (secondGroupOne + secondGroupTwo > K) {

        }
      }
    }

    return 0;
  }

  public static void main(String[] args) {

    System.out.println(solution(new int[]{10, 40, 30, 20}, 20) == 1);
    System.out.println(solution(new int[]{4, 7, 5, 8, 6, 3, 2, 1}, 3) == 2);

  }

}
