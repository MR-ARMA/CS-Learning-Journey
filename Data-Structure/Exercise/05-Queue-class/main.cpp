#include <iostream>
#include <queue>

template <typename T>
class Queue {
private:
    std::queue<T> elements;

public:
    // Function to check if the queue is empty
    bool isEmpty() const {
        return elements.empty();
    }

    // Function to get the size of the queue
    size_t size() const {
        return elements.size();
    }

    // Function to enqueue (push) an element to the back of the queue
    void enqueue(const T& element) {
        elements.push(element);
    }

    // Function to dequeue (pop) the front element from the queue
    void dequeue() {
        if (!isEmpty()) {
            elements.pop();
        } else {
            std::cout << "Queue is empty. Cannot dequeue." << std::endl;
        }
    }

    // Function to get the front element of the queue without removing it
    T front() const {
        if (!isEmpty()) {
            return elements.front();
        } else {
            std::cout << "Queue is empty. No front element." << std::endl;
            // Returning a default-constructed value; consider using exceptions in a real-world scenario
            return T{};
        }
    }

    // Function to display the elements of the queue
    void display() const {
        if (!isEmpty()) {
            std::cout << "Queue Elements:";
            std::queue<T> tempQueue = elements;

            while (!tempQueue.empty()) {
                std::cout << " " << tempQueue.front();
                tempQueue.pop();
            }

            std::cout << std::endl;
        } else {
            std::cout << "Queue is empty." << std::endl;
        }
    }
};

int main() {
    // Example usage of the Queue class
    Queue<int> integerQueue;

    integerQueue.enqueue(10);
    integerQueue.enqueue(20);
    integerQueue.enqueue(30);

    std::cout << "Front element: " << integerQueue.front() << std::endl;

    integerQueue.dequeue();
    integerQueue.display();

    return 0;
}
