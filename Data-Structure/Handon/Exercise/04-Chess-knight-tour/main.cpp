#include <iostream>
#include <iomanip>
#include <array>
#include <vector>

const int SIZE = 8;

// Function to display the chessboard
void displayChessboard(const std::array<std::array<int, SIZE>, SIZE>& chessboard) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            std::cout << std::setw(3) << chessboard[i][j] << " ";
        }
        std::cout << std::endl;
    }
    std::cout << std::endl;
}

// Function to check if a move is valid
bool isValidMove(int x, int y, const std::array<std::array<int, SIZE>, SIZE>& chessboard) {
    return (x >= 0 && x < SIZE && y >= 0 && y < SIZE && chessboard[x][y] == 0);
}

// Function to find the next valid move for the knight
bool findNextMove(int& x, int& y, int moveNumber, std::array<std::array<int, SIZE>, SIZE>& chessboard) {
    static const std::vector<std::pair<int, int>> possibleMoves = {
        {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
        {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    if (moveNumber == SIZE * SIZE) {
        // All squares are visited
        return true;
    }

    for (const auto& move : possibleMoves) {
        int nextX = x + move.first;
        int nextY = y + move.second;

        if (isValidMove(nextX, nextY, chessboard)) {
            chessboard[nextX][nextY] = moveNumber + 1;

            if (findNextMove(nextX, nextY, moveNumber + 1, chessboard)) {
                return true;
            }

            // Backtrack
            chessboard[nextX][nextY] = 0;
        }
    }

    return false;
}

// Function to start the knight's tour from a given position
void startKnightsTour(int startX, int startY) {
    std::array<std::array<int, SIZE>, SIZE> chessboard = {0};

    chessboard[startX][startY] = 1;

    if (findNextMove(startX, startY, 1, chessboard)) {
        std::cout << "Knight's Tour:\n";
        displayChessboard(chessboard);
    } else {
        std::cout << "No solution exists for the Knight's Tour starting from position (" << startX << ", " << startY << ").\n";
    }
}

int main() {
    int startX, startY;

    // Get starting position from the user
    std::cout << "Enter the starting position for the Knight's Tour (x y): ";
    std::cin >> startX >> startY;

    if (startX < 0 || startX >= SIZE || startY < 0 || startY >= SIZE) {
        std::cout << "Invalid starting position.\n";
        return 1; // Exit with an error code
    }

    // Start the Knight's Tour
    startKnightsTour(startX, startY);

    return 0; // Exit successfully
}
