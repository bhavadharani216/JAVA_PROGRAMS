package sorting;

class Quick_Sort  {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int l, int h) {

        int pivot = arr[l];
        int i = l;
        int j = h;

        do {

            do {
                i++;
            } while (arr[i] <= pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i < j) {
                swap(arr, i, j);
            }

        } while (i < j);

        swap(arr, l, j);

        return j;
    }

    static void quickSort(int[] arr, int l, int h) {

        if (l < h) {

            int j = partition(arr, l, h);

            quickSort(arr, l, j);
            quickSort(arr, j + 1, h);
        }
    }

    public static void main(String[] args) {

        int[] arr = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3, Integer.MAX_VALUE};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}