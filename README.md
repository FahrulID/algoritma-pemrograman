<div id="top"></div>
<br />

<h3 align="center">Algoritma Pemrograman</h3>

  <p align="center">
    This is a repo for my Courseworks for my class "Algoritma Pemrograman".
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#build">Build</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This is a branch of my "Algoritma Pemrograman" class. In this branch, i uploaded my solution for the CourseWork2. <br />
I'm Fahrul Ramadhan Putra <br />
with NRP of 5026211118 <br />
<br />
In this branch, i provide my solution to the courseworl 2 <br />
Where i make a simple Java Libs ( Mad Libs with Java ) based on Jimmy Fallon's Mad Libs Theater, especially with Benedict Cumberbatch <br />

#### Task

Tasks <br />
Your goal is to create a program similar to JavaLibs. Write a story where certain parts of the resulting story <br />
text are modified by the user’s input. Prompt the user for various inputs. <br />
You may accept user any number of ways, including a JOptionPane, or Scanner input from the console. <br />
However, choose only one method. Don’t use multiple methods of accepting input. Similarly, if you use <br />
JOptionPane to get input, use JOptionPane to show the resulting story. <br />
When you output your story, make sure your all your text is visible at the same time. It’s not ok for text to be <br />
too long for your computer screen or output window. Your story will need to be spread across several lines <br />
instead of being printed in one giant line of output. This helps keep your output clean and your program more <br />
user friendly. <br />
It’s ok for your program to crash if the user inputs inappropriate data. In other words, It’s ok if your program <br />
crashes because you’ve expected the user to input a number, when they’ve instead input a String. We’ll <br />
cover exception handling later in the course. <br />
Your program must also do the following: <br />
* Accept at least 1 input, to be parsed as a String
* Accept at least 1 input, to be parsed as an int
* Accept at least 1 input, to be parsed as a double
* Use at least 1 input in a question for the user
* Do math with at least 1 int input
* Do math with at least 1 double input
* Accept at least 10 total inputs

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

* [Java](https://www.oracle.com/java/technologies/downloads/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you can setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

Prerequisites for building this project.

* Java SDK
  ```sh
  sudo apt install libc6-i386 libc6-x32 curl -y
  curl  -O https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz
  sudo apt install curl -y
  tar -xvf jdk-17_linux-x64_bin.tar.gz
  sudo mv jdk-17.{version} /opt/jdk17
  export JAVA_HOME=/opt/jdk17
  export PATH=$PATH:$JAVA_HOME/bin
  ```

### Build

1. Clone this branch
   ```sh
   git clone -b CourseWork2 gh repo clone FahrulID/algoritma-pemrograman
   ```
2. Compile .Java
   ```sh
   cd src
   javac JavaLibs5026211118.java
   ```
3. Build .jar
   ```sh
   jar cmf manifest.mf JavaLibs5026211118.jar JavaLibs5026211118.class
   ```

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

#### With Command Lines

1. With Command Lines
   ```sh
   cd src
   java -jar JavaLibs5026211118.jar
   ```

#### Double Click

1. Literally just double click it.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Fahrul Ramadhan Putra - [Twitter](https://twitter.com/fahrulrputra) - [Instagram](https://www.instagram.com/fahrulrputra/) - fahrulrputra@gmail.com

Project Link: [https://github.com/FahrulID/algoritma-pemrograman](https://github.com/FahrulID/algoritma-pemrograman)

<p align="right">(<a href="#top">back to top</a>)</p>