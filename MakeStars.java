import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MakeStars{

  public static void main(String[] args) throws FileNotFoundException{
    System.out.println("ORIGINAL:");
    System.out.println("-------------------------------------");
    File text = new File ("sonnet.txt");
    Scanner n = new Scanner(text);
    int lineNum = 1;
    while (n.hasNextLine()){
      String line = n.nextLine();
      System.out.println("line " + lineNum + ": " + line);
      lineNum++;
    }

    System.out.println();

  }
}

// command: java MakeStars < book.txt
// command: cat book.txt | java MakeStars
