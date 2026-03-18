#!/bin/bash
NUMBERS=(5 3 8 1 9 4 7 2)
s=${NUMBERS[0]}
l=${NUMBERS[0]}
for n in "${NUMBERS[@]}";
do
	if(( n<s )); then
		s=$n
	fi
	if(( n>l )); then
		l=$n
	fi
done

echo "Smallest number: $s"
echo "Largest number: $l"
