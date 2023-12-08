#include <iostream>
#include <algorithm>

const int MAX = 100;

void sortMatrix(int mat[MAX][MAX], int row, int col) {
    // Convert the matrix to a 1D array
    int temp[row * col];
    int k = 0;

    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            temp[k++] = mat[i][j];

    // Sort the 1D array
    std::sort(temp, temp + row * col);

    // Copy the sorted elements back to the matrix
    k = 0;
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            mat[i][j] = temp[k++];
}

void printMatrix(int mat[MAX][MAX], int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++)
            std::cout << mat[i][j] << " ";
        std::cout << std::endl;
    }
}

int main() {
    // Input matrix dimensions
    int row, col;
    std::cout << "Enter the number of rows: ";
    std::cin >> row;
    std::cout << "Enter the number of columns: ";
    std::cin >> col;

    // Input matrix elements
    int matrix[MAX][MAX];
    std::cout << "Enter the elements of the matrix:" << std::endl;
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            std::cin >> matrix[i][j];

    // Sort the matrix
    sortMatrix(matrix, row, col);

    // Display the sorted matrix
    std::cout << "\nSorted Matrix:" << std::endl;
    printMatrix(matrix, row, col);

    return 0;
}
