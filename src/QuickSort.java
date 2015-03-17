/**
 * Created by Antenor on 16/03/2015.
 */
public class QuickSort extends Sorts{

    public QuickSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doQuickSort();
//        showArray(myArray);
    }

    public void doQuickSort() {
        diffTime = System.currentTimeMillis();
        orderingArray(0, myArray.length - 1);
        showDiffTime(diffTime, "QuickSort");
    }

    private void orderingArray(int start, int end) {
        if (start < end) {
            int posicaoPivo = divideArray(start, end);
            orderingArray(start, posicaoPivo - 1);
            orderingArray(posicaoPivo + 1, end);
        }
    }

    private int divideArray(int start, int end) {
        int index = myArray[start];
        int i = start + 1, e = end;
        while (i <= e) {
            if (myArray[i] <= index) {
                i++;
            }else {
                if (index < myArray[e]) {
                    e--;
                }else {
                    tradeValues(i, e);
                    i++;
                    e--;
                }
            }
        }
        myArray[start] = myArray[e];
        myArray[e] = index;
        return e;
    }

    private void tradeValues(int i, int f) {
        int aux;
        aux = myArray[i];
        myArray[i] = myArray[f];
        myArray[f] = aux;
    }

}
