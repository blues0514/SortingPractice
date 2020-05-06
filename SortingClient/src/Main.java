import jdk.swing.interop.DispatcherWrapper;

public class Main {
    public static void main(String[] args) {
        int[] ar = new int[]{3, 4, 1, 2};

//        Sorter.sort(ar, new AscendingComparator());
//        Sorter.sort(ar, new DescendingComparator());
        Sorter.sort(ar,
                (lhs, rhs) -> lhs < rhs,
                (i, iValue) -> System.out.println("* with " + iValue + " at " + i),
                (i, j) -> i < 1);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}

