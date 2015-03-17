/**
 * Created by Antenor on 16/03/2015.
 */
public class MergeSort extends Sorts {

    private int start;
    private int end;

    public MergeSort(int[] myArray){
        this.myArray = myArray;
        this.start = 0;
        this.end = myArray.length-1;
//        showArray(myArray);
        doMergeSort();
//        showArray(myArray);
    }

    public void doMergeSort() {
        diffTime = System.currentTimeMillis();
        mergeSort(start, end);
        showDiffTime(diffTime, "MergeSort");
    }

    private void mergeSort(int start, int end) {
        if (end <= start) {
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);
        int[] middleToStart = getMiddleToStartArray(start, middle);
        int[] endToMiddle = getEndToMiddleArray(end, middle);
        int i = 0;
        int j = 0;
        for (int k = start; k <= end; k++) {
            if (i < middleToStart.length && j < endToMiddle.length) {
                if (middleToStart[i] < endToMiddle[j]) {
                    myArray[k] = middleToStart[i++];
                } else {
                    myArray[k] = endToMiddle[j++];
                }
            } else if (i < middleToStart.length) {
                myArray[k] = middleToStart[i++];
            } else if (j < endToMiddle.length) {
                myArray[k] = endToMiddle[j++];
            }
        }
    }

    private int[] getMiddleToStartArray(int start, int middle) {
        int[] middleToStart = new int[middle - start + 1];
        for (int i = 0; i <= middle - start; i++) {
            middleToStart[i] = myArray[start + i];
        }
        return middleToStart;
    }

    private int[] getEndToMiddleArray(int end, int middle) {
        int[] endToMiddle = new int[end - middle];
        for (int i = 0; i <= end - middle - 1; i++) {
            endToMiddle[i] = myArray[middle + 1 + i];
        }
        return endToMiddle;
    }
}
