public class Sorter {
    public static void sort(int[] ar, SorterItemComparator comparator) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (comparator.isSwappable(ar[i], ar[j])) {
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
    }
}
