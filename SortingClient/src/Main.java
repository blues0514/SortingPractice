public class Main {
    public static void main(String[] args) {
        int[] ar = new int[]{3, 4, 1, 2};

        Sorter.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}

