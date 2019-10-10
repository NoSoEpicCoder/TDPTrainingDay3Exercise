import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        int[] arraySortBubble = {18, 35, 32, 8, 22, 1, 27};
        Sorting.bubbleSort(arraySortBubble);
        assertEquals(18, arraySortBubble[2]);
        assertEquals(35, arraySortBubble[6]);
    }

    @org.junit.jupiter.api.Test
    void quickSort() {
        int[] arraySortQuick = {18, 35, 32, 8, 22, 39, 7};
        Sorting.quickSort(arraySortQuick);
        assertEquals(7, arraySortQuick[0]);
        assertEquals(22, arraySortQuick[3]);
    }

    @org.junit.jupiter.api.Test
    void binarySearch() {
        int[] arraySearch = {2, 5, 7, 8, 10, 12, 15};
        assertEquals(4, Sorting.binarySearch(arraySearch, 10));
        assertEquals(2, Sorting.binarySearch(arraySearch, 7));
    }
}