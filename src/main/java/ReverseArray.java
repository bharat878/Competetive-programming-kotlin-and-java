public class ReverseArray {

    public void reverse(int[] mArray){
        int temp;
        int n = mArray.length - 1;

        for (int i = 0; i < n/2; i++){
            temp = mArray[i];
            mArray[i] = mArray[n-i];
            mArray[n-i] = temp;
        }

        printArray(mArray);
    }

    public void printArray(int[] mArray){
        for(int i = 0; i< mArray.length; i++){
            System.out.println(mArray[i]);
        }
    }

    public static void main(String args[]) {
        int[] myArray = new int[] {1,0,8,5,6};

        ReverseArray ReverseArray = new ReverseArray();

        ReverseArray.reverse(myArray);
    }
}