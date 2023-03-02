class Sorting{
    void Sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int pos = i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[pos])
                    pos = j;
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }

    }
}

public class Main {
    public static void main(String[] args) {

        int arr[] = {32,2,1,4,65,32};

        Sorting c = new Sorting();

        c.Sort(arr,arr.length);

        for(int i = 0; i < arr.length  ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}