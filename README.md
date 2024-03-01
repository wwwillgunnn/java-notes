This repository contains some notes and useful tid-bits on java 

// Data structures // 
Time complexity is one of the most import things.
- BigO notation (A mathematical notation used to classify algorithms according to how their run time or space requirements grow as the input size grows)
- constant / O(1) is most ideal
- O(1) > O(Log N) > O(N) > O(N Long N) > O(N^2) > O(2^n) > O(n!)
  
// Space complexity (The relationship between growth of input size and growth space needed) //
- Binary search (It's like searching for a word in the dictionary, open, half, half, half)
   
// Sorting algorithms //
The cost to sort an arbitrary collections is O(N Long N), nothing is faster than this 

// Array //
most fundamental data structure. 
"An array is an indexable contiguous chunk of memory"
- fixed in size

// Linked list // 
"list data structure with a flexible size"
- pack your data into nodes that holds the data and the pointer to the next node

// Binary tree // 
Nodes that point to a left and right child (sub tree) 
Binary search tree: left child must be smaller, right child must be bigger or equal
- self balancing search trees (red and black trees)

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

Useful resources
jomaClass:
