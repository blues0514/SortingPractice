import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void 정렬_후_1번째_원소는_1이어야_함() {
        int[] ar = new int[]{3, 5, 1, 2};

        Sorter.sort(ar, (lhs, rhs) -> lhs > rhs);

        assertEquals(1, ar[0]);
    }

    @Test
    void 정렬_후_2번째_원소는_2이어야_함() {
        int[] ar = new int[]{3, 5, 1, 2};

        Sorter.sort(ar, (lhs, rhs) -> lhs > rhs);

        assertEquals(2, ar[1]);
    }

    @Test
    void 정렬_후_3번째_원소는_3이어야_함() {
        int[] ar = new int[]{3, 5, 1, 2};

        Sorter.sort(ar, (lhs, rhs) -> lhs > rhs);

        assertEquals(3, ar[2]);
    }

    @Test
    void 정렬_후_4번째_원소는_5이어야_함() {
        int[] ar = new int[]{3, 5, 1, 2};

        Sorter.sort(ar, (lhs, rhs) -> lhs > rhs);

        assertEquals(5, ar[3]);
    }
}