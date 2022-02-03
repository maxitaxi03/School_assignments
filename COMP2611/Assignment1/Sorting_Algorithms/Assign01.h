//
//  Assign01.h
//  Sorting_Algorithms
//
//  Created by Maximus Boxill on 31/01/2022.
//  ID: 400008300
//

#ifndef Assign01_h
#define Assign01_h
// 1 bucket sort
void bucketSort(int table[], int max);

// 2 selection sort
void selectionSort(int table[], int max) {
    for (int i = 0; i < max; i++) {
        for (int j = i + 1; j < max; j++) {
            if (table[j] < table[i]) {
                int temp = table[i];
                table[i] = table[j];
                table[j] = temp;
            }
        }
    }
}

// 3 insertion sort
void insertion_sort(int table[], int max) {
    for (int i = 0; i < max; i++) {
        for (int j = i; j > 0; j--) {
            if (table[j] < table[j-1]) {
                int temp = table[j];
                table[j] = table[j-1];
                table[j-1] = temp;
            }
            
        }
    }
}
// helper method for quicksort
int divider(int arr[], int low, int high) {
    int temp = 0;
    int pivot = arr[high];
    int i = low - 1;
    
    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    
    return (i+1);
}
// helper method for quicksort
void helperSort(int arr[], int low, int high) {
    if (low < high) {
        int pivot = divider(arr, low, high);
        
        // sorting elements from low to the element before pivot
        helperSort(arr, low, pivot - 1);
        // sorting elements from the element after pivot to high
        helperSort(arr, pivot + 1, high);
    }
}

void quickSort(int table[], int max) {
    helperSort(table, 0, max - 1);
}

#endif /* Assign01_h */
