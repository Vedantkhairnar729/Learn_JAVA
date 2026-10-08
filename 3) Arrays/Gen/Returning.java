/*
Returning Array from the Method

In Java, methods are not limited to returning simple data types or objects;
they can also return arrays. This feature allows for more flexibility in 
method design and enables developers to encapsulate complex logic for generating
arrays within methods.
*/
public class Returning {
    
    static int[] get() {
        return new int[]{10, 20, 30, 40, 60, 50};
    }

    public static void main(String [] args) {

        int arr[] = get();

        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}

// Output

10
20
30
40
60
50