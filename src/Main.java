/**
 * Created by Antenor on 26/02/2015.
 */
public class Main {
    public static void main(String args[]){
        SortArrays arrays = new SortArrays();
        new BubbleSort(arrays.getListOfTen());
        new BubbleSort(arrays.getListOfHundreds());
        new BubbleSort(arrays.getListOfThousands());
        new BubbleSort(arrays.getListOfTenThousands());
    }
}
