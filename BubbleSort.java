public class BubbleSort {
    static void bubbleSort(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1]>array[j]){
                   int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int arr[]={10,69,15,29,8};
        bubbleSort(arr);
        for(int x:arr)  System.out.print(x+" ");
    }
}
