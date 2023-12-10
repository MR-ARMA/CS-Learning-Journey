#include <iostream>
using namespace std;

int fibonacci(int n){
    // Function to calculate the nth number in the Fibonacci series using recursion
	if (n <= 1){
		return n;
	}
	return fibonacci(n-1) + fibonacci(n-2);
}

int main() {
 int n;
 cout << "Enter a positive integer: ";
 cin >> n;
 cout << "Fibonacci number = " << fibonacci(n);
 return 0;
}
