#include <iostream>

// Recursive function to calculate combinations (nCr)
int combination(int n, int r) {
    // Base cases
    if (r == 0 || r == n) {
        return 1;
    } else {
        // Recursive formula for combinations
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}

int main() {
    // Input values for n and r
    int n, r;
    
    // Get user input
    std::cout << "Enter the value of n: ";
    std::cin >> n;
    
    std::cout << "Enter the value of r: ";
    std::cin >> r;

    // Check if n is greater than or equal to r
    if (n < r) {
        std::cout << "Invalid input. n must be greater than or equal to r." << std::endl;
        return 1; // Exit with an error code
    }

    // Calculate and display the result
    std::cout << "The number of ways to choose a subset of " << r << " elements from a set of "
              << n << " elements is: " << combination(n, r) << std::endl;

    return 0; // Exit successfully
}
