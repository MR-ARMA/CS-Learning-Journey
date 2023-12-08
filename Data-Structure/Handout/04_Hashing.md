# <center> <div style="width: 370px;"> <center>Introduction to Hashing

# <center> <div style="width: 370px;"> ![Hashing](pictures/Hashing.jpg)

- **Idea!** Want faster search and dynamic operations. Can we find(k) faster than Θ(log n)?
- Answer is no (lower bound)! (But actually, yes...!?) 

## Comparison Model

The comparison model of computation operates on a set of comparable objects. These objects can be conceptualized as black boxes, supporting only a set of binary boolean operations known as comparisons, including `<, ≤, >, ≥, =, and ≠`. Each comparison operation takes two objects as input and yields a Boolean value, either True or False, based on the relative ordering of the elements. When employing a search algorithm on a set of n items, the goal is to retrieve a stored item with a key identical to the input key, or indicate that no such item exists. In this context, we assume that each item possesses a unique key.

In a scenario where binary comparisons serve as the sole means of distinguishing between stored items and a search key, a deterministic comparison search algorithm can be likened to a fixed binary decision tree that encompasses all conceivable executions of the algorithm. Each node within this tree represents a comparison carried out by the algorithm. During execution, the algorithm traverses the tree, following a path from the root. For any given input, the algorithm initiates by making a comparison at the root of the tree. Depending on the outcome of this initial comparison, the computation progresses to a comparison at one of its two child nodes. The algorithm continues to make comparisons until it reaches a leaf node, at which point it terminates and returns an output.

To ensure comprehensive coverage of potential outcomes, there must be a leaf node for each possible output of the algorithm. In the case of a search operation, there are `n + 1` potential outputs: the `n` items themselves and the result indicating that no matching item was found. Consequently, the decision tree must comprise a minimum of `n + 1` leaf nodes. As a result, the ***worst-case number of comparisons*** required by any comparison search algorithm is equal to ***the height of the algorithm's decision tree***, which is defined as the length of the longest path from the root to any leaf node.

### Understanding the Comparison Model in Algorithm Analysis

In the realm of algorithm analysis, the Comparison Model serves as a fundamental framework for evaluating algorithms. It revolves around the concept that algorithms can primarily differentiate items through comparisons. Let's delve into the key elements of this model to gain a deeper understanding:

**Comparable Items as Black Boxes:**
- In the Comparison Model, we treat items as black boxes that can only support comparisons between pairs.
- These comparisons are limited to six binary boolean operations: <, ≤, >, ≥, =, and ≠.
- The outcomes of these comparisons are binary in nature, resulting in either True or False.

**Objective: Supporting the find(k) Operation:**
- The primary goal within the Comparison Model is to store a set of n comparable items and facilitate the find(k) operation.
- The efficiency of algorithms in this model is inherently tied to the number of comparisons performed during their execution.

**Decision Tree Representation:**
- We can visualize any algorithm operating within the Comparison Model as a decision tree.
- In this tree, each internal node represents a binary comparison, branching into two possibilities: True or False.
- A leaf node signifies the termination of the algorithm, producing an output.

**Root-to-Leaf Paths and Executions:**
- Every root-to-leaf path within the decision tree signifies a specific execution of the algorithm on a particular input.
- Each path navigates through a sequence of binary comparisons, ultimately leading to an algorithmic output.

**Leaf Nodes and Algorithm Outputs:**
- To ensure the comprehensive coverage of possible algorithmic outcomes, we need at least one leaf node for each distinct output that the algorithm can produce.
- In the context of a search operation, where the goal is to find a specific item within the set, there are $n + 1$ potential outcomes. These include the n items themselves and the result indicating that no matching item was found.

**Implications for Running Time:**
- The running time of algorithms within the Comparison Model is intrinsically tied to the number of comparisons performed during their execution.
- Consequently, analyzing the number of comparisons made serves as a crucial aspect of evaluating algorithm efficiency.

**Lower Bound for Comparison Search:**
- A key question in this model is determining the worst-case running time of a comparison search algorithm.
- We establish a lower bound on running time, stating that it must be greater than or equal to the number of comparisons made.
- This lower bound is further related to the maximum length of any root-to-leaf path within the decision tree and, consequently, the height of the tree.

**Minimum Height of a Binary Tree:**
- To determine this lower bound, we consider the minimum height of any binary tree with at least n nodes.
- The minimum height is achieved when the binary tree is complete, meaning all rows are full except the last.
- We find that the height of such a complete binary tree is $Ω(log n)$, indicating that the running time of any comparison sort algorithm is also Ω(log n).

**Achieving the Lower Bound:**
- It's noteworthy that sorted arrays achieve this lower bound, making them an optimal choice within the Comparison Model.

**Generalization with Max Branching Factor:**
- In a broader context, the height of a tree with Θ(n) leaves and a maximum branching factor of $b$ is $Ω(log_b n)$.
- To achieve faster algorithms, we would require operations that allow for a super-constant $ω(1)$ branching factor, paving the way for further efficiency enhancements.

In summary, the Comparison Model offers valuable insights into algorithm analysis by emphasizing the significance of comparisons and their impact on algorithmic efficiency. It serves as a foundational framework for evaluating and understanding a wide range of algorithms, including those employed in sorting and searching tasks.


**Direct Access Arrays: A Window into Efficient Memory Access**

In the realm of computer operations, most activities adhere to constant logical branching, much like the conditional "if" statements in your code. However, there exists a remarkable operation in your computer's arsenal—one that allows for non-constant branching. This operation grants the ability to access any memory address in constant time. Exploiting this unique capability, we introduce a data structure known as a "direct access array."

**Direct Access Array Defined:**
- A direct access array is essentially a standard static array with an intriguing twist. It associates a semantic meaning with each index location within the array.
- Specifically, it signifies that any item x possessing a key k will be stored at the array index k.
- This concept is particularly meaningful when item keys are integers. Fortunately, in the realm of computers, nearly anything in memory can be linked to an integer, be it the value represented as a sequence of bits or its memory address. Henceforth, we will focus solely on integer keys.

**Storing Items with Unique Integer Keys:**
- Imagine the need to store a collection of n items, each associated with a unique integer key falling within a bounded range, typically from $0$ to some large number $u - 1$.
- We can accomplish this by employing a direct access array with a length of $u$. Each slot in this array, indexed from $0$ to $u - 1$, can potentially contain an item linked to the integer key corresponding to its index.
- When searching for an item with an integer key $i$, a search algorithm can directly access array slot $i$, resulting in a worst-case constant time response to the search query.

**Trade-Off with Order Operations:**
- While achieving worst-case constant time for searches is a remarkable feat, this efficiency comes at a cost: order operations on this data structure become notably sluggish.
- Without any assurance about the arrangement of the first, last, or next element within the direct access array, we might need to expend u time for order-related operations.

**Storage Space Considerations:**
- It's crucial to acknowledge that worst-case constant time search capabilities come at the expense of storage space.
- A direct access array necessitates a slot to be available for every conceivable key within the specified range.
- This becomes a challenge when the value of u is significantly large compared to the number of items being stored.
- For instance, envision the requirement to support the "find(k)" operation for ten-letter names using a direct access array. The potential space of names would be $u ≈ 26^10 ≈ 9.5 × 10^13$. Even storing a bit array of such magnitude would demand a staggering $17.6$ terabytes of storage space.

**The Solution: Hashing**
- How do we overcome this storage challenge when $u$ is prohibitively large? The answer lies in the concept of hashing.

**Exploring the Direct Access Array: Key Points**
- Direct access arrays leverage the Word-RAM model, enabling $O(1)$ time random access indexing with a linear branching factor.
- The core idea is to allocate items with unique integer keys $k$ in the range $\{0, . . . , u - 1\}$ and store each item in an array at the corresponding index $k$.
- This approach associates meaning with each index of the array, enhancing search efficiency.
- When keys fit within a machine word (i.e., $u ≤ 2^w$), worst-case $O(1)$ find and dynamic operations become achievable.
- it's safe to assume that input numbers or strings can fit within a word unless explicitly parameterized.
- Within the realm of computer memory, nearly everything is represented as a binary integer or can be mapped to a (static) 64-bit memory address.
- However, the downside is that this approach consumes space proportional to u, which can be unfavorable when $n ≪ u$.
- For example, if keys correspond to ten-letter names, even a single bit per name would require an astounding $2^610 ≈ 17.6$ terabytes of storage space.

**The Quest for Space Efficiency:**
- The question that looms is, how can we utilize less space while preserving the essence of this powerful approach?

In conclusion, direct access arrays offer an insightful perspective on memory access efficiency by exploiting the ability to access any memory address in constant time. While they excel in providing rapid search capabilities, they prompt us to address space considerations, leading us to explore hashing as a solution to optimize storage efficiency.

# <center>Hashing

**Idea!** If $n << u$, map keys to a smaller range $m = Θ(n)$ and use smaller direct access array
if we want to store some elements that the largest key is `u` and next, find them in an array so worst-case is: $O(log u)$.
so if we storenelements in as array that is smaller than `u` (because store `n` elements in `u` place that `n << u` is very bad idea!) next, our speed is faster:)

if `n << u`, map keys to a smaller range $m=\theta (n)$ and use smaller direct access array.
generally **Hash function:** 


$$ h(k): \{ 0, 1,..., u-1 \} \to \{0, 1,..., n-1 \} $$


**note:** **D** ***irect*** **A** ***ccess*** **A** ***rray*** called ***Hash Table***, h(k)called the ***Hash of key k***
**note:** if `m << u` according to pigeonhole always exist keys a, b such that `h(a) = h(b)` and we can't store both at same index, so we have two way:
- store somewher else in the array **(oppen address)**
- store in another data structure supporting dynamic set interface **(chaining)**

(**h(k):** is the hash of integer key `k`)
#### the goal of hashing is usually to map keys from some large domain `u` into smaller range as `n`

## Chaining

- **Idea!** Store collisions in another data structure (a chain)
- If keys roughly evenly distributed over indices, chain size is `n/m = n/Ω(n) = O(1)`!
- If chain has `O(1)` size, all operations take `O(1)` time! Yay!
- If not, many items may map to same location, e.g. `h(k) = constant`, chain size is `Θ(n)` :(

### Chaining

Chaining serves as a collision resolution strategy where conflicting keys are segregated from the original hash table. Each index in the hash table contains a reference to a chain, which is an independent data structure designed to support the dynamic set interface. This interface encompasses operations like `find(k)`, `insert(x)`, `and delete(k)`.

Typically, a chain can be implemented using a linked list or a dynamic array, but any implementation is acceptable as long as each operation can be executed in linear time or less. To insert an item x into the hash table, you simply insert x into the chain located at index $h(x.key)$. Likewise, to find or delete a key $k$ from the hash table, you can locate and manipulate $k$ within the chain at index $h(k)$.

Ideally, we aim for chains to be small because when our chains contain only a constant number of items, the dynamic set operations can be performed in constant time. However, in the event that our choice of hash function is unfortunate, and all the keys we wish to store map to the same index location, ending up in the same chain, that chain may grow to a linear size. This scenario implies that the dynamic set operations could take linear time. A well-designed hash function strives to minimize the occurrence of such collisions to reduce the maximum size of any chain.

#### we Need good hash function! So what’s a good hash function? 


## Hash Function




**Division Method (Less Effective):** A straightforward approach to mapping integers from a key domain of size u to a smaller domain of size $m$ is to divide the key by $m$ and take the remainder: expressed as $h(k) = (k mod m)$, or in Python, $k % m$. When the keys you're storing are evenly distributed across the domain, the division method tends to distribute items fairly evenly among hashed indices, resulting in small-sized chains and good performance. However, it can perform poorly if all items happen to yield the same remainder when divided by m. Ideally, the performance of our data structure should be independent of the specific keys we choose to store.

**Universal Hashing (Highly Effective):** For sufficiently large key domains $(u)$, any single hash function is bound to be inadequate for some set of $n$ inputs. However, we can achieve consistently good performance for hash tables by randomly selecting our hash function from a large family of hash functions. In this case, the expectation is based on our choice of hash function, which remains independent of the input. One highly performing family of hash functions is defined as follows:


$$ H(m, p) = \{ h_{ab} (k) = (((ak+b) mod \ p) mod \ m) a, b ∈ \{ 0,..., p−1 \} \ and \ a \ \not= 0 \}  $$


In this family, a particular hash function is specified by choosing concrete values for a and b. Importantly, this family of hash functions is considered universal: for any two keys, the probability that their hashes will collide when hashed using a randomly chosen function from this universal family is no greater than $1/m$:
   

$$ Pr_{h∈H} \{ h(k_i) = h(k_j) \}  ≤ \frac{1}{m}, ∀ k_i \not= k_j ∈ \{0,..., u - 1 \} $$


If we know that a family of hash functions is universal, we can set an upper bound on the expected size of any chain, based on our choice of hash function from the family. Consider $\{X_{ij}\}$ as the indicator random variable representing $1$ if keys $k_i$ and $k_j$ collide for a chosen hash function, and 0 otherwise. Then the expected number of keys hashed to the chain at index $h(k_i)$ is:
    

$$ E_{h∈H} \{ X_i \} = E_{h∈H} \{ \sum_j  X_{ij} \} = 1 + \sum_{j \not= i} E_{h∈H} \{ X_{ij} \} =  1 + \sum_{j \not= i} (1) Pr_{h∈H} \{ h(k_i) = h(k_j) \} + (0) Pr_{h∈H} \{ h(k_i) \not= h(k_j) \} ≤ 1 + \sum_{j \not= i} {\frac{1}{m}} = 1 + \frac{(n - 1)}{m}  $$


When the size of the hash table is at least linear in the number of items stored (i.e., $m = Ω(n)$), the expected size of any chain becomes $1 + (n − 1)/Ω(n) = O(1)$, a constant. Consequently, a hash table that resolves collisions through chaining, employing a randomly selected hash function from a universal family, achieves dynamic set operations in expected constant time. It's important to note that to maintain $m = O(n)$, insertion and deletion operations may necessitate rebuilding the direct access array to a different size, selecting a new hash function, and reinserting all items into the hash table. However, these operations can be conducted similarly to dynamic arrays, resulting in amortized bounds for dynamic operations.

Dynamic
- If `n/m` far from 1, rebuild with new randomly chosen hash function for new size `m`
- Same analysis as dynamic arrays, cost can be ***amortized*** over many dynamic operations
- So a hash table can implement dynamic set operations in expected amortized `O(1)` time! :) 

|Set Data Structure|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|
|-|-|-|-|-|-|
||Container|Static|Dynamic|Order|Order|
||build(X)|find(k)|insert(x)/delete(k)|find_min()/find_max()|find prev(k)/find next(k)|
|Array|<center>n|<center>n|<center>n|<center>n|<center>n|
|Sorted Array|$n \log n$|$\log n$|<center>n|<center>1|$\log n$|
|Direct Access Array|<center>u|<center>1|<center>1|<center>u|<center>u|
|Hash Table|$n_{(e)}$|$1_{(e)}$|$1_{(a)(e)}$|<center>n|<center>n|


### Exercise



Given an unsorted array $A = \[a0, . . . , an−1\]$ containing n positive integers, the ***DUPLICATES*** problem asks whether two integers in the array have the same value. 

1- Describe a worst-case `O(n log n)`-time algorithm to solve DUPLICATES.
 

 
**Solution:** 

Sort the array in worst-case $O(n log n)$ time (e.g. using merge sort), and then scan
through the sorted array, returning if any of the $O(n)$ adjacent pairs have the same value. 

2- If `n ≤ k` and `a_i ≤ k` for all `a_i ∈ A`, describe a worst-case `O(k)`-time algorithm to solve
DUPLICATES.



**Solution:**

Insert each of the $n$ integers into a direct access array of length k, which will take
worst-case $O(k)$ time to instantiate, and worst-case $O(1)$ time per insert operation. If an integer
already exists at an array index when trying to insert, then return that a duplicate exists. 
