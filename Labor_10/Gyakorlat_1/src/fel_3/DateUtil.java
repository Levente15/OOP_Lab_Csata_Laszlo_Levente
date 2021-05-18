package fel_3;

public class DateUtil {
    public static boolean leapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) throws InvalidDateException {
        boolean valid = true;
        if (year < 1 || month < 1 || day < 1 || month > 12 || day > 31) {
            valid = false;
        } else if (month == 2) {
            valid = day <= (leapYear(year) ? 29 : 28);
        } else valid = day <= ((month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31);
        if (valid == false) {
            throw new InvalidDateException("INVALID DATE");
        }
        return valid;
    }

    static class InvalidDateException extends Throwable {
        public InvalidDateException(String invalid_date) {
            System.out.println(invalid_date);
        }
    }
}
