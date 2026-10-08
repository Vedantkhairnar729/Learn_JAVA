public class Anonymous {

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String [] args) {
        printArray(new int [] {11, 22, 33, 44}); // passing anonymous array to method
    }
}

