#####Háskólinn í Reykjavík, Haustönn 2014
#####Hugbúnaðarfræði, T-303-HUGB    
#####Kennari: Hannes Pétursson
<br>
######Alexandra Einarsdóttir
######Anna Louise Ásgeirsdóttir
######Birgitta Ósk Rúnarsdóttir
######Kolbrún Freyja Davidsen     
######Perla Þrastardóttir
######Sonja Steinarsdóttir

Development manual
---------------

The following instructions assume Linux is used. 

To get the project to build on a fresh machine the following programs are needed:

  * Git
  * Java
  * Travis

To set up Git on your machine, follow these instructions: 

  * https://help.github.com/articles/set-up-git/

To set up Java on your machine, execute the following command:
  
  * sudo apt-get install openjdk-7-jdk openjdk-7-jre

To sign up for Travis follow this link:

  * https://travis-ci.org/

To run the project the repository needs to be cloned from github, in your console window run the following command:

  * git clone git@github.com:Skvizurnar/TicTacToe.git

Make sure you are in the root folder for TicTacToe, and run the following commands:

  * gradle build
  * gradle run

Classes can be found in src/main/java/is/ru/verk
