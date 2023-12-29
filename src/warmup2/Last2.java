package warmup2;

public class Last2 {

    public int last2(String str) {
        // grab last 2 chars of str
        // check if lastTwoChars appears elsewhere
        // count the nr of times that happens

        if (str.length() < 2){
            return 0;
        }

        int counter = 0;

        String lastTwoChars = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++){

            if (str.substring(i, i+2).equals(lastTwoChars)){
                counter++;
            }
        }
        return counter;
    }
}
