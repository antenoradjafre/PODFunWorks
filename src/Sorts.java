/**
 * Created by Antenor on 09/03/2015.
 */
public class Sorts {
    protected int [] myArray;
    protected long diffTime = 0;

    protected void showArray(int [] myArray) {
        for(int value : myArray){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    protected long showDiffTime(long initialTime, String sortName) {
        long finalTime = System.currentTimeMillis();
        diffTime = (finalTime - initialTime);
        System.out.println(String.format(sortName + ": Array contendo " + myArray.length + " elementos demorou %02d segundos  e %02d milisegundos", diffTime / 60, diffTime % 60));
        return diffTime;
    }
}
