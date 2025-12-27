// File: VarargsDemo.java
public class VarargsDemo {
    static void printAll(String prefix, int... nums) {
        System.out.print(prefix + ": ");
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    static void ambiguity(int x, int... rest) {
        System.out.println("Called ambiguity with x=" + x + " restLength=" + rest.length);
    }

    public static void main(String[] args) {
        printAll("none");               // zero
        printAll("one", 7);             // one
        printAll("many", 1, 2, 3, 4);   // many

        ambiguity(1);           // x=1, restLength=0
        ambiguity(1, 2, 3);     // x=1, restLength=2

        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i + " " + iOb);  // displays 100 100

    }
}
