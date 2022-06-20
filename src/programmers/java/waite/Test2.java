package programmers.java.waite;

import java.util.ArrayList;

public class Test2 {

  public static long solution(long n) {

    // 거듭제곱 수 구하기
    ArrayList<Double> threePowers = new ArrayList<>();
    for (int i = 0; i < 25; i++) {
      threePowers.add(Math.pow(3, i));
    }

    ArrayList<Double> results = new ArrayList<>();
    results.add(threePowers.get(0));
    for (int i = 0; i < threePowers.size(); i++) {
      if (i + 1 < threePowers.size()) {
        Double nextValue = threePowers.get(i + 1);
        results.add(nextValue);
        addBetweenValue(results, nextValue);
      }
    }

    return results.get((int) n-1).longValue();
  }

  private static void addBetweenValue(ArrayList<Double> results, Double nextValue) {
    ArrayList<Double> tempList = new ArrayList<>();
    tempList.addAll(results);
    for (Double value : tempList) {
      if (value < nextValue) {
        results.add(nextValue + value);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(solution(4) == 9);
    System.out.println(solution(11) == 31);
    System.out.println(solution(1553) == 31);
  }

}
