package interview.sixshop;

public class Test3 {

  /*
   * 한 번에 최대 N잔 까지 동시에 커피를 추출할 수 있는 커피 추출기가 있습니다.
   * 이 커피 추출기를 이용해 커피를 만들 때, 커피가 만들어지는 순서를 구하려 합니다.
   *
   * 만들어야 하는 커피가 M잔이면, 커피에 1부터 M까지 순서대로 주문번호가 붙어있습니다. 또, 주문번호 순으로 빈 커피 추출구에서 커피를 만들기 시작합니다.
   * 만약 빈 추출구가 없다면, 빈 추출구가 생길 때 까지 다음 주문은 잠시 기다리며, 빈 추출구가 생기면 대기 중인 다음 커피를 즉시 만들기 시작합니다.
   *
   * 모든 커피는 만드는데 일정 시간이 소요되는데, 소요 시간은 커피 종류별로 다를 수 있습니다. 따라서 커피 제조 시간에 따라 각 주문이 완료되는 순서는 다를 수 있습니다.
   *
   * 커피 추출구 개수 N, 각 커피를 만드는데 걸리는 시간이 주문번호 순서대로 담긴 배열 coffee_times가 매개변수로 주어질 때, 커피가 완성
   * 되는 순서대로 주문번호를 배열에 담아 return 하도록 solution 함수를 완성해주세요.
   *
   * 단, 커피 주문이 추출구에 배정되는데 걸리는 시간은 없다고 가정하며, 커피 추출이 동시에 완료됐을 경우 작은 주문번호가 앞에 오도록 하면 됩니다.
   *
   * */
  public static int[] solution(int N, int[] coffee_times) {
    int[] answer = {};
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(3, new int[]{4, 2, 2, 5, 3}) == new int[]{2, 3, 1, 5, 4});
    System.out.println(solution(1, new int[]{100, 1, 50, 1, 1}) == new int[]{1, 2, 3, 4, 5});

  }

}
