#include<bits/stdc++.h>
using namespace std;

class MaxHeap {
   vector<int> heap;

public:
   void Insert(int x) {
       heap.push_back(x);
       int i = heap.size() - 1;
       while(i != 0 && heap[i] > heap[(i-1)/2]) {
           swap(heap[i], heap[(i-1)/2]);
           i = (i-1)/2;
       }
   }

   int ExtractMax() {
       int max = heap[0];
       heap[0] = heap[heap.size()-1];
       heap.pop_back();
       maxHeapify(0);
       return max;
   }

   int GetMax() {
       return heap[0];
   }

private:
   void maxHeapify(int i) {
       int l = 2*i + 1;
       int r = 2*i + 2;
       int largest = i;
       if(l < heap.size() && heap[l] > heap[largest]) largest = l;
       if(r < heap.size() && heap[r] > heap[largest]) largest = r;
       if(largest != i) {
           swap(heap[i], heap[largest]);
           maxHeapify(largest);
       }
   }
};