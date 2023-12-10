#include <iostream>
#include <unordered_map>
#include <chrono>

using namespace std;

// Recursive Fibonacci function
int fibonacci(long int n){
	if (n <= 1){
		return n;
	}
	return fibonacci(n-1) + fibonacci(n-2);
}

// Efficient Fibonacci function using memoization
std::unordered_map<int, long long> d = {{1, 1}, {2, 2}};
long long fib_efficient(int n) {
  if (d.find(n) != d.end()) {
      return d[n];
  } else {
      long long ans = fib_efficient(n - 1) + fib_efficient(n - 2);
      d[n] = ans;
      return ans;
  }
}

int main() {
	auto start = std::chrono::high_resolution_clock::now();
	cout << "Recursive Fibonacci 40: " << fibonacci(40) << endl;
	auto stop = std::chrono::high_resolution_clock::now();
	auto duration = std::chrono::duration<double, std::milli>(stop - start);
	std::cout << "Time taken by recursive function: " << duration.count() << " ms" << std::endl;

	start = std::chrono::high_resolution_clock::now();
	cout << "Efficient Fibonacci 40: " << fib_efficient(40) << endl;
	stop = std::chrono::high_resolution_clock::now();
	duration = std::chrono::duration<double, std::milli>(stop - start);
	std::cout << "Time taken by efficient function: " << duration.count() << " ms" << std::endl;

	return 0;
}
