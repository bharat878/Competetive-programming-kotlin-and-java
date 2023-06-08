public class MinimumValue {

    public void minimunValueFromAnArray(int[] mArray){
        int n = mArray.length - 1;
        int temp = mArray[0];

        for (int i = 1; i < n; i++){
            if (temp > mArray[i]){
                temp = mArray[i];
            }
        }

        System.out.println(temp);
    }

    public static void main(String args[]) {
        int[] myArray = new int[] {1,3,8,0,6};

        MinimumValue minimumValue = new MinimumValue();

        minimumValue.minimunValueFromAnArray(myArray);
    }
}