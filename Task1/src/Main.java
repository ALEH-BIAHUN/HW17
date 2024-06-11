import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Wine wine_1 = new Wine("Dry wine","red", "Italy",
                               "Delicious wine", 2000);
        Wine wine_2 = new Wine("Semi-sweet wine", "white", "Spain",
                               "Delicious wine", 2005);

        LocalDate yearOfBottling = LocalDate.of(2000, 8, 21);
        Period period = Period.between(yearOfBottling, LocalDate.now());

        System.out.println("Выдержка вина марки: " + wine_1.getMark() + "," + "из страны - " +
                wine_1.getCountry() + " составляет: " + period.getYears() + " лет, " +
                period.getMonths() + " месяцев и " + period.getDays() + " дней");
    }
}