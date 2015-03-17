/**
 * Created by Antenor on 16/03/2015.
 */
public class FlaggedBubbleSort extends Sorts{

    public FlaggedBubbleSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doBubbleSort();
//        showArray(myArray);
    }

    public void doBubbleSort() {
        boolean flag=true;
        diffTime = System.currentTimeMillis();
        int repeat=myArray.length-1;
        while(repeat != 0 && flag) {
            flag = false;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    tradeValues(i);
                    flag = true;
                }
            }
            repeat--;
        }
        showDiffTime(diffTime, "FlaggedBubbleSort");
    }

    private void tradeValues(int i) {
        int aux;
        aux = myArray[i+1];
        myArray[i+1] = myArray[i];
        myArray[i] = aux;
    }

}
