/**
 * Created by Antenor on 26/02/2015.
 */
public class SortArrays {
    private int [] listOfTen = new int [10];
    private int [] listOfHundreds = new int [100];
    private int [] listOfThousands = new int [1000];
    private int [] listOfTenThousands = new int [10000];
    private int [] listOfHundredThousands = new int [100000];
    private int [] listOfMillion = new int [1000000];
    private int [] listOfFiveMillions = new int [5000000];
    private int [] listOfNineMillions = new int [9000000];
    private int [] listOfFourTeenMillions = new int [14000000];
    private int [] listOfNineTeenMillions = new int [19000000];
    private int [] listOfTwentyFourMillions = new int [24000000];

    public SortArrays(){
        this.setListOfTen(buildRamdomArray(getListOfTen()));
        this.setListOfHundreds(buildRamdomArray(getListOfHundreds()));
        this.setListOfThousands(buildRamdomArray(getListOfThousands()));
        this.setListOfTenThousands(buildRamdomArray(getListOfTenThousands()));
        this.setListOfHundredThousands(buildRamdomArray(getListOfHundredThousands()));
        this.setListOfMillion(buildRamdomArray(getListOfMillion()));
        this.setListOfFiveMillions(buildRamdomArray(getListOfFiveMillions()));
        this.setListOfNineMillions(buildRamdomArray(getListOfNineMillions()));
        this.setListOfFourTeenMillions(buildRamdomArray(getListOfFourTeenMillions()));
        this.setListOfNineTeenMillions(buildRamdomArray(getListOfNineTeenMillions()));
        this.setListOfTwentyFourMillions(buildRamdomArray(getListOfTwentyFourMillions()));
    }

    protected int [] buildArray(int [] myArray) {
        for(int i=0;i<myArray.length;i++){
            int value = myArray.length-i;
            myArray[i] = value;
        }
        return myArray;
    }

    protected int [] buildRamdomArray(int [] myArray) {
        for(int i=0;i<myArray.length;i++){
            int value = (int) (Math.random()*10000);
            myArray[i] = value;
        }
        return myArray;
    }


    public int[] getListOfTen() {
        return listOfTen;
    }

    public void setListOfTen(int[] listOfTen) {
        this.listOfTen = listOfTen;
    }

    public int[] getListOfHundreds() {
        return listOfHundreds;
    }

    public void setListOfHundreds(int[] listOfHundreds) {
        this.listOfHundreds = listOfHundreds;
    }

    public int[] getListOfThousands() {
        return listOfThousands;
    }

    public void setListOfThousands(int[] listOfThousands) {
        this.listOfThousands = listOfThousands;
    }

    public int[] getListOfTenThousands() {
        return listOfTenThousands;
    }

    public void setListOfTenThousands(int[] listOfTenThousands) {
        this.listOfTenThousands = listOfTenThousands;
    }

    public int[] getListOfHundredThousands() {
        return listOfHundredThousands;
    }

    public void setListOfHundredThousands(int[] listOfHundredThousands) {
        this.listOfHundredThousands = listOfHundredThousands;
    }

    public int[] getListOfMillion() {
        return listOfMillion;
    }

    public void setListOfMillion(int[] listOfMillion) {
        this.listOfMillion = listOfMillion;
    }

    public int[] getListOfFiveMillions() {
        return listOfFiveMillions;
    }

    public void setListOfFiveMillions(int[] listOfFiveMillions) {
        this.listOfFiveMillions = listOfFiveMillions;
    }

    public int[] getListOfNineMillions() {
        return listOfNineMillions;
    }

    public void setListOfNineMillions(int[] listOfNineMillions) {
        this.listOfNineMillions = listOfNineMillions;
    }

    public int[] getListOfFourTeenMillions() {
        return listOfFourTeenMillions;
    }

    public void setListOfFourTeenMillions(int[] listOfFourTeenMillions) {
        this.listOfFourTeenMillions = listOfFourTeenMillions;
    }

    public int[] getListOfNineTeenMillions() {
        return listOfNineTeenMillions;
    }

    public void setListOfNineTeenMillions(int[] listOfNineTeenMillions) {
        this.listOfNineTeenMillions = listOfNineTeenMillions;
    }

    public int[] getListOfTwentyFourMillions() {
        return listOfTwentyFourMillions;
    }

    public void setListOfTwentyFourMillions(int[] listOfTwentyFourMillions) {
        this.listOfTwentyFourMillions = listOfTwentyFourMillions;
    }
}
