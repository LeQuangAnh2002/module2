package codegym.com.baitap;



public class BinarySearch {
    public static int binarySearch(int array[], int x, int low , int high){
        if (high >= low){
            int mid = low + (high - low) / 2;
            if (array[mid] == x){
                return  mid;
            }
            if(array[mid] > x){
                return binarySearch(array, x, low, mid - 1);

            }else{
                return binarySearch(array, x, mid + 1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int length = arr.length;
        int x = 8 ;
        int result = ob.binarySearch(arr,x,0,length-1);
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Element found at index " + result);
        }
        }
    }

