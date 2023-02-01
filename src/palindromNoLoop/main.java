package palindromNoLoop;

/**
 *
 * @author davinky
 */
public class main {
    private boolean isPalindromRec(String txt, int i) {
        if (i < txt.length() / 2) {
            if(txt.charAt(i) != txt.charAt(txt.length() - i - 1)) {
                System.out.println("False");
                return false;
            } else {
                isPalindromRec(txt, i+1);
            }
        } else {
            System.out.println("True");
            return true;
        }
        return false;
    }
    
    public boolean isPalindrom(String txt) {        
        return isPalindromRec(txt, 0);
    }
    
    void testPal(){
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
        main ma = new main();
        ma.testPal();
    }
}
