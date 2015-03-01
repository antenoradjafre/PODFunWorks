/**
 * Created by Antenor on 26/02/2015.
 */
public class SelectionSort {

    private int [] myArray;
    private long diffTime = 0;

    public SelectionSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doSelectionSort();
//        showArray(myArray);
    }

    public void doSelectionSort() {
        diffTime = System.currentTimeMillis();
        for(int i=0;i<myArray.length-1;i++){

        }
        showDiffTime(diffTime);
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
