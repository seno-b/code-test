package testdome.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Q. Implement function countNumbers that accepts a sorted array of unique integers and, efficiently with respect to time used, counts the number of array elements that are less than the parameter lessThan.
 *
 * For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.
 *
 *
 * 함수 countNumbers는 고유 한 정수로 정렬 된 배열을 받아들이고 효율적으로 사용 된 시간과 관련하여 lessThan 매개 변수보다 작은 배열 요소의 수를 계산합니다.
 * 예를 들어 SortedSearch.countNumbers (new int [] {1, 3, 5, 7}, 4)는 4보다 작은 두 개의 배열 요소가 있으므로 2를 반환해야합니다.
 *
 */
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan){

        // 정렬 ... 뒤에꺼 까지 비교할 필요가없지
        // 정렬에는 많은것이 있는데... 1차원 배열이니까.

        Arrays.sort(sortedArray);

        int result = 0;
        for(int i = 0; i < sortedArray.length; i++){
            if (sortedArray[i] < lessThan) {
                result++;
            }else{
                break;
            }
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(SortedSearch.countNumbers(new int[] {1,3,5,7}, 4));
    }
}
