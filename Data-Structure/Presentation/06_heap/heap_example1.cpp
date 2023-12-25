#include <iostream>
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

   int getMax() {
       return arr[0];
   }

   int extractMax() {
       if (heapSize == 0) {
           cout << "\n Heap is empty";
           return INT_MAX;
       }
       if (heapSize == 1) {
           heapSize--;
           return arr[0];
       }
       int root = arr[0];
       arr[0] = arr[heapSize - 1];
       heapSize--;
       MaxHeapify(0);
       return root;
   }

   void MaxHeapify(int i) {
       int l = lChild(i);
       int r = rChild(i);
       int largest = i;
       if (l < heapSize && arr[l] > arr[i])
           largest = l;
       if (r < heapSize && arr[r] > arr[largest])
           largest = r;
       if (largest != i) {
           swap(arr[i], arr[largest]);
           MaxHeapify(largest);
       }
   }
};

int main() {
   MaxHeap h(15);
   h.insertKey(3);
   h.insertKey(10);
   h.insertKey(12);
   h.insertKey(8);
   h.insertKey(2);
   h.insertKey(14);
   cout << "The current maximum element is " << h.getMax() << "\n";
   h.extractMax();
   cout << "After extracting the maximum element, the maximum element is now " << h.getMax() << "\n";
   return 0;
}
