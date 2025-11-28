package unit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldSortArray()
    {
        int[] ints = {4,6,100,1};

        int[] expected = {100,6,4,1};

        int[] sorted = App.sortInts(ints);

        assertArrayEquals(expected, sorted);
    }


    @Test 
    public void shouldHandleEmptyArray() {
        int[] ints = {};

        int[] expected = {};

        int[] sorted = App.sortInts(ints);

        assertArrayEquals(expected, sorted);
    }
    
    @Test
    public void shouldSortArrayWithDuplicates()
    {
        int[] ints = {4, 4, 4, 1, 4};

        int[] expected = {4, 4, 4, 4, 1};

        int[] sorted = App.sortInts(ints);

        assertArrayEquals(expected, sorted);
    }
}
