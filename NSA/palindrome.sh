#!/bin/bash

echo "Enter a string: "
read str

echo $str>temp
rvs="$(rev temp)"
if[$s==$rvs]; then
    echo "\"$str\" is a palindrome"
else
    echo "\"$str\" is not a palindrome"
fi
