/**
 * Created by Antenor on 26/02/2015.
 */
public class BubbleSort extends Sorts{

    public BubbleSort(int [] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doBubbleSort();
//        showArray(myArray);
    }

    public void doBubbleSort() {
        diffTime = System.currentTimeMillis();
        int repeat=myArray.length-1;
        while(repeat != 0) {
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    tradeValues(i);
                }
            }
            repeat--;
        }
        showDiffTime(diffTime, "BubbleSort");
    }

    private void tradeValues(int i) {
        int aux;
        aux = myArray[i+1];
        myArray[i+1] = myArray[i];
        myArray[i] = aux;
    }

}
