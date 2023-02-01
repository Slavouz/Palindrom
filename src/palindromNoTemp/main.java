package palindromNoTemp;

/**
 *
 * @author davinky
 */
public class main {
    public boolean isPalindrom(String txt) {
//        System.out.println(txt.length());
        for (int i = 0; i < txt.length() / 2; i++) {
            if (txt.charAt(i) != txt.charAt(txt.length() - i - 1)) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
    
    void testPal() {
        //true
        isPalindrom("ada");
        isPalindrom("kasurrusak");
        isPalindrom("kamissimak");
        
        //false
        isPalindrom("ad");
        isPalindrom("gaada");
        isPalindrom("amimir");
    }
    
    public static void main(String[] args) {
        main mn = new main();
        mn.testPal();
    }
}
