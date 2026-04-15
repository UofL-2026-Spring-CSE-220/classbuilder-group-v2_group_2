package edu.coolschool.utilities.dateutils;
import  java.time.Year;

public enum MonthsEnum {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int monthNumber;

    MonthsEnum(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public static int getMonthLength(int  month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }
        if ( month == 2) {
            throw  new IllegalArgumentException(" Need year for leap Year");
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else{
            return 31;
        }
    }



    public static MonthsEnum fromMonthNumber(int monthNumber) {
        for (MonthsEnum month : MonthsEnum.values()) {
            if (month.getMonthNumber() == monthNumber) {
                return month;
            }
        }
        throw new IllegalArgumentException("Invalid month number: " + monthNumber);
    }

    public static MonthsEnum fromString(String monthName) {
        for (MonthsEnum month : MonthsEnum.values()) {
            if (month.name().equalsIgnoreCase(monthName)) {
                return month;
            }
        }
        throw new IllegalArgumentException("Invalid month name: " + monthName);
    }

    public String toString() {
        // Capitalize the first letter and make the rest lowercase
        String name = this.name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        // Example usage
        MonthsEnum month = MonthsEnum.fromMonthNumber(3);
        System.out.println(month); // Output: March

        month = MonthsEnum.fromString("October");
        System.out.println(month); // Output: October

        System.out.println(MonthsEnum.JANUARY.getMonthNumber()); // Output: 1
    }
}
