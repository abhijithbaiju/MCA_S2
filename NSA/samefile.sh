#!/bin/bash

# Check if two arguments are provided
if [ $# -ne 2 ]; then
    echo "Usage: $0 file1 file2"
    exit 1
fi

# Compare the files
if cmp -s "$1" "$2"; then
    echo "The contents of $1 and $2 are the same. Deleting $2..."
    rm "$2"
else
    echo "The contents of $1 and $2 are different"
fi

# create two files named file1.txt and file2.txt with same or different contents 
# run command - ./samefile.sh file1.txt file2.txt


