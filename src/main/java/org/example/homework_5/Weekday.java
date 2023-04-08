package org.example.homework_5;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        boolean x = false;
        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                x = true;
            break;
            case SUNDAY:
            case SATURDAY:
                x= false;
            break;
        }
        return x;
    }
    public boolean isHoliday() {
        boolean x = false;
        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                x = false;
                break;
            case SUNDAY:
            case SATURDAY:
                x = true;
                break;
        }
        return x;
    }
}




