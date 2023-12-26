package warmup2;

public class CountXx {
    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
     */

    static int countXX(String str) {
        // check if a certain char is X
        // check if next char is also X
        // if so, increment numberOfXx

        int numberOfXx = 0;

        for (int i = 0; i < str.length() - 1; i++){ // iterate through each char

            if ((str.substring(i, i+1).equalsIgnoreCase("x")) && (str.substring(i+1, i+2).equalsIgnoreCase("x"))){
                numberOfXx++;
            }
        }
        return numberOfXx;
    }
}
