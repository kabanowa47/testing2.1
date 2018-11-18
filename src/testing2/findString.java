package testing2;

public class findString {
    public static void main(String[] args) {
        String s = "123hello123hello123hello123hello";
        String prim = "" +
                "hello";
        int intIndex = s.indexOf(prim); //not used
        int midIndex = s.lastIndexOf(prim); // not used
        int endIndex = s.indexOf(prim) + prim.length();

        int index = s.indexOf(prim) + 1;
        int matchLength = prim.length();
        while (index >= 0) {  // indexOf returns -1 if no match found
            System.out.println(index);
            index = s.indexOf(prim, index + matchLength);
        }

            }
        }