public class Main {
    public static void main(String[] args) {

        //task 1-2
        //part 1
        int [] array = new int [3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        //part 2
        double [] array1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length -1) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }


        //part 3
        byte [] array2 = {3, 5, 7, 9};
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length -1) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        //task 3
        //part 1
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        for (int i = arr.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        //part 2
        double [] arr1 = {1.57, 7.654, 9.986};
        for (int i = arr1.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }

        //part 3
        byte [] arr2 = {3, 5, 7, 9};
        for (int i = arr2.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }

        //task 4
        int [] arrays = new int [3];
        arrays [0] = 1;
        arrays [1] = 2;
        arrays [2] = 3;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i] = arrays[i] + 1;
                if (i == arrays.length - 1) {
                    System.out.println(arrays[i]);
                    break;
                }
            }
            System.out.print(arrays[i] + ", ");
        }
    }
}