public class PigLatin{

  private static String vowels = "aeiou";

  public static String pigLatinSimple(String s){
    String char0 = s.substring(0,1);
    if (vowels.contains(char0))
      return s + "hay";
    else
      return s.substring(1, s.length()) + char0 + "ay";
  }

  public static String pigLatin(String s){
    String char0 = s.substring(0,1);
    String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                          "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                          "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                          "tr", "tw", "wh", "wr"};

    for (String element : diagraphs){
      if (s.contains(element))
        return s.substring(2, s.length()) + s.substring(0,2) + "ay";
      else if (vowels.contains(s.substring(0,1)))
        return s + "hay";
    }
    return s.substring(1, s.length()) + char0 + "ay";
  }
/*
  public static String pigLatinBest(String s){

  }
*/

  public static void main(String[] args){
    System.out.println("PigLatinSimple tests:");
    System.out.println(pigLatinSimple("mock")); //ockmay
    System.out.println(pigLatinSimple("pie")); //iepay
    System.out.println(pigLatinSimple("david")); //avidday
    System.out.println(pigLatinSimple("aaron")); //aaronhay

    System.out.println();

    System.out.println("PigLatin tests:");
    System.out.println(pigLatin("the")); //ethay
    System.out.println(pigLatin("check")); //eckchay
    System.out.println(pigLatin("skee")); //eeskay
    System.out.println(pigLatin("emu")); //emuhay
    System.out.println(pigLatin("grade")); //adegray
  }
}

// command: java PigLatin < book.txt
// command: cat book.txt | java PigLatin
