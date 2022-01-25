//
//  lab01.h
//  Lab 1
//
//  Created by Maximus Boxill on 21/01/2022.
//

#ifndef lab01_h
#define lab01_h

using namespace std;
/**
 2 overloaded functions that return the smallest value
 that has been passed as arguments
 */
int smallestValue(int num1, int num2, int num3) {
    int smallestNum = num1;
    
    // num 1 is the smallest value
    if (num1 < num2 && num1 < num3) {
        smallestNum = num1;
    }
    // num 2 is the smallest value
    else if (num2 < num1 && num2 < num3) {
        smallestNum = num2;
    }
    // num 3 is the smallest value
    else if (num3 < num1 && num3 < num1) {
        smallestNum = num3;
    }
    
    return smallestNum;
}
// end of int overloaded function
char smallestValue(char character1, char character2, char character3) {
    char smallestChar = character1;
    
    // num 1 is the smallest value
    if (character1 < character2 && character1 < character3) {
        smallestChar = character1;
    }
    // num 2 is the smallest value
    else if (character2 < character1 && character2 < character3) {
        smallestChar = character2;
    }
    // num 3 is the smallest value
    else if (character3 < character1 && character3 < character1) {
        smallestChar = character3;
    }
    return smallestChar;
}
// end of overloaded functions

/**
 A template function which prints the content of the single parameter which has been passed to it
 */
template <typename Items>
void printContents(Items item) {
    cout << "The item you've added is: " << item << endl;
}
// end of template function

/**
 A default function that accepts 3 integer arguments
 The first 2 are multiplied
 The last 2 added
 The quotient is found by dividing the product by the sum
 */
double findQuotient(int num1, int num2, int num3) {
    double quotient = 0.0;
    double product = 0.0;
    
    product = num1 * num2;
    return quotient = product / (num2 + num3);
}
// end of default function

/**
 2 overloaded inline functions returns the area of a circle
 when the radius is entered as an argument
 */
inline double calculateArea(int radius) {
    const float PI = 3.142f;
    double area = PI * radius * radius;
    return area;
}

inline double calculateArea(float radius) {
    const float PI = 3.142f;
    double area = PI * radius * radius;
    return area;
}
// end of inline functions

/**
 Pointer function which accepts the address of an integer
 and replaces the contents at that address with
 the square of the value at the  address
 */
void findSquare(int &num) {
    int* numPtr = &num;
    cout << "The square is: " << *numPtr * *numPtr << endl;
}
// end of square pointer function

/**
 Pointer function that accepts the address of an integer
 and returns a booleant value if the VALUE at the address
 is even
 */
bool isValueEven(int &num) {
    int* numPtr = &num;
    bool isEven;
    
    return isEven = (*numPtr % 2 == 0) ? true : false;
}
// end of pointer function

/**
 Accepts integer value and returns the memory address
 of the variable
 */
int* memoryAddressReturned(int num) {
    return (&num);
}

/**
 recursive function that accepts 2 integers as arguments
 and returns the product of the 2 numbers
 throught repeated additions
 */
int product(int num1, int num2) { // 2, 3 -> 2, 2 -> 2, 1
    if (num1 == 0 || num2 == 0) {
        return 0;
    }
    if (num2 == 1) {
        return num1;
    }
    return num1 + product(num1, num2 - 1); // 2 + (2 + (2)) = 6 which is right
}
// end of production recursive function

/**
 Recursive function that accepts 2 integers are arguments
 and returns the result of raising the first number
 to the power of the second
 */
int power(int num1, int num2) { // 2, 3 -> 2, 2 ->
    if (num2 == 0) {
        return 1;
    }
    return num1 * power(num1, num2 - 1); // 2 * (2 * (1))
}


#endif /* lab01_h */
