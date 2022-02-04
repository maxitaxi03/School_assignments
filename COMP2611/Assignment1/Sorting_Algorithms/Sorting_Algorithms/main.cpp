//
//  main.cpp
//  Sorting_Algorithms
//
//  Created by Maximus Boxill on 31/01/2022.
//

#include <iostream>
#include "Assign01.h"
using namespace std;

int main(int argc, const char * argv[]) {
    
    // need to create more test cases for selection sort
    int arr[] = {5, 3, 6, 4, 7, 9, 11, 2, 1};
    int length = sizeof(arr) / sizeof(arr[0]);
    
//    selectionSort(arr, length);
//    for (int i = 0; i < length; i++) {
//        cout << arr[i] << " ";
//    }
    
    // need to create more test cases for insertion sort
    
//    insertion_sort(arr, length);
//    for (int i = 0; i < length; i++) {
//        cout << arr[i] << " ";
//    }
    
//    quickSort(arr, length);
//    for (int i = 0; i < length; i++) {
//        cout << arr[i] << " ";
//    }
//    mergeSort(arr, length);
//
//    for (int i = 0; i < length - 1; i++) {
//        cout << arr[i] << " ";
//    }
    bucketSort(arr, length);
    
    for (int i = 0; i < length; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
