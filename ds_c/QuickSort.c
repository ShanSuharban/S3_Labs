// C program to implement Quick Sort
#include <stdio.h>

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int arr[], int low, int high) {

    // Initialize pivot to be the first element
    int p = arr[low];
    int i = low;
    int j = high;

    while (i < j) {

        // Find the first element greater than
        // the pivot (from starting)
        //getting largest element from the left sub array of pivot inorder to swap
        while (arr[i] <= p && i <= high - 1) { 
            
            i++;
        }

        // Find the first element smaller than
        // the pivot (from last)
        // getting smallest element from the right sub array of pivot inorder to swap
        while (arr[j] > p && j >= low + 1) { // here j>=low+1 is used inorder to avoid comparing with pivot
            j--;
        }
        if (i < j) {
            swap(&arr[i], &arr[j]); // swapping with i and j -> inorder to get "<=pivot pivot >pivot" order  
        }
    } // continuing until i and j crosses , then it is exited from the loop
    // so the j position is actually the correct position of the pivot
    //since we set pivot as arr[low] initially , it need to change with j position.
    swap(&arr[low], &arr[j]); //actual pivot position get from here
    return j; // so from here the array is partitioned into left sub array contains values <=pivot and right sub array contains values greater than pivot in mixed order.
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {

        // call partition function to find Partition Index
        int pi = partition(arr, low, high);

        // Recursively call quickSort() for left and right
        // half based on Partition Index
        //since we already got the pivot position , we dont need to sort it again , so "low to (pi-1)" in left sub array to get their pivot and "(pi+1) to high" for right sub array to get their pivots  
        quickSort(arr, low, pi - 1); // seperately sorting the left sub array (<pivot elements) recursively
        quickSort(arr, pi + 1, high); // seperately sorting the right sub array (>pivot elements) recursively
    }
}

int main() {
  
    
    int n;
    printf ("\nEnter the array size: ");
    scanf("%d",&n);
    int arr[n];
    printf ("\nEnter the elements: ");
    for(int i = 0; i<n;i++)
        scanf("%d",&arr[i]);

    // calling quickSort() to sort the given array
    quickSort(arr, 0, n - 1);
    printf ("\nSorted Array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
