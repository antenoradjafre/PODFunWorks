/**
 * Created by Antenor on 26/02/2015.
 */
public class SelectionSort extends Sorts{

    public SelectionSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doSelectionSort();
//        showArray(myArray);
    }

    public void doSelectionSort() {
        diffTime = System.currentTimeMillis();
        int i, j, minIndex;
        int lenght = myArray.length;
        for (i = 0; i < lenght - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < lenght; j++){
                if (myArray[j] < myArray[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tradeValues(i, minIndex);
            }
        }
        showDiffTime(diffTime, "SelectionSort");
    }

    private void tradeValues(int i, int minIndex) {
        int aux;
        aux = myArray[i];
        myArray[i] = myArray[minIndex];
        myArray[minIndex] = aux;
    }

}
