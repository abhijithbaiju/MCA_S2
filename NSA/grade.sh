#!/bin/bash
INPUT_FILE="grades.txt"
if [[ ! -f "$INPUT_FILE" ]]; then
	echo "Input file not found!"
	exit 1
fi

declare -A grades
while read n;
do
	name=$(echo "$n" | cut -d ',' -f 1)
	grade=$(echo "$n" | cut -d ',' -f 2)
	grades["$name"]=$grade
done < "$INPUT_FILE"
    for name in "${!grades[@]}";
do
	echo "$name: ${grades[$name]}"
done
	
