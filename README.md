

##### T-303-HUGB, Software Engineering 2014
##### Late-term Assignment

###### Alexandra Einarsdóttir
###### Anna Louise Ásgeirsdóttir
###### Birgitta Ósk Rúnarsdóttir
###### Kolbrún Freyja Davidsen
###### Perla Þrastardóttir
###### Sonja Steinarsdóttir

TicTacToe
=========

The game TicTacToe written in Java.

Building
--------

In your favorite shell, set your working directory to the project root and build TicTacToe with `gradle`:
   
     ./gradlew build

Running
-------

From the project root, run TicTacToe with `java`:
   
    $ java -jar build/libs/TicTacToe.jar

Playing
-------

TicTacToe will prompt you for input to configure the game and to play a move on the game board.

To play a move, enter a number that corresponds to the board spaces:


           |       |
       0   |   1   |   2
           |       |
    -----------------------
           |       |
       3   |   4   |   5
           |       |
    -----------------------
           |       |
       6   |   7   |   8
           |       |

The player who succeeds in placing three respective marks in a horizontal, vertical, or diagonal row wins the game.

Development
-----------

Developed with:

* [Java](openjdk.java.net) 1.7.0_65
* [Gradle](http://www.gradle.org/) 2.1
* [JUnit](http://junit.org/) 4.11
* [GitHub](https://github.com/)
* [TravisCI](https://travis-ci.org)
