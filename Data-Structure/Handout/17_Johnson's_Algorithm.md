# <center> Johnson's Algorithm


# <center> <div style="width: 370px;"> ![Johnson's Algorithm](pictures/Johnson's_Algorithm.jpg)



### Single Source Shortest Paths Review


We’ve learned four algorithms to solve the single source shortest paths (SSSP) problem; they are listed in the table below. Then, to solve shortest paths problems, you must first define or construct a graph related to your problem, and then running an SSSP algorithm on that graph in a way that solves your problem. Generally, you will want to use the fastest SSSP algorithm that solves your problem. Bellman-Ford applies to any weighted graph but is the slowest of the four, so we prefer the other algorithms whenever they are applicable. 

|Restrictions||SSSP Algorithm||
|-----|----|-----|------|
Graph|Weights|Name|Running Time (O(·))|
|  General| Unweighted  |  BFS | $|V|+|E|$   |     |V| + |E|       |
| DAG |Any| DAG Relaxation       |              $|V|+|E|$              |     |V| + |E|       |
|            General| Any              |     Bellman-Ford         |   $|V| \dot |E|$              |         |V| · |E|     |   General
|    General|              Non-negative                  |       Dijkstra           |              $|V| \log |V| + |E|$        |                     |


We presented these algorithms with respect to the SSSP problem, but along the way, we also
showed how to use these algorithms to solve other problems. For example, we can also ***count connected components*** in a graph using Full-DFS or Full-BFS, ***topologically sort*** vertices in a DAG using DFS, and ***detect negative weight cycles*** using Bellman-Ford.


### All Pairs Shortest Paths


In the Weighted All Pairs Shortest Paths (APSP) problem, we are tasked with finding the minimum weight $δ(u, v)$ for every pair of vertices $u$, $v ∈ V$ in a weighted graph $G = (V, E, w)$. However, if $G$ contains a negative weight cycle, our algorithm is not required to provide an output.

A common approach to tackle this problem is to reduce it to solving a Single-Source Shortest Path (SSSP) problem $|V|$ times, once from each vertex in $V$. This method works efficiently for specific graph types. For example, in unweighted sparse graphs (where $|E| = O(|V|)$), employing a Breadth-First Search (BFS) from each vertex takes $O(|V|^2)$ time. Since any APSP algorithm must take at least $Ω(V^2)$ time to compute $δ(u, v)$ for all pairs of vertices, this algorithm is optimal for unweighted and sparse graphs.

However, for general graphs that may contain negative-weight edges, applying the Bellman-Ford algorithm $|V|$ times can be slow, with a time complexity of $O(|V|^2|E|)$, which is a factor of $|E|$ larger than the output. Conversely, if the graph consists solely of non-negative edge weights, applying Dijkstra's algorithm $|V|$ times results in a time complexity of $O(|V|^2 log |V| + |V||E|)$. In the case of sparse graphs, running Dijkstra $|V|$ times is only logarithmically larger than the output, whereas running Bellman-Ford $|V|$ times is linearly larger.

This raises a crucial question: Is there a more efficient way to solve the APSP problem for general weighted graphs, surpassing the $O(|V|^2|E|)$ time complexity?



### Johnson’s Algorithm



Johnson’s Algorithm offers a clever approach to addressing the All Pairs Shortest Paths (APSP) problem in a graph with ***arbitrary edge weights***. It achieves this by transforming the problem into an APSP problem on a graph with non-negative edge weights. This transformation involves re-weighting the edges in the original graph in such a way that the shortest paths in the newly weighted graph are also shortest paths in the original graph. By subsequently applying Dijkstra's algorithm |V| times to find shortest paths in the re-weighted graph, the algorithm effectively solves the original APSP problem.

The ingenious concept behind Johnson’s Algorithm revolves around assigning each vertex 'v' a real number `h(v)` and modifying the weight of each edge `(a, b)` from `w(a, b)` to `w'(a, b) = w(a, b) + h(a) − h(b)`. This transformation creates a new weighted graph `G' = (V, E, w')`.





#### Claim: 
A shortest path $(v_1, v_2, . . . , v_k)$ in `G'` is also a shortest path in `G` from $v_1$ to $v_k$. 


**$proff.$**

Let $w(\pi) = \sum_{i=1}^{k-1} w(v_i, v_{i+1})$ be the weight of path π in G. Then weight of π in G' is: 

$$  \sum_{i=1}^{k-1} w'(v_i, v_{i+1} = \sum_{i=1}^{k-1} (w(v_i,v_{i-1} )+h(v_i)-h(v_{i-1})) =\sum_{i=1}^{k-1} (w(v_i,v_{i-1}))+ \sum_{i=1}^{k-1} h(v_i) - \sum_{i=1}^{k-1} h(v_{i+1}) = w(\pi) + h (v_1) - h(v_k)                         $$



So, since each path from $v_1$ to $v_k$ is increased by the same number $h(v_1) − h(v_k)$, shortest paths remain shortest. 



It remains to find a vertex assignment function h, for which all edge weights $w'(a, b)$ in the modified graph are non-negative. Johnson’s defines `h` in the following way: add a new node `x` to `G` with a directed edge from `x` to `v` for each vertex $v ∈ V$ to construct graph `G∗`, letting $h(v) = δ(x, v)$. This assignment of h ensures that $w' (a, b) ≥ 0$ for every edge `(a, b)`. 


#### claim: 
If $h(v) = δ(x, v)$ and $h(v)$ is finite, then $w'(a, b) = w(a, b) + h(a) − h(b) ≥ 0$ for every edge $(a, b) ∈ E$.



**$proff.$**


The claim is equivalent to claiming $δ(x, b) ≤ w(a, b) +δ(x, a)$ for every edge$(a, b) ∈ E$, i.e. the minimum weight of any path from `x` to b in `G∗` is not greater than the minimum weight of any path from `x` to a than traversing the edge from `a` to `b`, which is true by definition of minimum weight. (This is simply a restatement of the triangle inequality.) 



Johnson's algorithm computes values $h(v) = δ(x, v)$ by finding negative minimum weight distances from an added node `x` using the Bellman-Ford algorithm. If $δ(x, v)$ equals negative infinity for any vertex `v`, this indicates the presence of a negative weight cycle in the graph, prompting Johnson's algorithm to terminate without producing any output. Otherwise, Johnson's algorithm proceeds to re-weight the edges of `G`, transforming them into non-negative weights as $w'(a, b) = w(a, b) + h(a) − h(b) ≥ 0$ in the newly created graph `G'`.

Since shortest paths in `G'` remain shortest paths in `G`, we can apply Dijkstra's algorithm $|V|$ times to find single-source shortest path distances $δ'(u, v)$ from each vertex u in G0. Subsequently, we can compute each $δ(u, v)$ in `G` by setting it to $δ0(u, v) − δ(x, u) + δ(x, v)$.

Johnson's algorithm has a time complexity of `O(|V||E|)` for the Bellman-Ford phase and `O(|V|(|V| log |V| + |E|))` for the subsequent execution of Dijkstra's algorithm $|V|$ times. Therefore, the overall algorithm runs in `O(|V|^2 log |V| + |V||E|)` time, which is asymptotically superior to `O(|V|^2|E|)`.


