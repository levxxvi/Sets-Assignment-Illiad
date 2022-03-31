import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Iliad.txt");
        Scanner scanner = new Scanner(file);
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
