# Depth-First Search (DFS) Implementation in C++

This project involves implementing a Depth-First Search (DFS) algorithm in C++. The DFS algorithm is a common method for traversing or searching tree or graph data structures. It starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking.

## Class Structure

The main class in this project is the `Graph` class. It contains three member variables:

- `numVertices`: The number of vertices in the graph.
- `adjLists`: An array of lists representing the adjacency lists of vertices.
- `visited`: An array of booleans indicating whether each vertex has been visited.

## Class Methods

The `Graph` class has the following methods:

- **Constructor**: Initializes the graph with a given number of vertices.
- **addEdge(int src, int dest)**: Adds an edge between two vertices in the graph.
- **DFS(int v)**: Performs a DFS traversal starting from a given vertex.

## Example Usage

Here is an example of how to use the `Graph` class:

```cpp
int main() {
  Graph g(5);

  g.addEdge(0, 1);
  g.addEdge(0, 2);
  g.addEdge(1, 2);
  g.addEdge(2, 0);
  g.addEdge(2, 3);
  g.addEdge(3, 3);

  std::cout << "Depth First Traversal (starting from vertex 2): ";
  g.DFS(2);

  return 0;
}
```

## Time Complexity

The time complexity of the DFS algorithm is O(V + E), where V is the number of vertices and E is the number of edges in the graph. This is because each vertex and each edge will be explored in the worst case.

