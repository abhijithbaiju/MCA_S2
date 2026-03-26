#!/bin/bash
echo "Enter a string: "
read s
r=$(echo $s|rev)
if [ "$s" == "$r" ];
then
	echo "$s is a palindrome"
else
	echo "$s is not a palindrome"
fi
