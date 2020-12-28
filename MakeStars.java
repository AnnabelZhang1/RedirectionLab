import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MakeStars{

  public static void main(String[] args) throws FileNotFoundException{
    System.out.println("ORIGINAL:");
    System.out.println("-------------------------------------");
//    File text = new File(System.in);
    Scanner n = new Scanner(System.in);
    int lineNum = 1;
    while (n.hasNextLine()){
      String line = n.nextLine();
      System.out.println(line);
      lineNum++;
    }

    System.out.println();
    System.out.println("STARRED:");
    System.out.println("-------------------------------------");

    Scanner starred = new Scanner(System.in);
    while (starred.hasNextLine()){
      String line = starred.nextLine();

      Scanner linescan = new Scanner(line);
      while (linescan.hasNext()){
        String s = linescan.next();

        for (int i = 0; i < s.length(); i++)
          System.out.print("*");
        if (linescan.hasNext())
          System.out.print(" ");
      }

      if (starred.hasNextLine())
        System.out.println();

    }
  }
}

// command: java MakeStars < book.txt
// command: cat book.txt | java MakeStars
