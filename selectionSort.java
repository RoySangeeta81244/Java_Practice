public class selectionSort {
    static void selectionSort(int[]arr){
        for (int i = 0; i <arr.length-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int smallerNo = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = smallerNo;
        }
    }

    public static void main(String[] args) {
        int[] arr1 ={9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort->");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

            System.out.println();

            selectionSort(arr1);

            System.out.println("After Selection Sort->");

            for (int y : arr1){
                System.out.print(y +" ");
            }


        }
    }

