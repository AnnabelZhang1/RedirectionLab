import java.util.*;

public class PigLatin{

  private static String vowels = "aeiou";

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    String char0 = s.substring(0,1);
    if (vowels.contains(char0))
      return s + "hay";
    else
      return s.substring(1, s.length()) + char0 + "ay";
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    String char0 = s.substring(0,1);
    String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                          "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                          "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                          "tr", "tw", "wh", "wr"};
    if (s.length() <= 2)
      return s + "hay";
    for (String element : diagraphs){
      if (element.contains(s.substring(0,2)))
        return s.substring(2, s.length()) + s.substring(0,2) + "ay";
      else if (vowels.contains(s.substring(0,1)))
        return s + "hay";
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (!Character.isLetter(s.charAt(0)))
      return s;
    int lastIndex = s.length() - 1;
    char lastElement = s.charAt(s.length() - 1);
    if (!Character.isLetter(lastElement))
      return pigLatin(s.substring(0, lastIndex)) + lastElement;
    return pigLatin(s);
  }

  public static void main(String[] args){
/*
    System.out.println("PigLatinSimple tests:");
    System.out.println(pigLatinSimple("Mock")); //ockmay
    System.out.println(pigLatinSimple("pie")); //iepay
    System.out.println(pigLatinSimple("david")); //avidday
    System.out.println(pigLatinSimple("aaron")); //aaronhay

    System.out.println();

    System.out.println("pigLatin tests:");
    System.out.println(pigLatin("tHe")); //ethay
    System.out.println(pigLatin("check")); //eckchay
    System.out.println(pigLatin("skee")); //eeskay
    System.out.println(pigLatin("emu")); //emuhay
    System.out.println(pigLatin("grade")); //adegray

    System.out.println();

    System.out.println("pigLatinBest tests:");
    System.out.println(pigLatinBest("*emu")); //*emu
    System.out.println(pigLatinBest("4chan")); //4chan
    System.out.println(pigLatinBest("fish!")); //ishfay!
    System.out.println(pigLatinBest("fish")); //ishfay
    System.out.println(pigLatinBest("the.")); //ethay.
    System.out.println(pigLatinBest("cat!")); //atcay!
    System.out.println(pigLatinBest("amazing?")); //amazinghay?
    System.out.println(pigLatinBest("apple%")); //applehay%
*/
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String line = n.nextLine();
      Scanner linescan = new Scanner(line);

      while (linescan.hasNext()){
        String s = linescan.next();
        System.out.print(pigLatinBest(s));
        if (linescan.hasNext())
          System.out.print(" ");
      }
      if (n.hasNextLine())
        System.out.println();
    }
  }
}

// command: java PigLatin < book.txt
// command: cat book.txt | java PigLatin
