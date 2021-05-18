package fel_3;

public class MyDate {
    private int year = -1;
    private int month = -1;
    private int day = -1;

    public MyDate(int year, int month, int day) throws DateUtil.InvalidDateException {
        if (DateUtil.isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public boolean isValid() {
        return this.year != -1;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", this.year, this.month, this.day);
    }

}
