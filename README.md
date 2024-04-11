# Hashtable
Hash Table Implementation (HashTable class):

Implements a hash table using separate chaining for collision resolution.
The hash table uses an array of linked lists (Node objects).
Each Node in the hash table contains a key-value pair.
Keys are hashed using a hash function, and the resulting hash value determines the index in the array.
Supports operations like insertion (put()) and retrieval (getOrDefault()).
The hash table size is defined by T_SIZE.
Solution Method (solve() method in A3Q2 class):

The solve() method takes six integers A, B, C, D, E, and S as parameters.
It calculates the number of combinations (x1, x2, x3, x4, x5) where x1, x2, x3, x4, and x5 are integers between -R and R (inclusive) that satisfy a given equation involving A, B, C, D, E, and S.
The method constructs a hash table T to store the frequency of sums of expressions involving x1 and x2.
Then, it iterates through all possible combinations of (x3, x4, x5), calculates the corresponding sum of expressions involving x3, x4, and x5, and checks if there exists a sum in T such that (S - sum) equals the current sum.
The count of such occurrences is accumulated and returned as the result.
Main Method:

Contains test cases to verify the correctness and efficiency of the solve() method.
