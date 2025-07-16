import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileParser fp = new FileParser();

        ArrayList list = fp.parseFile("day1.txt");

        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();

        Tokenizer tokenizer = new Tokenizer();

        for (int i = 0; i < list.size(); i++) {
            firstList.add((int)tokenizer.tokenize((String)list.get(i)).get(0));
            secondList.add((int)tokenizer.tokenize((String)list.get(i)).get(1));
        }

        Collections.sort(firstList);
        Collections.sort(secondList);

        int differenceBetween = 0;
        int totalDifference = 0;

        for(int j = 0; j < firstList.size(); j++){
            differenceBetween = firstList.get(j) - secondList.get(j);

            if(differenceBetween < 0){
                differenceBetween *= -1;
            }

            totalDifference += differenceBetween;
        }

        System.out.println(totalDifference);



    }
}
