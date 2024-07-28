# Java Coding Problems

*`updated July 28, 2024`*

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fjdevstatic%2Fjava-coding-problems&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=PAGE+VIEWS&edge_flat=false)](https://hits.seeyoufarm.com)

These are the most common coding problems being asked during
technical interviews, as I experienced it myself.

## Running The Code
It's the convenience of Codespaces online! Simply create a Codespace, you don't need to install anything, just run using Bash.

### Steps to Run the Code
1. **Fork the Repository**:
   - Navigate to the repository you want to fork.
   - Click the "Fork" button at the top right corner of the page.

2. **Create a Codespace**:
   - Go to your forked repository.
   - Click the "Code" button.
   - Select "Open with Codespaces" from the dropdown menu.
   - If you have Codespaces enabled, you will see an interface like this:
   ![Codespaces](https://github.com/user-attachments/assets/580e8844-5476-4b7a-a133-0e378656096a)

3. **Navigate to the Source Directory**:
   - Open the terminal in Codespaces.
   - Change the directory to `src`:
     ```bash
     cd src
     ```

4. **Run the Java File**:
   - Starting with Java 11, you can run Java files without compiling them first. Use the following command:

     ```bash
     java [NameOfTheFile].java
     ```

this is the sample interface of the online Codespaces 

![Codespaces Interface](https://user-images.githubusercontent.com/47092464/182785921-838bd0e5-2707-4e08-8a0b-9127afba6866.png)

enjoy!

## Source Code
1. **Binary Search**
   - **Problem:** Implement a binary search algorithm to find the position of a 
     target value within a sorted array.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/BinarySearch.java)
   - **Discussion:** Binary search is an efficient algorithm for finding an item 
     from a sorted list of items. It works by repeatedly dividing in half the 
     portion of the list that could contain the item, until you've narrowed down 
     the possible locations to just one.

2. **Checking Palindrome**
   - **Problem:** Check if a given string is a palindrome.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/CheckPalindromeString.java)
   - **Discussion:** A palindrome is a word, phrase, number, or other sequence 
     of characters that reads the same forward and backward (ignoring spaces, 
     punctuation, and capitalization). The algorithm typically involves 
     comparing characters from the beginning and end of the string moving 
     towards the center.

3. **Inheritance**
   - **Problem:** Demonstrate the concept of inheritance in Java.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/tree/main/src/inheritance)
   - **Discussion:** Inheritance is a fundamental concept in object-oriented 
     programming where a new class is created from an existing class. The new 
     class (subclass) inherits attributes and methods from the existing class 
     (superclass), allowing for code reuse and the creation of a hierarchical 
     relationship between classes.

4. **Integer Array Sum**
   - **Problem:** Calculate the sum of all integers in an array.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/IntegerArraySum.java)
   - **Discussion:** This problem involves iterating through an array of 
     integers and accumulating the sum of its elements. It is a straightforward 
     problem that demonstrates basic array manipulation and iteration.

5. **Merge Sort**
   - **Problem:** Implement the merge sort algorithm.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/MergeSort.java)
   - **Discussion:** Merge sort is a divide-and-conquer algorithm that divides 
     the input array into two halves, recursively sorts them, and then merges 
     the sorted halves. It is known for its efficiency and stable sorting 
     properties.

6. **Prime Number Checker**
   - **Problem:** Check if a given number is a prime number.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/PrimeNumberCheck.java)
   - **Discussion:** A prime number is a natural number greater than 1 that has 
     no positive divisors other than 1 and itself. The algorithm typically 
     involves checking divisibility from 2 up to the square root of the number.

7. **Fibonacci Series**
   - **Problem:** Print the Fibonacci series up to a given number.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/PrintFibonacciSeries.java)
   - **Discussion:** The Fibonacci series is a sequence where each number is the 
     sum of the two preceding ones, usually starting with 0 and 1. This problem 
     can be solved using iterative or recursive approaches.

8. **Remove A Character**
   - **Problem:** Remove all occurrences of a given character from a string.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/RemoveAChar.java)
   - **Discussion:** This problem involves iterating through the string and 
     building a new string that excludes the specified character. It 
     demonstrates string manipulation techniques.

9. **Remove Whitespaces**
   - **Problem:** Remove all whitespaces from a string.
   - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/RemoveWhiteSpaces.java)
   - **Discussion:** This problem involves iterating through the string and 
     building a new string that excludes all whitespace characters. It is a 
     common string manipulation task.

10. **Reverse A Linked List**
    - **Problem:** Reverse a singly linked list.
    - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/ReverseALinkedList.java)
    - **Discussion:** Reversing a linked list involves changing the direction of 
      the pointers in the list. This problem is a classic example of pointer 
      manipulation in data structures.

11. **Reverse A String**
    - **Problem:** Reverse a given string.
    - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/ReverseString.java)
    - **Discussion:** Reversing a string involves swapping characters from the 
      beginning and end of the string moving towards the center. It is a basic 
      string manipulation problem.

12. **Shuffle Array**
    - **Problem:** Shuffle the elements of an array randomly.
    - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/ShuffleArray.java)
    - **Discussion:** Shuffling an array involves randomly permuting its 
      elements. This can be achieved using algorithms like the Fisher-Yates 
      shuffle.

13. **Sort Array**
    - **Problem:** Sort an array of integers.
    - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/SortArray.java)
    - **Discussion:** Sorting an array involves arranging its elements in a 
      specific order (ascending or descending). Various algorithms can be used, 
      such as quicksort, mergesort, or bubble sort.

14. **Check Vowels**
    - **Problem:** Check if a string contains any vowels.
    - **Link:** [View Code](https://github.com/jdevstatic/java-coding-problems/blob/main/src/StringContainsVowels.java)
    - **Discussion:** This problem involves iterating through the string and 
      checking for the presence of vowel characters (a, e, i, o, u). It 
      demonstrates basic string traversal and condition checking.

## License
This is based on :

https://www.journaldev.com/370/java-programming-interview-questions

I don't know about the specific license the author used
but I'm still including his link for his copyright.

When you copy my work, include the author's link 
and my MIT license for my modifications.

## More Java Projects
for more Java discussion and other details, 
check the Main Page -> [Java](https://github.com/jdevfullstack/java)

## More Of My Content
- [jdevfullstack Profile](https://github.com/jdevfullstack)
- [jdevfullstack Repos](https://github.com/jdevfullstack?tab=repositories)
- [jdevfullstack Projects](https://github.com/jdevfullstack-projects)
- [jdevfullstack Tutorials](https://github.com/jdevfullstack-tutorials)
