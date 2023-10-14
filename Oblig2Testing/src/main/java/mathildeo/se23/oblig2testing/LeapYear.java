package mathildeo.se23.oblig2testing;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        // If 'year' is divisible by 4 ...
        if (year % 4 == 0) {
            // ... and if then 'year' is *not* divisible by 100 or *is* by 400 (...or both)
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}