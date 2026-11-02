import java.util.Arrays;

public class Array {
    public static int[] myArray = new int[10];

    public static void main(String[] args) {
        // add a few elements
        Array.insert(5);
        Array.insert(4);
        Array.insert(1); // returns, does not add 0;
        // print the indexes of a few elements
        System.out.println(Array.indexOf(5));
        System.out.println(Array.indexOf(1));
        // print the whole array listing its elements
        System.out.println(Arrays.toString(myArray));
    }

    static void insert(int item) {
        // item (number) must be bigger than 0 to be inserted into the array
        if (item == 0) {
            return;
        }

        // add the item (number) to the array
       for (int i = 0; i < myArray.length; i++) {
           if (myArray[i] == 0) {
               myArray[i] = item;
               break; // break the loop immediately after the item is added
           }
       }
    }

    public static void removeAt(int index) {
        myArray[index] = 0; // replace the value of the element at the specified index with 0;
    }

    static int indexOf(int item) {
        // first sort the array (required for a binarySearch to be performed)
        Arrays.sort(myArray);
        // return the result of the search
        return Arrays.binarySearch(myArray, item);
    }
}


