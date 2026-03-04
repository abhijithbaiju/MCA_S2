#!/bin/bash

echo "Enter a number: "
read n
count=${#n}
sum=0
for ((i=0;i<count;i++))
do
	digit=${n:i:1}
	sum=$((sum + digit**count))
done

if [ "$sum" -eq "$n" ]; then
	echo "$n is an Armstrong Number"
else
	echo "$n is not an Armstrong Number"
fi
