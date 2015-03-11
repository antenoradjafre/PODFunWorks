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

    public SortArrays(){
        this.setListOfTen(buildRamdomArray(getListOfTen()));
        this.setListOfHundreds(buildRamdomArray(getListOfHundreds()));
        this.setListOfThousands(buildRamdomArray(getListOfThousands()));
        this.setListOfTenThousands(buildRamdomArray(getListOfTenThousands()));
        this.setListOfHundredThousands(buildRamdomArray(getListOfHundredThousands()));
        this.setListOfMillion(buildRamdomArray(getListOfMillion()));
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
}
