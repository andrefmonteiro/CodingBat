package warmup2;

public class StringSplosion {
/*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
 */

    public String stringSplosion(String str) {
        // #1 char + #1,2 chars + #1,2,3 chars, etc
        // for every new char we advance, print all the chars before, including char at index

        String finalString = "";

        for (int i = 0; i < str.length(); i++){

            finalString = finalString + str.substring(0, i+1);
        }
        return finalString;
    }
}
