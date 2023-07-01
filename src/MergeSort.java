public class MergeSort {
    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }


    public void mergeSort(int[] ary, int left, int right){

        if(left >= right){
            return;
        }
        int mid = left + (right-left) / 2;

        mergeSort(ary, left, mid);
        mergeSort(ary, mid+1, right);

        merge(ary, left, mid, right);
    }

    public void merge(int[] ary, int left, int mid, int right){

    }
}
