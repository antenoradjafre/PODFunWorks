/**
 * Created by Antenor on 26/02/2015.
 */
public class BubbleSort{

    private int [] myArray;
    private long diffTime = 0;

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
