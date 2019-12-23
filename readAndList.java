import java.io.*;
import java.util.*;
public class readAndList {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine().trim();
      
        Scanner read = new Scanner(new File(fileName));
        String fileToString = read.useDelimiter("\\Z").next().replaceAll("\\W", " "); 
        
        ArrayList<String> words = new ArrayList<>(Arrays.asList(fileToString.split("\\s+")));
        TreeSet<String> distinct = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER); 
        words.forEach(word -> distinct.add(word));

        Iterator iterator = distinct.iterator();

        System.out.println("Display words in alphabetical order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
