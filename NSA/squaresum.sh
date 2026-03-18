#!/bin/bash
echo " Enter a number: "
read n
sum=0
while [ $n -ne 0 ]
do
	digit=$((n % 10))
	sum=$((sum+digit*digit))
	n=$((n/10))
done
echo "The sum of the squares of the digit is $sum"
