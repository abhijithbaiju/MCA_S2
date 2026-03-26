#!/bin/bash
echo "Enter directory path: "
read dir
nf=$(find $dir -type f|wc -l)
nd=$(find $dir -type d|wc -l)
echo "Number of files: $nf"
echo "Number of directories: $nd"

