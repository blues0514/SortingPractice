import jdk.swing.interop.DispatcherWrapper;

public class Main {
    public static void main(String[] args) {
        String[] ar = new String[]{"3", "4", "1", "2"};

        Sorter<String> sorter = new Sorter<>();
        sorter.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}

