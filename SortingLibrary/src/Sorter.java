public class Sorter<T extends Comparable<T>> {
    public void sort(T[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i].compareTo(ar[j]) > 0) {
                    T t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
    }
}

