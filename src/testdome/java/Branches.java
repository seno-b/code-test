package testdome.java;

public class Branches {
    public static int count(int[] tree) {
        int counts[] = new int[tree.length];

        for(int i = 0; i < tree.length; i++) {
            if(0 <= tree[i])
                ++counts[tree[i]];
        }

        int count = 0;
        for(int i = 0; i < counts.length; i++) {
            if(1 <= counts[i])
                ++count;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Branches.count(new int[] { 1, 3, 1, -1, 3 }));
        System.out.println(Branches.count(new int[] { -1, 0, 1 }));
        String s = new String("sleifj");
        s.intern();
    }
}