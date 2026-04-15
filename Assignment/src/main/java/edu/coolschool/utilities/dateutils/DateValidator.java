package edu.coolschool.utilities.dateutils;


public class DateValidator {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

    public static int getDaysInMonth(MonthsEnum month, int year) {
        return getDaysInMonth(month.getMonthNumber(), year);
    }
    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid monthd number: " + month);
        };


    }

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    public static boolean isValidDate(int day, MonthsEnum month, int year) {
        return isValidDate(day, month.getMonthNumber(), year);
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(isValidDate(29, MonthsEnum.FEBRUARY, 2020)); // true
        System.out.println(isValidDate(29, MonthsEnum.FEBRUARY, 2021)); // false
        System.out.println(isValidDate(31, 4, 2021)); // false
        System.out.println(isValidDate(31, 12, 2021)); // true
    }


}
