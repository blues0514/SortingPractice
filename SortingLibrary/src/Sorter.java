public class Sorter {
    public static void sort(int[] ar) {
        // TODO : 정렬 수행
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
    }
}
