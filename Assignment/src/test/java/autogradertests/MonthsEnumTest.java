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
}
