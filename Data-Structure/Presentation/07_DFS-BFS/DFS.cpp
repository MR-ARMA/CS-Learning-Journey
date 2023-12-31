#include <iostream>
#include <vector>
#include <list>

class Graph {
public:
   Graph(int numVertices) : numVertices(numVertices), adjLists(numVertices), visited(numVertices, false) {}

   void addEdge(int src, int dest) {
       adjLists[src].push_back(dest);
   }

   void DFS(int v) {
       visited[v] = true;
       std::cout << v << ' ';

       for (auto& u : adjLists[v]) {
           if (!visited[u]) {
               DFS(u);
           }
       }
   }

private:
   int numVertices;
   std::vector<std::list<int>> adjLists;
   std::vector<bool> visited;
};

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
