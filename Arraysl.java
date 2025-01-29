public class Arraysl {
    public static void main(String[] args) {
        int[] array = {1,3,2,4,9,5,6};
        int largest = array[0];
        int smallest = array[0];
        for( int num = 0; num < array.length; num++){
            if ( array[num] > largest) {
                largest = array[num];
            }
            if ( array[num] < smallest) {
                smallest = array[num];
            }
        
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}