package warmup2;

public class StringX {

    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
     */

    public String stringX(String str) {
        // string to return is a substring of str
        // iterate from index 1 to index length - 2
        // concat if the char at the index isn't x

        if (str.length() <= 2){
            return str;
        }

        String finalString = "";

        for (int i = 1; i < str.length() - 1; i++){

            if (!(str.substring(i, i + 1).equals("x"))){
                finalString += str.substring(i, i + 1);
            }
        }
        return str.substring(0, 1) + finalString+ str.substring(str.length() - 1);
    }
}
