/**
 * Created by Antenor on 26/02/2015.
 */
public class Main {
    public static void main(String args[]){
        SortArrays arrays = new SortArrays();
        //Show BubbleSort
        int [] ten = setArrayValues(arrays.getListOfTen());
        int [] hundreds = setArrayValues(arrays.getListOfHundreds());
        int [] thousands = setArrayValues(arrays.getListOfThousands());
        int [] tenThousands = setArrayValues(arrays.getListOfTenThousands());
        new BubbleSort(ten);
        new BubbleSort(hundreds);
        new BubbleSort(thousands);
        new BubbleSort(tenThousands);
        //Show InsertionSort
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        ten = setArrayValues(arrays.getListOfTen());
        hundreds = setArrayValues(arrays.getListOfHundreds());
        thousands = setArrayValues(arrays.getListOfThousands());
        tenThousands = setArrayValues(arrays.getListOfTenThousands());
        new InsertionSort(ten);
        new InsertionSort(hundreds);
        new InsertionSort(thousands);
        new InsertionSort(tenThousands);
        //Show SelectionSort
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        ten = setArrayValues(arrays.getListOfTen());
        hundreds = setArrayValues(arrays.getListOfHundreds());
        thousands = setArrayValues(arrays.getListOfThousands());
        tenThousands = setArrayValues(arrays.getListOfTenThousands());
        new SelectionSort(ten);
        new SelectionSort(hundreds);
        new SelectionSort(thousands);
        new SelectionSort(tenThousands);
        //Show ShellSort
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        ten = setArrayValues(arrays.getListOfTen());
        hundreds = setArrayValues(arrays.getListOfHundreds());
        thousands = setArrayValues(arrays.getListOfThousands());
        tenThousands = setArrayValues(arrays.getListOfTenThousands());
        new ShellSort(ten);
        new ShellSort(hundreds);
        new ShellSort(thousands);
        new ShellSort(tenThousands);
    }

    public static int [] setArrayValues(int [] myArray){
        int [] array = new int[myArray.length];
        //Mesma coisa de fazer um for, percorrer o array, e settar cada valor correspondente daquela posição
        System.arraycopy(myArray, 0, array, 0, myArray.length);
        return array;
    }
}
