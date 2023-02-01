package palindromBasic;

/**
 *
 * @author davinky
 */
public class main {
    public boolean isPalindrom(String val) {
        String tmp = "";              
        for (int i = val.length(); i > 0; i--) {
            tmp = tmp + val.charAt(i - 1);            
        }        
        if(tmp.equals(val)) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
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
