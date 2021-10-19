# java-fundamentals

Table of content:

# Lab01

1. [basics](./basics) * I spent 2 hours to complete this assignment


- Created basics directory 
- It contains Main Java file.

--------------------------------------------------------------

- Main Java has 3 methods :-
- pluralize: accepts a word and a number and returns a string with  an “s”.
- flipNHeads: accepts an integer n and flips coins until n heads are flipped in a row.
- clock: print out the current time second by second. 


# Lab2
1. [basiclibrary](./basiclibrary/lib/src/main/java/basiclibrary/Library.java) * I spent 3 hours to complete this assignment

- Created basiclibrary directory 
- It contains Library.Java file.

--------------------------------------------------------------

- Library.Java  has 4 methods :-
- **roll function**  that accepts an integer n and rolls a six-sided dice n times then return the values in an array .
- **fuction containsDuplicates** tells you whether the array contains duplicate values or not.
- **calcAverage** takes in an array of integers and calculates the average values .
- **arrayOfArrays** takes in an array of arrays, calculate the average value for each array and returns the array that has lowest average.

### Library.Java  has 4 test methods :-
- **rollTest** a test used to check the **roll  method** and be sure its working corectly without error , by checking the numbers of elements in the array is the same number of the n times .
- **containsDuplicatesTest** a test used to check the **containsDuplicates  method** and be sure its working corectly without error , by checking if the input array give us true  if its contain Duplicates value .
- **calcAverageTest** a test used to check the **calcAverage  method** and be sure its working corectly without error , by checking if the input array avg is the same for the corect mathematical average for the array's integers.
- **arrayOfArraysTest** a test used to check the **arrayOfArrays  method** and be sure its working corectly without error , by checking if the output  array is the array that has the lowest avg . 

# Lab03

1. [Maps](./basiclibrary/lib/src/main/java/basiclibrary/Library.java) 

--------------------------------------------------------------
Library.Java has 2 new methods:
monthlyTemperatures a function that takes an array of arrays ,find the min and max values. track of all the unique temperatures and create a String containing any temperature not seen during the month

tally a function that accepts a List of Strings representing votes and returns one string to show what got the most votes.


linter - App.java
1. [linter](./linter/app/src/main/java/linter/App.java) 
checkErr a function that that reads a JavaScript file in a certain path and generates an error message whenever it finds a line that doesn’t end in a semi-colon;
Don’t show an error if the line is empty; Don’t show an error if the line ends with an opening curly brace {; Don’t show an error if the line ends with an closing curly brace }; Don’t show an error if the line contains if or else;

# Lab06

1. [Inhirtance ](./inheritance/lib/src/main/java/inheritance)
2. [Test file  ](./inheritance/lib/src/test/java/inheritance/LibraryTest.java)

--------------------------------------------------------------
* Inhirtance directory contains 2 classes:
- Reasturant class contains 3 methods :
    - To string:to print reasurant details and reviwer details.
    - AddReview:Add review details fromm review class.
    - Average rating:calculate the average rating.
- Review class:
    - contain constructor.
    - To string .

# Lab07

1. [Inhirtance ](./inheritance/lib/src/main/java/inheritance)
2. [Test file  ](./inheritance/lib/src/test/java/inheritance/LibraryTest.java)

--------------------------------------------------------------
The lab contain these classes:
* `Restaurant`
* `Review`
* `Shop`
* `Theater`
  Shop class:contains toString and add review.
  Theater class: contains toString and add review ,addMovie and removeMovie .
  Theater Review:to review a specific movie.







