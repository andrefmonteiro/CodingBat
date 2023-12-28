package warmup2;

public class StringBits {

    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */

    public String stringBits(String str) {
        // get hold of every other char
        // concatenate to the final string
        String finalString = "";
        for (int i = 0; i < str.length(); i = i + 2){

            finalString = finalString.concat(str.substring(i, i+1) );
        }
        return finalString;
    }
}
