#!/bin/bash

echo "Enter the radius of the circle: "
read r

pi=3.14159

area=$(echo "$pi * $r * $r" | bc)

circumference=$(echo "2 * $pi * $r" | bc)

echo "Area of the circle: $area"
echo "Circumference of the circle: $circumference"
