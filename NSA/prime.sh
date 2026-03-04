#!/bin/bash

echo "Enter a number: "
read n
flag=1
for (( i=2;i<=n/2;i++ ))
do
	if [ $((n%i)) -eq 0 ]; then
		flag=0
		break
	 fi
done

if [ $n -eq 1 ]; then
	echo "1 is neither prime nor composite"

elif [ $flag -eq 1 ]; then
	echo " $n is prime number "
else
	echo "$n is not a Prime number "
fi
