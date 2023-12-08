# <center> Exercise


# <center> <div style="width: 370px;"> ![Exercise](pictures/Exercise.jpg)

### 1.Code Challenge I

Implement breadth-first search in Python on a graph represented as an adjacency list. Return the list of vertices reachable from a starting vertex.


#### solution


---
```python
from collections import deque

def bfs(graph, start):
    visited = set()
    queue = deque([start])
    result = []

    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            visited.add(vertex)
            result.append(vertex)
            queue.extend([neighbor for neighbor in graph[vertex] if neighbor not in visited])

    return result

# Example usage:
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

start_vertex = 'A'
print(bfs(graph, start_vertex))
```
---


### 2.Code Challenge II



Given an unweighted undirected graph and two vertices u and v, write a function in C++ to check if there exists a path between u and v using depth-first search.



#### solution


---
```cpp
#include <iostream>
#include <vector>
#include <unordered_map>
#include <unordered_set>

using namespace std;

bool dfsHasPath(const unordered_map<int, vector<int>>& graph, int current, int target, unordered_set<int>& visited) {
    if (current == target) {
        return true;
    }
    
    visited.insert(current);
    
    for (int neighbor : graph.at(current)) {
        if (visited.find(neighbor) == visited.end()) {
            if (dfsHasPath(graph, neighbor, target, visited)) {
                return true;
            }
        }
    }
    
    return false;
}

bool hasPath(const unordered_map<int, vector<int>>& graph, int u, int v) {
    unordered_set<int> visited;
    return dfsHasPath(graph, u, v, visited);
}

int main() {
    unordered_map<int, vector<int>> graph = {
        {0, {1, 2}},
        {1, {0, 3, 4}},
        {2, {0, 4}},
        {3, {1}},
        {4, {1, 2}}
    };
    
    int u = 0;
    int v = 3;
    
    if (hasPath(graph, u, v)) {
        cout << "Path exists between " << u << " and " << v << endl;
    } else {
        cout << "No path exists between " << u << " and " << v << endl;
    }
    
    return 0;
}
```
---


### 3.Question I


Explain how Dijkstra's algorithm works and what efficiency it achieves for computing single-source shortest paths on a graph with non-negative edge weights. Discuss the role of the priority queue.


#### solution



**Dijkstra's Algorithm:**

- Dijkstra's algorithm is used to find the shortest paths from a source vertex to all other vertices in a weighted graph with non-negative edge weights.
- It maintains a set of vertices with tentative distances from the source and repeatedly selects the vertex with the smallest tentative distance, relaxing its neighbors.
- Efficiency: Dijkstra's algorithm achieves `O(V^2)` time complexity with a simple implementation using a matrix but can be optimized to `O(V log V + E)` using a priority queue (e.g., a min-heap).
- The priority queue is used to efficiently select the vertex with the smallest tentative distance for exploration. It helps reduce the time complexity compared to scanning all vertices each time.
- Bellman-Ford Algorithm and Negative-Weight Cycles:



### 4.Question II


Describe Bellman-Ford algorithm and its capability to detect negative-weight cycles. How does it differ from DAG relaxation? What asymptotic running time does it achieve?


#### solution


**Bellman-Ford Algorithm and Negative-Weight Cycles:**

- Bellman-Ford is used to find the shortest paths from a source vertex to all other vertices in a weighted graph, even when the graph contains negative-weight edges.
- It can detect the presence of negative-weight cycles in the graph. If the algorithm detects a shorter path during its relaxation step after running for `V-1` iterations (`V` is the number of vertices), it indicates the presence of a negative-weight cycle.
- Bellman-Ford differs from DAG relaxation in that it can handle graphs with cycles (including negative-weight cycles), whereas DAG relaxation is specifically for directed acyclic graphs (DAGs).
- The asymptotic running time of Bellman-Ford is `O(V*E)`, where `V` is the number of vertices and `E` is the number of edges.



### 5.Question III


Explain the overall idea behind Johnson's algorithm for all-pairs shortest paths. What is the purpose of the vertex potential function h(v) and reweighting edges? Why does it lead to improved efficiency over repeated applications of Bellman-Ford?




#### solution



**Johnson's Algorithm for All-Pairs Shortest Paths:**

- Johnson's algorithm is used to find the shortest paths between all pairs of vertices in a weighted graph, including graphs with negative edge weights.
- It introduces a vertex potential function `h(v)` to reweight the edges such that all edge weights become non-negative.
- The reweighting involves running Bellman-Ford on the graph with an additional source vertex that is connected to all other vertices with zero-weight edges. The vertex potentials `h(v)` are then computed.
- After reweighting, Dijkstra's algorithm is applied to find the shortest paths between all pairs of vertices efficiently because the edge weights are now non-negative.
- Johnson's algorithm achieves improved efficiency over repeated applications of Bellman-Ford because it avoids running Bellman-Ford for each pair of vertices, reducing the overall time complexity to `O(V^2 log V + VE)`.






