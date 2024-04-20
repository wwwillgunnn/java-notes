This repo contains notes for ST2 (DATA STRUCTURES AND ALGORITHMS)  
   
Cool crash course video: https://www.youtube.com/watch?v=oz9cEqFynHU&ab_channel=TrenBlack
Cool video on time complexity: https://www.youtube.com/watch?v=v1SYihb4rcw&ab_channel=JomaClass

Useful resources
jomaClass:

// Heap (another type of tree) // - actually use this !
Parent nodes have greater than or equal to priority as their child nodes 
- sometimes called priority que (the root is always the highest priority element (min or max heap)
- rest of the heap is unsorted
- at most doing O(N Long N) comparisons
- look at the wiki on how to build a heap
- can be represented as an array

// Stack trees // 
depth first search --> uses a stack 
stack is a list based data structure where you can only add or pop from the end Last In First Out
  - often done using recursion

bredth first search --> uses a queue 
queue is First In First Out, pop from the beginning 

// Graphs //
Adjacency list 
Adjacency matrix 

find the smallest degree of separation !
- Dijkstra’s algorithm
- Topological sort

// Hash maps //
THE HOLY GRAIL
- A data structure built on top of an array optimised to store key value pairs
- O(1) cost to delete, insert and store  data
- like dictionary in python
