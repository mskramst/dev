public class StringExamples {
  public static void main (String [] args) {  
    sout(countCharacters("this is something else", "e"));
  }

  public static int countCharacters(String str, String c) {
    int count = 0;

    for (int i=0; i < str.length(); i ++) {
      if (c.equals(str.substring(i,i+1))) {
        count++;
      }
    }
    return count;
  }

  public static void sout(int s) {
    System.out.println(s);
  }
}
