import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    User youngerUser = new User();

    youngerUser.name = "Ikramul Haque";

    youngerUser.birthDay = LocalDate.parse("26-01-2000", formatter);

    System.out.printf("%s was born in %s. He is now %d years old.", youngerUser.name, youngerUser.birthDay.toString(),
        youngerUser.age());
  }
}