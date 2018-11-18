package testing2;
public class revString {
    public static void main(String[] args) {
        String s = "ACGTA";
        char[] reverse = new char[s.length()];
        for (int i = 0; i < reverse.length; i++) {
            switch (s.charAt(i)) {
                case 'A':
                    reverse[i] = 'T';
                    break;
                case 'T':
                    reverse[i] = 'A';
                    break;
                case 'C':
                    reverse[i] = 'G';
                    break;
                case 'G':
                    reverse[i] = 'C';
                    break;
                default: //handle error here -> invalid char in String
            }
        }
        s = new String(reverse);
        System.out.println(s);
    }
}