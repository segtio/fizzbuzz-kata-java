# FizzBuzz kata java
FizzBuzz Kata

[![JAVA][java-badge]][java]
[![MAVEN][maven-badge]][maven]

[![Travis Build Status][build-badge]][build]
[![Coverage Status][coverage-badge]][coverage]

## Statement

### Problem Description

Write a program that prints the numbers from 1 to 100. But for multiples
of three print "Fizz" instead of the number and for the multiples of
five print "Buzz". For numbers which are multiples of both three and
five print "FizzBuzz ".

Sample output:

    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    11
    Fizz
    13
    14
    FizzBuzz
    16
    17
    Fizz
    19
    Buzz
    ... etc up to 100

### Stage 2 - new requirements

     * A number is fizz if it is divisible by 3 or if it has a 3 in it
     * A number is buzz if it is divisible by 5 or if it has a 5 in it

## Implementation

#### Conception

Create A Class with a static method converting numbers to the expected result

#### Prerequisites

- JAVA 1.8
- Maven 3.x.x
- Docker (optional)

#### Features

- [x] Printing Numbers from 1 to 100
- [x] Printing Fizz for numbers divisible by 3
- [x] Printing Buzz for numbers divisible by 5
- [x] Printing FizzBuzz for numbers divisible by 3 and five
- [x] Printing Fizz for numbers has 3
- [x] Printing Buzz for numbers has 5
- [x] Printing FizzBuzz for numbers has by 3 and five
- [x] Launch With Docker

## Run

### Test
    mvn clean test

### Launch
    clean package exec:java

### Docker

Build : `docker build -t fizzbuzz .` \
Run :  `docker run --rm -it fizzbuzz:latest`

[java-badge]: https://img.shields.io/badge/java-v1.8-red.svg
[java]: https://www.java.com/fr/download/
[maven-badge]: https://img.shields.io/badge/maven-v3.8.0-orange.svg
[maven]: https://maven.apache.org
[build-badge]: https://travis-ci.org/segtio/fizzbuzz-kata-java.svg?branch=master
[build]: https://travis-ci.org/segtio/fizzbuzz-kata-java
[coverage-badge]: https://coveralls.io/repos/github/segtio/fizzbuzz-kata-java/badge.svg?branch=master
[coverage]: https://coveralls.io/github/segtio/fizzbuzz-kata-java?branch=master