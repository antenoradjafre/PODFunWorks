/**
 * Created by Antenor on 26/02/2015.
 */
public class ShellSort extends Sorts{

    public ShellSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doShellSort();
//        showArray(myArray);
    }

    public void doShellSort() {
        diffTime = System.currentTimeMillis();
        int k = 1;
        int length = myArray.length;
        //Calculando k, ou gap
        while(k < length){
            k = k * 3 + 1;
        }
        //Divisão para pegar o valor menor ao tamanho da lista
        k = k / 3;

        int rightHandValue, rightHand, leftHand, leftHandValue;
        while (k > 0) {
            for (int i = k; i < length; i++) {
                rightHandValue = myArray[i];
                rightHand = i;
                leftHand = rightHand - k;
                leftHandValue = myArray[leftHand];
                while (rightHand >= k && leftHandValue > rightHandValue) {
                    myArray[rightHand] = leftHandValue;
                    rightHand = rightHand - k;
                    if(rightHand >= k){
                        leftHand = rightHand - k;
                        leftHandValue = myArray[leftHand];
                    }
                }
                myArray[rightHand] = rightHandValue;
            }
            k = k / 2;
        }
        showDiffTime(diffTime, "ShellSort");
    }
}
