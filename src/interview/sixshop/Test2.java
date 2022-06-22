package interview.sixshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

  /*
   * 유저가 달성한 점수에 따라 실시간 랭킹을 보여주는 랭킹 페이지가 있습니다. 랭킹페이지는 한 페이지에 K명씩 닉네임을 보여주며, 랭킹이 산정되는 규칙은 다음과 같습니다.
   * 1. 점수가 높은 유저의 랭킹이 더 높습니다.
   * 2. 점수가 같다면 해당 점수를 먼저 달성한 유저의 랭킹이 높습니다.
   * 3. 어떤 유저가 이전 기록보다 더 높은 점수를 달성하면, 이전 기록은 사라지고 새로운 기록이 랭킹에 반영됩니다.
   * 4. 어떤 유저가 이전 기록보다더 낮거나 같은 점수를 달성했다면 이 기록은 무시합니다.
   *
   * 페이지가 몇번 변경했는지 횟수를 구하시오
   * ! 점수 변화가 있더라도 랭킹에 변화가 없다면 랭킹 페이지는 바뀌지 않습니다.
   *
   *
   * */
  public static int solution(int K, String[] user_scores) {
    // 1 페이지 변경 횟수 리턴
    int answer = 0;

    // K = pageSize
    // user_scores : {"alex111 100", "cheries2 200", ...}

    // pageSize 만큼 map 과 list 채운다.
    Map<String, Integer> userMap = new HashMap<>();
    ArrayList<Integer> rankList = new ArrayList<>();
    ArrayList<Integer> userScores = new ArrayList<>();

    for (String user_score : user_scores) {
      String[] split = user_score.split("\\s");
      if (rankList.size() < K) {
        rankList.add(Integer.parseInt(split[1]));
        userMap.put(split[0], rankList.size());
      } else {
        userScores.add(Integer.parseInt(split[1]));
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    System.out.println(solution(3,
        new String[]{"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120",
            "coco 300", "cheries2 110"}) == 4);
    System.out.println(solution(3,
        new String[]{"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"}) == 3);
    System.out.println(solution(2,
        new String[]{"cheries2 200", "alex111 100", "coco 150", "puyo 120"}) == 3);

  }
}
