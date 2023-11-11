#include <iostream>


using namespace std;

unsigned long long factorial(int n){
// Function to calculate the factorial of a number using recursion
	if (n == 0)
		return 1;
	return n * factorial(n-1);
}

int main() {
 int n;
 cout << "Enter a positive integer: ";
 cin >> n;
 cout << "Factorial = " << factorial(n);
 return 0;
}
