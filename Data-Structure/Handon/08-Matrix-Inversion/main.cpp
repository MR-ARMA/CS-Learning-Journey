#include <iostream>
#include <cmath>

const int MAX = 10;

// Function to calculate the determinant of a 2x2 matrix
double calculateDeterminant2x2(double mat[2][2]) {
    return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
}

// Function to calculate the determinant of a 3x3 matrix
double calculateDeterminant3x3(double mat[3][3]) {
    return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]) -
           mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]) +
           mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
}

// Function to calculate the cofactor matrix
void calculateCofactor(double mat[MAX][MAX], int n, double cofactor[MAX][MAX]) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            double minor[MAX][MAX];
            int minorRow = 0, minorCol = 0;

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (row != i && col != j) {
                        minor[minorRow][minorCol++] = mat[row][col];
                        if (minorCol == n - 1) {
                            minorCol = 0;
                            minorRow++;
                        }
                    }
                }
            }

            cofactor[i][j] = pow(-1, i + j) * calculateDeterminant2x2(minor);
        }
    }
}

// Function to transpose a matrix
void transposeMatrix(double mat[MAX][MAX], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            std::swap(mat[i][j], mat[j][i]);
        }
    }
}

// Function to calculate the inverse of a matrix
bool calculateInverseMatrix(double mat[MAX][MAX], int n, double inverse[MAX][MAX]) {
    double determinant = calculateDeterminant3x3(mat);

    if (determinant == 0) {
        std::cout << "Matrix is singular. Inverse does not exist." << std::endl;
        return false;
    }

    double cofactor[MAX][MAX];
    calculateCofactor(mat, n, cofactor);

    transposeMatrix(cofactor, n);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            inverse[i][j] = cofactor[i][j] / determinant;
        }
    }

    return true;
}

// Function to display a matrix
void displayMatrix(double mat[MAX][MAX], int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            std::cout << mat[i][j] << " ";
        }
        std::cout << std::endl;
    }
}

int main() {
    // Input matrix dimensions
    int n;
    std::cout << "Enter the size of the square matrix (maximum " << MAX << "): ";
    std::cin >> n;

    if (n <= 0 || n > MAX) {
        std::cout << "Invalid matrix size." << std::endl;
        return 1; // Exit with an error code
    }

    // Input matrix elements
    double matrix[MAX][MAX];
    std::cout << "Enter the elements of the square matrix:" << std::endl;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            std::cin >> matrix[i][j];

    // Calculate and display the inverse matrix
    double inverseMatrix[MAX][MAX];
    if (calculateInverseMatrix(matrix, n, inverseMatrix)) {
        std::cout << "\nInverse Matrix:" << std::endl;
        displayMatrix(inverseMatrix, n, n);
    }

    return 0; // Exit successfully
}
