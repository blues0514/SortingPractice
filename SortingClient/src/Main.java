public class Main {
    public static void main(String[] args) {
        String[] ar = new String[]{"A3", "C4", "D1", "B2"};

        Sorter<String> sorter = new Sorter<>();
        sorter.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}

