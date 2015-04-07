import sun.misc.Sort;

/**
 * Created by ANTENOR on 06/04/2015.
 */
public class HeapSort extends Sorts {
    private int index;

    public HeapSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doHeapSort();
//        showArray(myArray);
    }

    public void doHeapSort() {
        diffTime = System.currentTimeMillis();
        heapify();
        for (int i = index; i > 0; i--) {
            tradeValues(0, i);
            index = index-1;
            maxheap(0);
        }
        showDiffTime(diffTime, "HeapSort");
    }
    /* Function to build a heap */
    public void heapify()
    {
        index = myArray.length-1;
        for (int i = index/2; i >= 0; i--)
            maxheap(i);
    }
    /* Function to swap largest element in heap */
    public void maxheap(int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= index && myArray[left] > myArray[i])
            max = left;
        if (right <= index && myArray[right] > myArray[max])
            max = right;

        if (max != i) {
            tradeValues(i, max);
            maxheap(max);
        }
    }

    /* Function to swap two numbers in an array */
    private void tradeValues(int i, int j) {
        int aux;
        aux = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = aux;
    }
}

