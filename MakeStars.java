import java.util.*;

public class MakeStars{

  public static void main(String[] args){

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
