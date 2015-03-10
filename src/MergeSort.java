/**
 * Created by Antenor on 26/02/2015.
 */
public class MergeSort {

    private int [] myArray;
    private long diffTime = 0;

    public MergeSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doMergeSort();
//        showArray(myArray);
    }

    public void doMergeSort() {
        diffTime = System.currentTimeMillis();
        for(int i=0;i<myArray.length;i++){
            int previousIndex = i - 1;
            int index = i;
            if(i != 0){
                while(previousIndex >= 0){
                    if(shouldTradeValues(myArray[index], myArray[previousIndex])){
                        tradeValues(previousIndex);
                        index--;
                    }
                    previousIndex--;
                }
            }
        }
        showDiffTime(diffTime);
    }

    private boolean shouldTradeValues(int value, int previousValue) {
        return value < previousValue;
    }

    private void tradeValues(int i) {
        int aux;
        aux = myArray[i+1];
        myArray[i+1] = myArray[i];
        myArray[i] = aux;
    }

    protected long showDiffTime(long initialTime) {
        long finalTime = System.currentTimeMillis();
        diffTime = (finalTime - initialTime);
        System.out.println(String.format("Array contendo " + myArray.length + " elementos demorou %02d segundos  e %02d milisegundos", diffTime / 60, diffTime % 60));
        return diffTime;
    }


    protected void showArray(int [] myArray) {
        for(int value : myArray){
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
