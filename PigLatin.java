public class PigLatin{

  public static String pigLatinSimple(String s){
    String[] vowels = {"a", "e", "i", "o", "u"};
    String vowels1 = "aeiou";
    String char0 = s.substring(0,1);
    if (vowels1.contains(char0))
      return s + "hay";
    else
      return s.substring(1, s.length()) + char0 + "ay";
  }

/*
  public static String pigLatin(String s){

  }

  public static String pigLatinBest(String s){

  }
*/


  public static void main(String[] args){
    System.out.println("PigLatinSimple tests:");
    System.out.println(pigLatinSimple("mock")); //ockmay
    System.out.println(pigLatinSimple("pie")); //iepay
    System.out.println(pigLatinSimple("david")); //avidday
    System.out.println(pigLatinSimple("aaron")); //aaronhay

  }
}
// command: java PigLatin < book.txt
// command: cat book.txt | java PigLatin
