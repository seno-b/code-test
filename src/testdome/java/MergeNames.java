package testdome.java;

/*
* Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.
* For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) should return an array containing Ava, Emma, Olivia, and Sophia in any order.
*
* uniqueNames 메소드를 구현하십시오.
* 이름의 두 배열을 전달하면 하나 또는 두 배열 모두에 나타나는 이름이 포함 된 배열을 반환합니다.
* 반환 된 배열에는 중복이 없어야합니다.
*
* 예를 들어 MergeNames.uniqueNames (new String [] { 'Ava', 'Emma', 'Olivia'}, new String [] { 'Olivia', 'Sophia', 'Emma'})를 호출하면 Ava가 포함 된 배열이 반환됩니다. , Emma, Olivia 및 Sophia는 어떤 순서로든
*
* */

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        /*throw new UnsupportedOperationException("Waiting to be implemented.");*/

        Stream tmp1 = Arrays.stream(names1);
        Stream tmp2 = Arrays.stream(names2);

        return (String[]) Stream.concat(tmp1, tmp2).distinct().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
