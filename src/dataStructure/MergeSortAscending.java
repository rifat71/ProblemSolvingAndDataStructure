package dataStructure;

public class MergeSortAscending {
    static void printArray(int[] ary) {
        for (int j : ary) System.out.print(j + " ");
        System.out.println();
    }
    public void sort(int[] ary, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(ary, left, mid);
        sort(ary, mid + 1, right);
        merge(ary, left, mid, right);
    }

    public void merge(int[] ary, int left, int mid, int right) {
        // For an array of 6 elements. left = 0, mid = 0+(5-0)/2 = 2.5 = 2, right = 5.
        // left_size => 2 - 0 = 2, but the left array size should be three, since we start counting the array from index from 0, we add 1 with the result.
        // However, for the right_size => 5-2 = 3.
        int left_size, right_size;
        left_size = mid - left + 1;
        right_size = right - mid;

        int[] leftArray = new int[left_size];
        int[] rightArray = new int[right_size];
        for (int i = 0; i < left_size; ++i) leftArray[i] = ary[left + i];
        // here mid+1, because we divide the array into two part, since, first part => 0 to mid, so, second part => mid+1 to most right index
        for (int j = 0; j < right_size; ++j) rightArray[j] = ary[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < left_size && j < right_size) {
            if (leftArray[i] <= rightArray[j]) {
                ary[k] = leftArray[i];
                i++;
            } else {
                ary[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // after comparing all the elements from the both arrays (left and right), if there are extra elements in the LEFT array,
        // we don't need to compare them as there are no elements left to compare in the right array. Just copy them.
        while (i < left_size) {
            ary[k] = leftArray[i];
            i++;
            k++;
        }

        // after comparing all the elements from the both arrays (left and right), if there are extra elements in the RIGHT array,
        // we don't need to compare them as there are no elements left to compare in the left array. Just copy them.
        while (j < right_size) {
            ary[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] ary = {56, 8, 95, 15, 60, 2};
        MergeSortAscending mergeSort = new MergeSortAscending();
        System.out.println("Given Array");
        MergeSortAscending.printArray(ary);
        mergeSort.sort(ary, 0, ary.length - 1);
        System.out.println("\nSorted array in ascending order");
        MergeSortAscending.printArray(ary);
    }
}
