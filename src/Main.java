/**
 * Created by Antenor on 26/02/2015.
 */
public class Main {
    public static void main(String args[]){
        SortArrays arrays = new SortArrays();

        int [] ten = setArrayValues(arrays.getListOfTen());
        int [] hundreds = setArrayValues(arrays.getListOfHundreds());
        int [] thousands = setArrayValues(arrays.getListOfThousands());
        int [] tenThousands = setArrayValues(arrays.getListOfTenThousands());

        new InsertionSort(ten);
//        new BubbleSort(ten);
//        new BubbleSort(arrays.getListOfHundreds());
//        new BubbleSort(arrays.getListOfThousands());
//        new BubbleSort(arrays.getListOfTenThousands());
    }

    public static int [] setArrayValues(int [] myArray){
        int [] array = new int[myArray.length];
        //Mesma coisa de fazer um for, percorrer o array, e settar cada valor correspondente daquela posição
        System.arraycopy(myArray, 0, array, 0, myArray.length);
        return array;
    }
}
