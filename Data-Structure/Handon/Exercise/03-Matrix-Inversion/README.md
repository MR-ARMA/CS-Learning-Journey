**README.md**

# Matrix Inversion Program

This C++ program calculates the inverse matrix of a given square matrix using the cofactor method.

## How to Use

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/matrix-inversion.git
   cd matrix-inversion
   ```

2. **Compile and Run:**
   ```bash
   g++ matrix_inversion.cpp -o matrix_inversion
   ./matrix_inversion
   ```

3. **Enter Matrix Size and Elements:**
   - Enter the size of the square matrix (maximum 10).
   - Input the elements of the square matrix as prompted.

4. **Output:**
   - The program will display the inverse matrix if it exists, or an error message if the matrix is singular.

## Notes

- Ensure that you have a C++ compiler installed (e.g., g++).
- The program uses the cofactor method to calculate the inverse matrix.
- If the determinant of the matrix is zero, the program indicates that the matrix is singular, and the inverse does not exist.
- Feel free to contribute or report issues!