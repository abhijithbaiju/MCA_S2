#!/bin/bash
echo "Enter a decimal number: "
read d
b=""
while [ $d -gt 0 ];
do
	r=$((d%2))
	b="$r$b"
	d=$((d/2))
done
echo "The binary equivalent is: $b"
