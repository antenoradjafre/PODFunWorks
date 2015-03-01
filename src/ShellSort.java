/**
 * Created by Antenor on 26/02/2015.
 */
public class ShellSort {

    private int [] myArray;
    private long diffTime = 0;

    public ShellSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doShellSort();
//        showArray(myArray);
    }

    public void doShellSort() {
        diffTime = System.currentTimeMillis();
        //TODO
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
