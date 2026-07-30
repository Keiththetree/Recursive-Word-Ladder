# Recursive-Word-Ladder

1. Keith Warden, CIS-287,Recursive-Word-Ladder
2. The program takes in a start word and an end word and using the dictionary provided finds a connection
   between the two words where adjacent words differ by one letter.
3. WordLadderApp is the driver and is responsible for creating the objects for the program to run and code for user input
WordDictionary takes the data from the txt file and creates data objects and related methods
WordLadderSolver uses the WordDictionary class and WordUtils class to run the recursive algorithm 
WordUtils has a static method to find if two strings differ by one letter
4. javac *.java
5. java WordLadderApp
6. test-fish, dish, dash, cash, case, care, card, cart, cast, fast, last, list, lost, most, mast
7.the search method is recursive
the recursive call is in the findLadder method
the base case is when the current word is equal to the end word
the search checks the starting word's list of words that are different by one letter and checks that letters list until it
is out of options and backtracks on to the next word on the list or finds the end word
8. when a possible path fails it goes back to the next previous word in the ladder and check the next possible word that is different from it by one letter
the current word is removed because it means that all possible paths from that branch was checked
the algorithm then checks the previous word's list of words that differ by one letter
9. so that program doesn't run in a loop
a path can't have two of the same word if you check if a word is visited so a loop isn't possible
an error where a recursive method is called infinitely
10. the classes use private data types
the WordLadderSolver class uses the WordDictionary object in the constructor
in order for reusability for different use cases
you use them to class public methods
12. used for explaining how to create a recursive algorithm for this problem and debugging









