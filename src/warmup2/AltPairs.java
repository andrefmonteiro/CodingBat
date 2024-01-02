package warmup2;

public class AltPairs {
    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */

    public String altPairs(String str) {
        // loop through the str, incrementing 4

        if (str.length() <= 2){
            return str;
        }

        String finalWord = "";

        for (int i = 0; i < str.length(); i += 4){

            if (i != str.length() - 1){
                finalWord += str.substring(i, i + 2);
            } else {
                finalWord += str.substring(i);
            }
        }
        return finalWord;
    }
}
