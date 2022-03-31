import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * use linked hash sets? since it won't add existing elements,
 * just check size after for unique words
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Iliad.txt");
        Scanner scanner = new Scanner(file);
        /*while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }*/

        //turn file to string? string to tree set?
        /*Path iliadPath = file.toPath();
        String content = Files.readString(iliadPath, StandardCharsets.US_ASCII);*/

        /*TreeSet<String> uniqueWords = new TreeSet<>();
        while(scanner.hasNext()){
            uniqueWords.add(scanner.next());
        }

        //edit this to replace all punct in iliad
        String iliadText = scanner.nextLine();
        String noPunct = iliadText.replaceAll("\\p{Punct}", "");
        System.out.println(noPunct);

        Iterator<String> wordIterator = uniqueWords.iterator();
        while (wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }
        System.out.println(uniqueWords.size());*/
        TreeSet<String> uniqueWords = new TreeSet<>();
        while(scanner.hasNext()){
            String iliadText = scanner.next();
            String noPunct = iliadText.replaceAll("\\p{Punct}", "");
            uniqueWords.add(noPunct.toLowerCase());
        }

        Iterator<String> wordIterator = uniqueWords.iterator();
        while (wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }
        System.out.println(uniqueWords.size());
    }
}
