// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        int[] ary = {12, 11, 13, 5, 6, 7};

        MergeSort mergeSort = new MergeSort();
        System.out.println("Given Array");
        MergeSort.printArray(ary);
        mergeSort.mergeSort(ary, 0, ary.length-1);

        System.out.println("\nSorted array");
        MergeSort.printArray(ary);
    }
}