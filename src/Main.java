import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String title = askForFilmTitle();
        String nameOfDirector = askForNameOfDirector();
        boolean isPorno = askIfIsPorno();
        Film film = new Film(title, nameOfDirector, isPorno);
        printFilm(film);
    }

    private static void printFilm(Film film) {
        System.out.println("Film created: " + film.getTitle() + "Name of Director: " + film.getNameOfDirector() + "Is Porno? " + film.isPorno());
    }

    private static boolean askIfIsPorno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Porno?  Y/N "  );

        String text = sc.nextLine();
        return text.equals("Y");
    }

    private static String askForNameOfDirector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of Director: " );
        return sc.nextLine();
    }

    private static String askForFilmTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title: " );
        return sc.nextLine();
    }


}
