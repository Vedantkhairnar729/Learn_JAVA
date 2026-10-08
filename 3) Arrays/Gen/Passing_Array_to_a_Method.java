public class Passing_Array_to_a_Method {
    // creating a method which receives an array as a parameter
    static void min(int [] arr) {
        int min = arr[0];
        for (int i = 0; i<arr.length; i++)
        if(min>arr[i])
        min=arr[i];

        System.out.println(min);
    }
    public static void main(String [] args) {
        int [] a  = {33, 22, 44}; // declaring and initializing an array
        min(a); // passing array to method
    }
}

