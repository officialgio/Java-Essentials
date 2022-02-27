package Project;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String date) {
        this.day = Integer.parseInt(date.substring(0, 2));
        this.month = Integer.parseInt(date.substring(3, 5));
        this.year = Integer.parseInt(date.substring(6, 10));
    }

    // getters and setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;

        if (day > 31 || day < 31)
            throw new IllegalArgumentException("Invalid day");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;

        if (month > 12 || month < 1)
            throw new IllegalArgumentException("Invalid Month");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year > 2022 || year < 1980)
            throw new IllegalArgumentException("Invalid year");
    }
}
