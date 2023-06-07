public class RemoveEvenNo{

    public void removeEven(int[] arr){
        int n= arr.length;

        int count = 0;

        for(int i = 0; i< n; i++){
            if (arr[i] % 2 != 0){
                count++;
            }
        }

        int[] temp = new int[count];
        int idx = 0;
        //   System.out.println(n);
        for(int i = 0; i< n; i++){
            if (arr[i] % 2 != 0){
                temp[idx] = arr[i];
                idx++;

            }


        }

        printArray(temp);
    }

    public void printArray(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {
        int[] myArray = new int[] {1,9,3,5,6};

        RemoveEvenNo removeEvenNo = new RemoveEvenNo();
        removeEvenNo.removeEven(myArray);
    }
}