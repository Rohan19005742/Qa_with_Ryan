#!/bin/bash
 
# Navigate to the source directory
cd src || exit
 
# Compile the Java files
echo "Compiling Java files..."
javac mypackage/*.java
 
# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful."
    # Run the Main class
    echo "Executing Main class..."
    java mypackage.Main
else
    echo "Compilation failed."
fi