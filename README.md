# Java Coding Test Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction
Welcome to the Java Coding Test Project! This repository contains a collection of coding problems and their solutions written in Java. It's designed to help you practice and improve your coding skills.

## Features
- A variety of coding problems from easy to hard.
- Well-documented solutions with explanations.
- Test cases for each problem.
- Easy to run and test.

## Installation
To get started with this project, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/java-coding-test.git
    cd java-coding-test
    ```

2. **Set up your environment:**
    Ensure you have Java and Maven installed on your machine.

    **For Mac:**
    ```bash
    brew install java
    brew install maven
    ```

    **For Windows:**
    Download and install [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and [Maven](https://maven.apache.org/download.cgi).

3. **Build the project:**
    ```bash
    mvn clean install
    ```

## Usage
To run a specific coding test, use the following command:
```bash
mvn exec:java -Dexec.mainClass="com.yourpackage.MainClass"
