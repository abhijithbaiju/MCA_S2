#!/bin/bash

echo "Enter a number: "
read n

rev=$(echo "$n" | rev)

if [ "$n" == "$rev" ]; then
    echo "$n is a same "
else
    echo "$n is not a same"
fi
