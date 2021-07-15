import java.util.Arrays;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        while (true){
            manu();

            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()){

                case "1":
                    System.out.println("Введіть назву фільму");
                    scanner = new Scanner(System.in);
                    String title2 = scanner.nextLine();
                    System.out.println("Введіть тривалість фільму в годинах");
                    int hour2 = scanner.nextInt();
                    System.out.println("Введіть тривалість фільму в хвилинах");
                    int min2 = scanner.nextInt();
                    System.out.println("Введіть початок сеансу в годинах");
                    int startMoviehour = scanner.nextInt();
                    System.out.println("Введіть початок сеансу в хвилинах");
                    int startMoviemin = scanner.nextInt();
                    Seance seance = new Seance(new Movie(title2,new Time(hour2,min2)),new Time(startMoviehour,startMoviemin));
                    System.out.println("введіть день");
                    String day = scanner.next();
                    cinema.addSeance(seance,day);
                    cinema.addToLibary(new Movie(title2,new Time(hour2,min2)));

                    break;
                case "2":
                    System.out.println("Список доданих сеансів");
                    cinema.showShcedule();
                    break;
                case "3":
                    System.out.println("Введіть день сеансу який ви хочете очистити");
                    String seanceClear = scanner.next();
                    cinema.clearSeance(seanceClear);
                    break;
                case "4":
                    System.out.println("Список всіх фільмів");
                    cinema.showLibary();
                    break;
                case "5":
                    System.out.println("ВВедіть назву фільму який хочете видалити з фільмотеки");
                    String nameDel = scanner.next();
                    cinema.removeMovie(nameDel);
                    break;
            }
        }
    }
    public static void manu(){
        System.out.println("  Натисніть 1 - щоб добавити фільм у Сеанс та фільмотеку");
        System.out.println("  Натисніть 2 - щоб вивести список доданих сеансів");
        System.out.println("  Натисніть 3 - щоб очистити сеанс на конкретний день");
        System.out.println("  Натисніть 4 - щоб вивести список доданих фільмів ");
        System.out.println("  Натисніть 5 - щоб видалити фільм за назвою з фільмотеки");
        System.out.println("-------------------------------------------------------------");
    }
}
