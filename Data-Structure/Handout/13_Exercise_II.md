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


Explain the difference between breadth-first search and depth-first search in terms of the order in which vertices are explored. Discuss an example of when you would prefer to use one over the other.


#### solution


***Difference between Breadth-First Search (BFS) and Depth-First Search (DFS):***

- BFS explores vertices level by level, starting from the source vertex and moving outward, while DFS explores vertices by following a single branch as deeply as possible before backtracking.
- BFS is often preferred when you need to find the shortest path between two vertices because it explores closer vertices first. DFS, on the other hand, might find a path that is not the shortest.
- BFS is useful for tasks like finding connected components, while DFS is useful for tasks like topological sorting or finding strongly connected components in a directed graph.
- Example: Use BFS to find the shortest path in a maze, as it systematically explores all possible paths starting from the entrance.





### 4.Question II



What are some ways to represent a graph in code? Discuss the tradeoffs of an adjacency matrix versus an adjacency list representation in terms of storage requirements and efficiency of different operations.


#### solution

***Ways to Represent a Graph in Code:***

- ***Adjacency Matrix:*** A 2D matrix where each cell (i, j) represents an edge between vertex i and vertex j. Requires `O(V^2)` space, where V is the number of vertices. Efficient for checking if an edge exists between two vertices but not efficient for sparse graphs.
- ***Adjacency List:*** For each vertex, maintain a list of its neighbors. Requires `O(V + E)` space, where `E` is the number of edges. Efficient for sparse graphs and for traversing neighbors of a vertex.
- ***Edge List:*** A simple list of pairs, each representing an edge. Requires `O(E)` space. Useful for minimizing memory usage and when edge information is essential.





### 5.Question III



Describe Dijkstra's algorithm for finding shortest paths in a weighted graph. What efficiency does it achieve and how does it work?

#### solution


**Dijkstra's Algorithm:**

- Dijkstra's algorithm is used to find the shortest paths from a source vertex to all other vertices in a weighted graph with non-negative edge weights.
- It maintains a set of vertices with tentative distances from the source and repeatedly selects the vertex with the smallest tentative distance, relaxing its neighbors.
- Efficiency: Dijkstra's algorithm achieves `O(V^2)` time complexity with a simple implementation using a matrix, but it can be optimized to `O(V log V + E)` using a priority queue (e.g., a min-heap).
- How it works:
    - Initialize distances to all vertices as infinity and the source vertex's distance as 0.
    - Select the vertex with the smallest tentative distance.
    - Relax all of its neighbors by considering their distances through the current vertex.
    - Repeat steps 2 and 3 until all vertices have been processed or the target is reached.
- Dijkstra's algorithm guarantees the shortest path for non-negative edge weights but may not work correctly for graphs with negative weights or cycles.




