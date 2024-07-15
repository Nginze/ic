#!/bin/bash

# Create the dist directory if it doesn't exist
mkdir -p dist

# Compile all Java files in the src directory and put the .class files in the dist directory
for file in src/*.java
do
    javac -d dist "$file"
done

# Change to the dist directory and run the Main class
cd dist
java Main