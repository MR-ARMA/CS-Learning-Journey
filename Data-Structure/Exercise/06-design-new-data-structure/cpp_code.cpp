#include <iostream>

class DoubleDynamicArray {
private:
    int *frontArray;
    int *backArray;
    int frontSize;
    int backSize;
    int frontCapacity;
    int backCapacity;

public:
    DoubleDynamicArray() {
        frontSize = 0;
        backSize = 0;
        frontCapacity = 1;
        backCapacity = 1;
        frontArray = new int[frontCapacity];
        backArray = new int[backCapacity];
    }

    void insertFront(int value) {
        if (frontSize == frontCapacity) {
            frontCapacity *= 2;
            int *temp = new int[frontCapacity];
            for (int i = 0; i < frontSize; i++) {
                temp[i] = frontArray[i];
            }
            delete[] frontArray;
            frontArray = temp;
        }
        frontArray[frontSize] = value;
        frontSize++;
    }

    void insertBack(int value) {
        if (backSize == backCapacity) {
            backCapacity *= 2;
            int *temp = new int[backCapacity];
            for (int i = 0; i < backSize; i++) {
                temp[i] = backArray[i];
            }
            delete[] backArray;
            backArray = temp;
        }
        backArray[backSize] = value;
        backSize++;
    }

    void removeFront() {
        if (frontSize == 0) {
            std::cout << "No element to remove from the front.\n";
            return;
        }
        frontSize--;
    }

    void removeBack() {
        if (backSize == 0) {
            std::cout << "No element to remove from the back.\n";
            return;
        }
        backSize--;
    }

    int getFront(int index) {
        if (index >= frontSize || index < 0) {
            std::cout << "Invalid index.\n";
            return -1;
        }
        return frontArray[frontSize - 1 - index];
    }

    int getBack(int index) {
        if (index >= backSize || index < 0) {
            std::cout << "Invalid index.\n";
            return -1;
        }
        return backArray[index];
    }
};


int main() {
    DoubleDynamicArray arr;

    // Insert elements at the front and back
    arr.insertFront(1);
    arr.insertBack(2);
    arr.insertFront(3);
    arr.insertBack(4);

    // Display elements at the front and back
    std::cout << "Front element at index 0: " << arr.getFront(0) << std::endl;   // Output: 3
    std::cout << "Front element at index 1: " << arr.getFront(1) << std::endl;   // Output: 1
    std::cout << "Back element at index 0: " << arr.getBack(0) << std::endl;     // Output: 2
    std::cout << "Back element at index 1: " << arr.getBack(1) << std::endl;     // Output: 4

    // Remove elements from the front and back
    arr.removeFront();
    arr.removeBack();

    // Display elements at the front and back
    std::cout << "Front element at index 0: " << arr.getFront(0) << std::endl;   // Output: 1
    std::cout << "Back element at index 0: " << arr.getBack(0) << std::endl;     // Output: 2

    return 0;
}

