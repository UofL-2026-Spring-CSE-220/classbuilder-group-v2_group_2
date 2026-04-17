package autogradertests;

import edu.coolschool.utilities.dateutils.MonthsEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthsEnumTest {

    @Test
    @DisplayName("Month does not exsit")
    public void TheRightMonths() {
        assertEquals(MonthsEnum.JANUARY, MonthsEnum.fromString("January"));
        assertEquals(MonthsEnum.FEBRUARY, MonthsEnum.fromString("February"));
        assertEquals(MonthsEnum.MARCH, MonthsEnum.fromString("March"));
        assertEquals(MonthsEnum.APRIL, MonthsEnum.fromString("April"));
        assertEquals(MonthsEnum.JUNE, MonthsEnum.fromString("June"));
        assertEquals(MonthsEnum.JULY, MonthsEnum.fromString("July"));
        assertEquals(MonthsEnum.AUGUST, MonthsEnum.fromString("August"));
        assertEquals(MonthsEnum.SEPTEMBER, MonthsEnum.fromString("September"));
        assertEquals(MonthsEnum.OCTOBER, MonthsEnum.fromString("October"));
        assertEquals(MonthsEnum.NOVEMBER, MonthsEnum.fromString("November"));
        assertEquals(MonthsEnum.DECEMBER, MonthsEnum.fromString("December"));


    }

    @Test
    @DisplayName("fromString throws exception for invalid input")
    void fromStringThrowsExceptionForInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> MonthsEnum.fromString("Invalid Month Name"));
        assertThrows(IllegalArgumentException.class, () -> MonthsEnum.fromString(""));
    }

    @Test
    @DisplayName("Right Month Number")
    void RightMonthNumber() {
        assertEquals(MonthsEnum.JANUARY, MonthsEnum.fromMonthNumber(1));
        assertEquals(MonthsEnum.FEBRUARY, MonthsEnum.fromMonthNumber(2));
        assertEquals(MonthsEnum.MARCH, MonthsEnum.fromMonthNumber(3));
        assertEquals(MonthsEnum.APRIL, MonthsEnum.fromMonthNumber(4));
        assertEquals(MonthsEnum.MAY, MonthsEnum.fromMonthNumber(5));
        assertEquals(MonthsEnum.JUNE, MonthsEnum.fromMonthNumber(6));
        assertEquals(MonthsEnum.JULY, MonthsEnum.fromMonthNumber(7));
        assertEquals(MonthsEnum.AUGUST, MonthsEnum.fromMonthNumber(8));
        assertEquals(MonthsEnum.SEPTEMBER, MonthsEnum.fromMonthNumber(9));
        assertEquals(MonthsEnum.OCTOBER, MonthsEnum.fromMonthNumber(10));
        assertEquals(MonthsEnum.NOVEMBER, MonthsEnum.fromMonthNumber(11));
        assertEquals(MonthsEnum.DECEMBER, MonthsEnum.fromMonthNumber(12));
    }

    @Test
    @DisplayName("fromInt throws exception for invalid input")
    void fromIntThrowsExceptionForInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> MonthsEnum.fromMonthNumber(0));
        assertThrows(IllegalArgumentException.class, () -> MonthsEnum.fromMonthNumber(13));
    }
    @Test
    @DisplayName("getMonthLength returns correct days for 30/31 day months")
    void getMonthLengthReturnsCorrectDays() {
        assertEquals(30, MonthsEnum.getMonthLength(4));  // April
        assertEquals(30, MonthsEnum.getMonthLength(6));  // June
        assertEquals(30, MonthsEnum.getMonthLength(9));  // September
        assertEquals(30, MonthsEnum.getMonthLength(11)); // November
        assertEquals(31, MonthsEnum.getMonthLength(1));  // January
        assertEquals(31, MonthsEnum.getMonthLength(7)); // July
        assertEquals(31, MonthsEnum.getMonthLength(3));  // March
        assertEquals(31, MonthsEnum.getMonthLength(5)); // May
        assertEquals(31, MonthsEnum.getMonthLength(8));  // August
        assertEquals(31, MonthsEnum.getMonthLength(10)); // October
        assertEquals(31, MonthsEnum.getMonthLength(12));  // December


    }

    // ensure number and month lineup (for insurance)
    @Test
    @DisplayName("getMonthNumber returns correct values")
    void getMonthNumberReturnsCorrectValues() {
        assertEquals(1, MonthsEnum.JANUARY.getMonthNumber());
        assertEquals(2, MonthsEnum.FEBRUARY.getMonthNumber());
        assertEquals(3, MonthsEnum.MARCH.getMonthNumber());
        assertEquals(4, MonthsEnum.APRIL.getMonthNumber());
        assertEquals(5, MonthsEnum.MAY.getMonthNumber());
        assertEquals(6, MonthsEnum.JUNE.getMonthNumber());
        assertEquals(7, MonthsEnum.JULY.getMonthNumber());
        assertEquals(8, MonthsEnum.AUGUST.getMonthNumber());
        assertEquals(9, MonthsEnum.SEPTEMBER.getMonthNumber());
        assertEquals(10, MonthsEnum.OCTOBER.getMonthNumber());
        assertEquals(11, MonthsEnum.NOVEMBER.getMonthNumber());
        assertEquals(12, MonthsEnum.DECEMBER.getMonthNumber());
    }

}
