import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * use linked hash sets? since it won't add existing elements,
 * just check size after for unique words
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Iliad.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
