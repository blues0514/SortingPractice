public class Sorter {
    public static void sort(int[] ar,
                            SorterItemComparator comparator,
                            AfterSwapListener afterSwapListener,
                            BeforeSwapListener beforeSwapListener) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (comparator.isSwappable(ar[i], ar[j])) {
                    // before swap
                    if (beforeSwapListener.canSwap(i,j) == false)
                        continue;

                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;

                    // after swap
                    afterSwapListener.onSwapped(i, ar[i]);
                }
            }
        }
    }
}
