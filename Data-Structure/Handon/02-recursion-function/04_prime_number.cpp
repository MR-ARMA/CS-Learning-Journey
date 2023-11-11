#include <iostream>


using namespace std;

bool isPrime(int n, int i = 2) {
    // Function to check if a number is prime using recursion
  if (n <= 2) {
      return (n == 2) ? true : false;
  } else if (n % i == 0) {
      return false;
  } else if (i * i > n) {
      return true;
  } else {
      return isPrime(n, i + 1);
  }
}

int main() {
  int n;
  cout << "Enter a positive integer: ";
  cin >> n;
  isPrime(n) ? cout << "Is Prime\n" : cout << "Is Not Prime\n";
  return 0;
}
