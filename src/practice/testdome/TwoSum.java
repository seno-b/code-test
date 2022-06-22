package practice.testdome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
*
* Q. Write a function that, when passed a list and a target sum, returns, efficiently with respect to time used, two distinct zero-based indices of any two of the numbers, whose sum is equal to the target sum. If there are no two numbers, the function should return null.
*
* For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array with two elements and contain any of the following pairs of indices:
*   0 and 3 (or 3 and 0) as 3 + 7 = 10
*   1 and 5 (or 5 and 1) as 1 + 9 = 10
*   2 and 4 (or 4 and 2) as 5 + 5 = 10
*
*
* 목록과 목표 합계를 전달할 때 사용 된 시간과 관련하여 두 숫자 중 두 가지 숫자 중 두 가지로 구분되는 인덱스를 효율적으로 반환하고 그 합계가 목표 합계와 같은 함수를 작성하십시오.
* 두 개의 숫자가 없으면 함수는 null을 반환해야합니다.
* 예를 들어 findTwoSum (new int [] {3, 1, 5, 7, 5, 9}, 10)은 두 개의 요소가있는 단일 차원 배열을 반환하고 다음 색인 쌍 중 하나를 포함해야합니다.
*
* */
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum){

        /*2 중 포문 : 성능 저하 */
        /*int num1;
        int num2;
        for(int i=0; i < list.length; i++){
            for(int j=0; j < list.length; j++){
                System.out.println("num1 = " + i + ", num2 = " + j);
                if ((list[i] + list[j]) == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return null;*/

        /* hash map */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < list.length; i++){

            int solution = sum - list[i];
            if(map.containsKey(solution)){
                if(solution + list[i] == sum)
                    return new int[] {map.get(solution), i};
            }
            map.put(list[i], i);
        }

        return null;
    }

    public static void main(String[] args){
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 1, 5, 6,  9}, 10);

        if(indices != null){
            System.out.println(indices[0] + " " + indices[1]);
        }
    }

}
