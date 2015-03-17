/**
 * Created by Antenor on 16/03/2015.
 */
public class CountingSort extends Sorts {
    int min = 999999999;
    int max = 0;
    public CountingSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doCountingSort();
//        showArray(myArray);
    }

    public void doCountingSort() {
        diffTime = System.currentTimeMillis();
        setMinAndMaxValues();
        int[] count= new int[max - min + 1];
        for(int number : myArray){
            count[number - min]++;
        }
        int index= 0;
        for(int i= min;i <= max;i++){
            while(count[i - min] > 0){
                myArray[index]= i;
                index++;
                count[i - min]--;
            }
        }
        showDiffTime(diffTime, "CountingSort");
    }

    public void setMinAndMaxValues() {
        for(int number=0; number < myArray.length; number++){
            if(myArray[number] > max){
                max = myArray[number];
            }
            if(myArray[number] < min){
                min = myArray[number];
            }
        }
    }
}
