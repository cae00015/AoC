import java.util.*;

public class Tokenizer {
    public ArrayList tokenize(String input) {
        String[] pairs = input.split("\\s+");

        int firstLoc = Integer.valueOf(pairs[0]);
        int secondLoc = Integer.valueOf(pairs[1]);

        ArrayList<Integer> pairLoc = new ArrayList<Integer>();

        pairLoc.add(firstLoc);
        pairLoc.add(secondLoc);

        return pairLoc;
    }

}
