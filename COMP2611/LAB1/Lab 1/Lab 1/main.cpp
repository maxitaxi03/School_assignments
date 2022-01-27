//
//  main.cpp
//  Lab 1
//
//  Created by Maximus Boxill on 21/01/2022.
//

#include <iostream>
#include <iomanip>
#include "lab01.h"

using namespace std;

int main(int argc, const char * argv[]) {
    
    // smallestValue(int, int, int) test complete
    cout << "The smallest number in the list is: " << smallestValue(0, 0, 0) << endl;
    
    // smallestValue(char, char, char) test complete
    cout << "The smallest character in the list is: " << smallestValue('z', 'c', 'b') << endl;
    
    // printContents(Item) test complete
    printContents("Hello");
    
    // findQuotient(int, int, int) test complete
    cout << "The quotient is: " << fixed << setprecision(2) << findQuotient(3, 4, 5) << endl;
    
    // calculateArea(int) test complete
    cout << "The area of the circle is: " << fixed << setprecision(2) << calculateArea(3) << endl;
    
    // calculateArea(float) test complete
    cout << "The area of the circle is (float): " << fixed << setprecision(2) << calculateArea(3.3f) << endl;
    
    // findSquare(&) test is complete
    int number = 6;
    int* number_ptr = &number;
    findSquare(*number_ptr);
    
    
    //isValueEven(&) test complete
    bool isEven = isValueEven(*number_ptr);
    cout << "Is value even? " << isEven << endl;
    
    // memoryAddressReturned(int) has a bug
    int num = 5;
    cout << "Address is: " << memoryAddressReturned(num) << endl;
    
    // product(int, int) test complete
    cout << "The product is: " << product(2, 3) << endl;
    
    // power(int, int) test in progress
    cout << "The power raiseed to the n is: " << power(2, 3) << endl;
    
    return 0;
    
}
