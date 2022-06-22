package interview.kakao.hairshop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

  public static int solution(int N) {
    // 자연수 N, 오름차순 정렬, 내림차순 정렬 후 더한 값 리턴

    String asc = "";
    String desc = "";

    String[] ascSplit = String.valueOf(N).split("");
    List<String> ascs = Arrays.stream(ascSplit).sorted().collect(Collectors.toList());
    List<String> descs = Arrays.stream(ascSplit).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    for (String s : ascs) {
      asc += s;
    }

    for (String s : descs) {
      desc += s;
    }

    return Integer.parseInt(asc) + Integer.parseInt(desc);
  }

  public static void main(String[] args) {

    solution(2613);

  }

}
