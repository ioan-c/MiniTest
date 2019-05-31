import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JUnitListTest {

    @Test
    public void testAssertList() {

        ArrayList<Long> actual = new ArrayList<>(Arrays.asList(4L, 2L, 3L));
        ArrayList<Long> expected = new ArrayList<>(Arrays.asList(5L, 1L, 2L));
        assertThat(MiniTest.testNumbers(actual), is(expected));
    }

}