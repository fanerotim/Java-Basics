import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<String> teas = new ArrayList<String>();

        teas.add("mint");
        teas.add("lavender");
        teas.add("green tea");
        teas.add("chamomile");

        Collections.sort(teas);

//        System.out.println(teas);
//
//        for (String tea : teas) {
//            System.out.println(tea);
//        }

        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();
        luckyNumbers.add(1);
        luckyNumbers.add(333);
        luckyNumbers.add(25);
        luckyNumbers.add(99);
        luckyNumbers.add(4);

//        Collections.sort(luckyNumbers, Collections.reverseOrder());
        Collections.sort(luckyNumbers); // this is a longer variant, but end goal is the same
        Collections.reverse(luckyNumbers);

        for (int i = 0; i < luckyNumbers.size(); i++) {
            System.out.println(luckyNumbers.get(i));
        }



    }

}
