# !/bin/bash

# Compile the Java source files
javac Player.java Main.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful."

    # Run the Java program
    java Main
else
    echo "Compilation failed. Please check the source code for errors."
fi
