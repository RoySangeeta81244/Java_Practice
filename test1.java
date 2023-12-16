public class test1 {
//    static int linearSearch(int arr[],int key){
//        for (int i = 0; i <arr.length; i++) {
//            if(key==arr[i]){
//                return i;
//            }
//
//
//        }
//        return -1;
//    }


    static int BinearSearch(int arr[],int key){
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
//int mid=end-start/2;
        while(start<=end){
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        System.out.println(linearSearch(arr,3));
        System.out.println(BinearSearch(arr,10));



        }

        }




