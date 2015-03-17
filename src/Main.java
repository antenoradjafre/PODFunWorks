/**
 * Created by Antenor on 26/02/2015.
 */
public class Main {
    static int [] ten;
    static int [] hundreds;
    static int [] thousands;
    static int [] tenThousands;
    static int [] hundredThousands;
    static int [] million;
    public static void main(String args[]){
        SortArrays arrays = new SortArrays();
        //Show BubbleSort
        executeBubbleSort(arrays);
        //Show CountingSort
        executeCountingSort(arrays);
        //Show Flagged BubbleSort
        executeFlaggedBubbleSort(arrays);
        //Show InsertionSort
        executeInsertionSort(arrays);
        //Show MergeSort
        executeMergeSort(arrays);
        //Show QuickSort
        executeQuickSort(arrays);
        //Show SelectionSort
        executeSelectionSort(arrays);
        //Show ShellSort
        executeShellSort(arrays);
    }

    public static void arraysDeclarations(SortArrays arrays) {
        ten = setArrayValues(arrays.getListOfTen());
        hundreds = setArrayValues(arrays.getListOfHundreds());
        thousands = setArrayValues(arrays.getListOfThousands());
        tenThousands = setArrayValues(arrays.getListOfTenThousands());
        hundredThousands = setArrayValues(arrays.getListOfHundredThousands());
        million = setArrayValues(arrays.getListOfMillion());
    }

    public static void executeBubbleSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        new BubbleSort(ten);
        new BubbleSort(hundreds);
        new BubbleSort(thousands);
        new BubbleSort(tenThousands);
//        new BubbleSort(hundredThousands);
//        new BubbleSort(million);
    }

    public static void executeFlaggedBubbleSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new FlaggedBubbleSort(ten);
        new FlaggedBubbleSort(hundreds);
        new FlaggedBubbleSort(thousands);
        new FlaggedBubbleSort(tenThousands);
//        new FlaggedBubbleSort(hundredThousands);
//        new FlaggedBubbleSort(million);
    }

    public static void executeCountingSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new CountingSort(ten);
        new CountingSort(hundreds);
        new CountingSort(thousands);
        new CountingSort(tenThousands);
//        new CountingSort(hundredThousands);
//        new CountingSort(million);
    }

    public static void executeInsertionSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new InsertionSort(ten);
        new InsertionSort(hundreds);
        new InsertionSort(thousands);
        new InsertionSort(tenThousands);
//        new InsertionSort(hundredThousands);
//        new InsertionSort(million);
    }

    private static void executeMergeSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new MergeSort(ten);
        new MergeSort(hundreds);
        new MergeSort(thousands);
        new MergeSort(tenThousands);
//        new MergeSort(hundredThousands);
//        new MergeSort(million);
    }

    private static void executeQuickSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new QuickSort(ten);
        new QuickSort(hundreds);
        new QuickSort(thousands);
        new QuickSort(tenThousands);
//        new QuickSort(hundredThousands);
//        new QuickSort(million);
    }

    public static void executeSelectionSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new SelectionSort(ten);
        new SelectionSort(hundreds);
        new SelectionSort(thousands);
        new SelectionSort(tenThousands);
//        new SelectionSort(hundredThousands);
//        new SelectionSort(million);
    }

    public static void executeShellSort(SortArrays arrays) {
        arraysDeclarations(arrays);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        new ShellSort(ten);
        new ShellSort(hundreds);
        new ShellSort(thousands);
        new ShellSort(tenThousands);
//        new ShellSort(hundredThousands);
//        new ShellSort(million);
    }

    public static int [] setArrayValues(int [] myArray){
        int [] array = new int[myArray.length];
        //Mesma coisa de fazer um for, percorrer o array, e settar cada valor correspondente daquela posição
        System.arraycopy(myArray, 0, array, 0, myArray.length);
        return array;
    }
}
