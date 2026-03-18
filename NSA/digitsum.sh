#!/bin/bash
function sumdigit
{
	local n=$1
	local s=0
	while((n>0));
	do
		s=$((s + n % 10))
		n=$((n/10))
	done
	echo "$s"
}
echo "Enter a Number: "
read n
result=$(sumdigit $n)
echo "Sum of digits of $n: $result"
