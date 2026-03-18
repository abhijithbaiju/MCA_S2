#!/bin/bash

echo "Enter a number: "
read n

s=${n:0:1}
for((i=1;i<${#n};i++));
do
	digit=${n:i:1}
	if((digit<s)); then
		s=$digit
	fi
done
echo "The smallest digit is: $s" 
