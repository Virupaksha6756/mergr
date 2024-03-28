public class bubblesort2 {
    public static void main(String[] args) {
        int[] arr = {5,5,4,4,3};
        int temp;
        for(int k = 0;k<arr.length;k++){
        for(int i =1;i<arr.length;i++){
            if (arr[i-1] > arr[i]){
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;



            }
        }
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }

    }
    
}
