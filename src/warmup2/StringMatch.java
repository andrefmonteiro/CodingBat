package warmup2;

public class StringMatch {
/*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
 */

    public int stringMatch(String a, String b) {
        // iterate through the smallest string
        // get hold of all the length 2 substrings (stopping at length - 1)
        // check if that substring exists on the other string
        // return counter

        if (a.length() < 2 || b.length() < 2){
            return 0;
        }

        int finalCounter = 0;
        int mininumLength = 0;

        if (a.length() <= b.length()){
            mininumLength = a.length();
        } else {
            mininumLength = b.length();
        }

        for (int i = 0; i < mininumLength - 1; i++){

            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
                finalCounter++;
            }
        }
        return finalCounter;
    }
}
