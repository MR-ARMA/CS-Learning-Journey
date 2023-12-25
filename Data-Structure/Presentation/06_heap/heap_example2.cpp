#include <iostream>
#include <iomanip>
using namespace std;

class MaxHeap {
private:
  int* arr;
  int maxSize;
  int heapSize;

public:
  MaxHeap(int maxSize) {
      heapSize = 0;
      this->maxSize = maxSize;
      arr = new int[maxSize];
  }

  int parent(int i) {
      return (i - 1) / 2;
  }

  int lChild(int i) {
      return (2 * i + 1);
  }

  int rChild(int i) {
      return (2 * i + 2);
  }

  void insertKey(int x) {
      // Insert the key at the end of the array
      arr[heapSize] = x;
      // Increase the size of the heap
      heapSize++;
      // Heapify the inserted key
      int i = heapSize - 1;
      while (i != 0 && arr[parent(i)] < arr[i]) {
          swap(arr[parent(i)], arr[i]);
          i = parent(i);
      }
  }

  void printHeap() {
      for (int i = 0; i < heapSize; i++)
          cout << setw(5) << arr[i];
      cout << endl;
  }

  // ... rest of the class definition
};

int main() {
  MaxHeap h(15);
  h.insertKey(3);
  h.insertKey(10);
  h.insertKey(12);
  h.insertKey(8);
  h.insertKey(2);
  h.insertKey(14);
  cout << "The current state of the heap is:\n";
  h.printHeap();
  return 0;
}
