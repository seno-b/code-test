package practice.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

  /*
  *
  * 문제 설명
  수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

  마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

  제한사항
  마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
  completion의 길이는 participant의 길이보다 1 작습니다.
  참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
  참가자 중에는 동명이인이 있을 수 있습니다.
  입출력 예
  participant	completion	return
  ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
  ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
  ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
  입출력 예 설명
  예제 #1
  "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

  예제 #2
  "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

  예제 #3
  "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
  *
  * */

  public static String solution(String[] participant, String[] completion) {
    String answer = "";

    // participant 참여자 명단
    // completion 완주자 명단

    Map<String, Integer> completionMap = new HashMap<>();

    for (String s : completion) {
      // 이미 완주자 목록에 들어가 있는 경우 count 증가
      Integer duplicateCount = completionMap.get(s);
      if (duplicateCount != null) {
        completionMap.put(s, duplicateCount + 1);
      } else {
        completionMap.put(s, 1);
      }
    }

    for (String s : participant) {
      Integer integer = completionMap.get(s);
      if (integer == null) {
        return s;
      } else {
        if (integer - 1 == -1) {
          return s;
        }
        completionMap.put(s, integer - 1);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
  }

}
