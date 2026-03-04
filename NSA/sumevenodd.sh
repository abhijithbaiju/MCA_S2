#!/bin/bash

echo "Enter a set of numbers separated by space:"
read -a numbers

sumeven=0
sumodd=0

for num in "${numbers[@]}"
do
    if (( num % 2 == 0 )); then
        ((sumeven += num))
    else
        ((sumodd += num))
    fi
done

echo "Sum of even numbers is: $sumeven"
echo "Sum of odd numbers is: $sumodd"
