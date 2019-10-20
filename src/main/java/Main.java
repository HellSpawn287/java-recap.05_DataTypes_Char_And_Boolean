public class Main {
    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = 'A';
        char myChar2 = '\u00A9';

        System.out.println("Unicode(00A9) output was: " + myChar2);

        //Exercise
        char registeredSymbol = '\u00AE';
        System.out.println("Unicode(00AE) output was: " + registeredSymbol);

        boolean myBoolean = false;
        boolean isMale = true;
    }
}
