#!/bin/bash
function reverse
{
	local n=$1
	local r=0
	while((n>0));
	do
		r=$((r*10+n%10))
		n=$((n/10))
	done
	echo "$r"
}
echo "Enter a number: "
read n
result=$(reverse $n)
echo "Reverse of $n: $result"
