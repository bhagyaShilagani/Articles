Java Collections Framework quick guide

A quick guide for the Java Collections Framework

Queues

Implementation	offer	peek	poll	size
PriorityQueue	O(log n)	O(1)	O(log n)	O(1)
ConcurrentLinkedQueue	O(1)	O(1)	O(1)	O(n)
ArrayBlockingQueue	O(1)	O(1)	O(1)	O(1)
LinkedBlockingQueue	O(1)	O(1)	O(1)	O(1)
PriorityBlockingQueue	O(log n)	O(1)	O(log n)	O(1)
DelayQueue	O(log n)	O(1)	O(log n)	O(1)
LinkedList	O(1)	O(1)	O(1)	O(1)
ArrayDeqeue	O(1)	O(1)	O(1)	O(1)
LinkedBlockingDequeue	O(1)	O(1)	O(1)	O(1)
Lists

Implementation	get	add	contains	next	remove	iterator.remove
ArrayList	O(1)	O(1)	O(n)	O(1)	O(n)	O(n)
LinkedList	O(n)	O(1)	O(n)	O(1)	O(1)	O(1)
CopyOnWriteArrayList	O(1)	O(n)	O(n)	O(1)	O(n)	O(n)


# Markov Chains - text generator algorithm
Markov Chains --> State Machines with State transitions which are probabilities. 
For Example Word: Chicken; possible next Words : 10% - is ; 30% - was; 50% - legs; 10% - runs;
Simply choose the next word randomly. You get these probabilities from some input text.
Google's Search Engine uses [Page Rank Algo](https://en.wikipedia.org/wiki/PageRank) which is based on Markov Chains, 
[Other Examples](https://en.wikipedia.org/wiki/Markov_chain#Examples)

Java (ToDo):
Python (ToDo): 

# Data Structures and Algo Notes:
1. DS: Stacks(LILO), Queue(FIFO), Array, Linked Lists (SinglyLL, DoublyLL, CircularLL), HashMap
2. Trees (BT) - Deleting a node having L R child: get the smallest child on the right subtree and replace with the node being deleted. Then delete the smallest node of the right subtree
3. Searching: Linear, Binary
4. Sorting: Insertion, Selection, Quick, Merge, Bucket, Quick
5. Performance: Big O notation
6. Tree Traversal (Recursive Search)
...PostOrdered(LeftRightParent DEBFGCA), InOrdered(LeftParentRight DBEAFCG), PreOrdered(ParentLeftRight ABDECFG): Depth First Traversal
...LevelOrdered: Breadth First Traversal(Tricky ABCDEFG)
7. Diff betweeb BST[O(n) when BT is a single LL is the worst case when data is already sorted] and Balanced BST[O(log n) worst case] - minimum tree height for better searching. On an average they perform the same. 
8. Java has built in [TreeSet](https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html) class
9. http://introcs.cs.princeton.edu/java/40algorithms/

10. Trees and Binary Search Trees
http://www.openbookproject.net/thinkcs/archive/java/english/chap17.htm -- explains trees, how to build and traverse it
http://algs4.cs.princeton.edu/32bst/ -- about binary search trees
https://www.youtube.com/watch?v=pYT9F8_LFTM -- BST video

11. Tries
https://www.toptal.com/java/the-trie-a-neglected-data-structure --explains with solid example
https://www.topcoder.com/community/data-science/data-science-tutorials/using-tries/ -- explains as well as providing code

12. Big-O analysis
http://web.mit.edu/16.070/www/lecture/big_o.pdf -- Big O handout from MIT
https://www.interviewcake.com/article/java/big-o-notation-time-and-space-complexity -- explanation of Big O with examples
http://discrete.gr/complexity/ -- "A Gentle Introduction to Algortihm Complexity Analysis" GIves a lot more detail than what we provided.

13. Sorting algorithms
http://www.java2novice.com/java-sorting-algorithms/ -- 5 different sort algorithm explanation with codes
https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html -- different search algrotihms with solid examples

14. Linked Lists
http://www.mycstutorials.com/articles/data_structures/linkedlists -- linked list explanation with code

15. Writing JUnit tests
http://www.tutorialspoint.com/junit/junit_test_framework.htm -- explains fixtures, test suites, test runners, JUnit classes

16. Exceptions and Exception Handling
https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html - Oracle's tutorial on Exceptions.

17. Hashtables and HashMaps

http://www.tutorialspoint.com/data_structures_algorithms/hash_data_structure.htm -- about hashing, linear probing, search, delete, insert
https://www.youtube.com/watch?v=MfhjkfocRR0 -- video about hashtable
http://stackoverflow.com/questions/40471/differences-between-hashmap-and-hashtable -- difference between hashtables and hashmaps
http://javarevisited.blogspot.com/2010/10/difference-between-hashmap-and.html
