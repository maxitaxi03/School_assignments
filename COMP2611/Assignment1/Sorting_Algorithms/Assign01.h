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
//void bucketSort(int table[],int max) {
//    int largest = table[0];
//    for(int i = 0; i < max; i++) {
//        if(table[i]>largest) {
//            largest = table[i];
//        }
//    }
//
//    int buckets[largest+1];
//    for(int i =0; i < largest+1; i++) {
//        buckets[i] = 0;
//    }
//
//    for(int i = 0;i<max;i++) {
//        buckets[table[i]]++;
//    }
//
//    int j = 0;
//    for(int i = 0; i < largest+1; i++) {
//        if(buckets[i] != 0) {
//            for(int x = 0;x < buckets[i]; x++) {
//                table[j] = i;
//                j++;
//            }
//        }
//    }
//}

//
//void bucketSort(int table[], int max) {
//    int largest = 0;
//
//    for (int i = 0; i < max; i++) {
//        if (table[i] > largest) {
//            largest = table[i];
//        }
//    }
//
//    int buckets[largest++];
//
//    for (int i = 0; i < largest + 1; i++) {
//        buckets[i] = 0;
//    }
//
//    for (int i = 0; i < max; i++) {
//        buckets[table[i]]++;
//    }
//
//    for (int i = 0; i <= max; i++) {
//        while (buckets[i] > 0) {
//            table[j++] = i;
//            buckets[i]--;
//        }
//    }
//}

void bucketSort(int table[], int max)
 {
    int i, j;
    int count[max];
    
    for (i = 0; i < max; i++)
      count[i] = 0;
    
    for (i = 0; i < max; i++)
       (count[table[i]])++;
    
      for (i = 0, j = 0; i < max; i++)
         for(; count[i] > 0; (count[i])--)
            table[j++] = i;
}
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

void merge(int array[], int const low, int const mid, int const high)
{
    int subArrayOne = mid - low + 1;
    int subArrayTwo = high - mid;
  
    
    int lowArray[subArrayOne];
    int highArray[subArrayTwo];
  
    
    for (int i = 0; i < subArrayOne; i++)
        lowArray[i] = array[low + i];
    
    for (int j = 0; j < subArrayTwo; j++)
        highArray[j] = array[mid + 1 + j];
  
    int x = 0,
        y = 0;
    int k = low;
  
    while (x < subArrayOne && y < subArrayTwo) {
        if (lowArray[x] <= highArray[y]) {
            array[k] = lowArray[x];
            x++;
        }
        else {
            array[k] = highArray[y];
            y++;
        }
        k++;
    }
    
    
    while (x < subArrayOne) {
        array[k] = lowArray[x];
        x++;
        k++;
    }
   
    while (y < subArrayTwo) {
        array[k] = highArray[y];
        y++;
        k++;
    }
}
  

void sort(int array[], int const begin, int const end)
{
    if (begin >= end)
        return;
  
    auto mid = begin + (end - begin) / 2;
    sort(array, begin, mid);
    sort(array, mid + 1, end);
    merge(array, begin, mid, end);
}

void mergeSort(int table[], int max) {
    sort(table, 0, max - 1);
}
#endif /* Assign01_h */
