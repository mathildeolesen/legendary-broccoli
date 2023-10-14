import mathildeo.se23.oblig2testing.LeapYear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LeapYearTest {

    /*-------------------*/
    /*--- Leap years ---*/
    /*------------------*/

    @Test
    public void LeapYear_divisible_by_4_but_not_by_100() {
        // 2004, 2012, 2020 is divisible by 4 but not by 100.
        // Therefore, assertTrue (isLeapYear should return True)

        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2012));
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void LeapYear_divisible_by_400() {
        // Tried a different way of testing multiple years :)
        // Less asserts = good?

        Integer[] years = {1600, 2000, 2400};

        // 1600, 2000, 2400 is divisible by 400.
        // Therefore, assertTrue (isLeapYear should return True)
        for (int year : years) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }

    /*----------------------*/
    /*--- Not leap years ---*/
    /*----------------------*/

    @Test
    public void NotLeapYear_not_divisible_by_4() {
        // 2003 (2011, 2019) is *not* divisible by 4.
        // Therefore, assertFalse (isLeapYear should return False)

        // Is there any need to test more than one year anyway? (with the same characteristics)
        assertFalse(LeapYear.isLeapYear(2003));
    }

    @Test
    public void NotLeapYear_divisible_by_100_not_divisible_by_400() {
        // 1700 (1800, 1900, 2100) is divisible by 100, but not 400.
        // Therefore, assertFalse (isLeapYear should return False)
        assertFalse(LeapYear.isLeapYear(1700));

    }
}
