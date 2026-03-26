#!/bin/bash
l=("string1" "string2" "string3" "string4")
l=($(echo "${l[@]}" | tr ' ' '\n' | tac | tr '\n' ' '))
for i in "${!l[@]}"
do
	l[$i]=$(echo "${l[$i]}" | rev)
done
echo "${l[@]}"


