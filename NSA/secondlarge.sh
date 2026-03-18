#!/bin/bash
NUMBERS=(5 3 8 1 9 4 7 2)
h=${NUMBERS[0]}
sh=${NUMBERS[0]}
for n in "${NUMBERS[@]}";
	do
		if((n>h));
		then
			sh=$h
			h=$n
		elif((n!=h))&&((n>sh));
		then
			sh=$n
		fi
	done
	echo "Second largest number: $sh"



