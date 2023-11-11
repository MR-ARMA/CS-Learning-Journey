#include <iostream>


using namespace std;

int sum(int n){
   // Function to calculate the sum of natural numbers up to n
	if (n==1){
		return 1;
	}
	return n + sum(n-1);
}

int main() {
  int n;
  cout << "Enter a positive integer: ";
  cin >> n;
  cout << "Sum = " << sum(n);
  return 0;
}
