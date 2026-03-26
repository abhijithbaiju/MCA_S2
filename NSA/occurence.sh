#!/bin/bash
echo "Enter the file name: "
read f
if [ ! -f "$f" ]; 
then
    echo "File not found!"
    exit 1
fi
c=$(tr '[:upper:]' '[:lower:]' < "$f" | sed 's/[^a-z0-9 ]//g')
w=($c)
declare -A count
for word in "${w[@]}"; do
    if [ -n "$word" ]; then
        ((count[$word]++))
    fi
done
echo "Unique words in $f: "
for word in "${!count[@]}"; do
    echo "$word: ${count[$word]}"
done
