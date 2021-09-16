public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        // REPLACE WITH YOUR CODE

        int charascii = ch;
        if (charascii > 90){
            //lowercase
            return ch;
        }
        else if (charascii < 65){
            return ch;
        }
        else{
            return (char) ((char) charascii + 32);
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        // REPLACE WITH YOUR CODE HERE
        int upperChar = ch;
        if (upperChar <= 90){
            //lowercase
            return ch;
        }
        else{
            return (char) ((char) upperChar - 32);
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        // REPLACE WITH YOUR CODE
        int ascii_char;
        StringBuilder newStr = new StringBuilder();
        for (int i=0;i<str.length();i++){
            ascii_char = (int) str.charAt(i);
            if (ascii_char < 48 || ascii_char > 57){
                newStr.append(str.charAt(i));
            }
        }
        return String.valueOf(newStr);
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
    }
}
