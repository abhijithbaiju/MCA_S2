#!/bin/bash
echo "Enter a line of text: "
read n
count=0
for((i=0;i<${#n};i++));
do
	char=${n:i:1}
	case $char in
		[aeiouAEIOU])
			count=$((count+1))
			;;
	esac
done
echo "The number of vowels inn the line of text is: $count"
