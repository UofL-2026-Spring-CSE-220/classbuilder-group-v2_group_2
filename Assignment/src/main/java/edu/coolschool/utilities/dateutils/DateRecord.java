package edu.coolschool.utilities.dateutils;
import  edu.coolschool.utilities.dateutils.DateValidator;



public record DateRecord(
        int dayInteger,
        int monthInteger,
        int yearInteger
) {
    public DateRecord {
        if (!DateValidator.isValidDate(dayInteger, monthInteger, yearInteger)) {
            throw new IllegalArgumentException("Invalid date: " + dayInteger + "/" + monthInteger + "/" + yearInteger);
        }



    }

    public DateRecord(int day, MonthsEnum month, int year) {
        this(day, month.getMonthNumber(), year);
    }

    public String toString() {
        return toString(DateFormatOptionsEnum.MM_DD_YYYY);
    }

    public String toString(DateFormatOptionsEnum format) {
        return switch (format) {

            case DD_MM_YYYY -> String.format("%02d/%02d/%04d", dayInteger, monthInteger, yearInteger);
            case MM_DD_YYYY -> String.format("%02d/%02d/%04d", monthInteger, dayInteger, yearInteger);
            case YYYY_MM_DD -> String.format("%04d/%02d/%02d", yearInteger, monthInteger, dayInteger);
            case MONTH_DD_YYYY ->  String.format("%s %02d, %02d", MonthsEnum.fromMonthNumber(monthInteger),dayInteger, yearInteger);
            // alot is missing here
            default -> throw new IllegalArgumentException("invalid sssdate");
        };
    }

    public static  class Builder{
        private int dayInteger;
        private int monthInteger;
        private int yearInteger;

        public Builder setDay(int day)
        {
            this.dayInteger = day;
            return this;
        }
        public Builder setMonth(MonthsEnum month)
        {
            this.monthInteger = month.getMonthNumber();
            return this;
        }
        public Builder setMonth(int month)
        {
            this.monthInteger = month;
            return this;
        }
        public Builder setYear(int year)
        {
            this.yearInteger = year;
            return this;
        }
        public DateRecord build(){
            return new DateRecord(dayInteger, monthInteger, yearInteger);
        }


    }

    public static void main(String[] args) {
        DateRecord date1 = new DateRecord(15, 3, 2024);
        System.out.println(date1); // Default format: MM/DD/YYYY
        System.out.println(date1.toString(DateFormatOptionsEnum.DD_MM_YYYY)); // Output: 15/03/2024
        System.out.println(date1.toString(DateFormatOptionsEnum.YYYY_MM_DD)); // Output: 2024/03/15
        System.out.println(date1.toString(DateFormatOptionsEnum.MONTH_DD_YYYY)); // Output: March 15, 2024

        DateRecord date2 = new DateRecord(29, MonthsEnum.FEBRUARY, 2020);
        System.out.println(date2); // Output: 02/29/2020
    }


    }





