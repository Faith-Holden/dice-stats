# dice-stats

My solution for Chapter 5 Exercise 3 of “Introduction to Programming Using Java”.

Implementation notes: At the time I did this exercise, I implemented it in a way that I would now consider to be... not ideal. 
Rather than rewriting it now, I am choosing to leave it as is. 
The most concerning issues with it are that 1) the main function could be vastly simplified by calling the print statements in a for-loop
and 2) the countRollsToTally should NOT implement a dice-rolling functionality, but should call PairOfDice.roll().

Problem Descripton:
This problem uses the PairOfDice class from Exercise 5.1 and the StatCalc class from Exercise 5.2.
The program in Exercise 4.4 performs the experiment of counting how many times a
pair of dice is rolled before a given total comes up. It repeats this experiment 10000 times
and then reports the average number of rolls. It does this whole process for each possible
total (2, 3, . . . , 12).
Redo that exercise. But instead of just reporting the average number of rolls, you
should also report the standard deviation and the maximum number of rolls. Use a
PairOfDice object to represent the dice. Use a StatCalc object to compute the statistics.
(You’ll need a new StatCalc object for each possible total, 2, 3, . . . , 12. You can use a
new pair of dice if you want, but it’s not required.)
