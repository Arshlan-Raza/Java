 class Sort<T extends Comparable<T>> {
    private T[] arr;

    Sort(T[] arr) {
        this.arr = arr;
    }

    public void sort() {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public void printArray() {
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Main {

    public static void main(String[] args) {

        //  string array and sort it
        String[] stringArr = {"hello", "world", "java", "programming"};
        Sort<String> stringSort = new Sort<>(stringArr);
        stringSort.sort();
        System.out.print("Sorted string array: ");
        stringSort.printArray();

        //  integer array and sort it
        Integer[] intArr = {4, 2, 7, 3, 5};
        Sort<Integer> intSort = new Sort<>(intArr);
        intSort.sort();
        System.out.print("Sorted integer array: ");
        intSort.printArray();

        // double array and sort it
        Double[] doubleArr = {1.2, 3.4, 0.8, 2.1, 5.6};
        Sort<Double> doubleSort = new Sort<>(doubleArr);
        doubleSort.sort();
        System.out.print("Sorted double array: ");
        doubleSort.printArray();
    }
}
