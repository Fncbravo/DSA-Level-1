public class copyArray {

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {
        int[] arr;

        arr = new int[5];
        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 59;
        arr[3] = 67;
        arr[4] = 98;

        int[] two = arr;
        two[2] = 590;

        swap(arr, 0, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        for (int i = 0; i < two.length; i++) {
//            System.out.println(two[i]);
//        }
    }
}

// 3 implications 1.performance - use any it will be fast 2.assignment - shallow copy 3.function call - shallow copy
