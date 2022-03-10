import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new File("Iliad.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
