public class merge {

    public static void mergeSort(int arr[], int low, int high) {
        

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);

        }
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;
        int left[] = new int[n];
        int right[] = new int[m];
        for (int i = 0; i <n; i++) {
            left[i] = arr[low + i];
            // System.out.print(left[i]+" ");
        }

        for (int j = 0; j < m; j++) {
            right[j] = arr[mid+1+j];
        }
        int a = 0, b = 0, k = low;
        while (a < left.length && b < right.length) {
            if (left[a] <= right[b]) {
                arr[k] = left[a];
                a++;
                k++;
            } else {
                arr[k] = right[b];
                b++;
                k++;
            }
        }
        while (a < left.length) {
            arr[k] = left[a];
            a++;
            k++;
        }
        while (b < right.length) {
            arr[k] = right[b];
            b++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
