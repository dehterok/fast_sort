import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class UnitTests {


    @Test
    public void EmptyTest() {
        int[] actual = {};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void SameElementTest(){
        int[] actual = {3,3,0,3};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {0,3,3,3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void RandomTest() {
        int[] actual = {99,66,55,11,0,-55};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {-55,0,11,55,66,99};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void NegativeElementsTest() {
        int[] actual = {-2,-20,-12,-200};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {-200,-20,-12,-2};
        assertArrayEquals(expected, actual);
    }



    @Test
    public void SortedTest(){
        int[] actual = {-1,0,1,2,3};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {-1,0,1,2,3};
        assertArrayEquals(expected, actual);
    }

}