#!/bin/bash
read -p "Enter your password: " p


if [[ ${#p} -lt 8 ]]; then
    echo "Password length must be at least 8 characters"
    exit 1
fi


if [[ ! "$p" =~ [A-Za-z] && ! "$p" =~ [0-9] ]]; then
    echo "Password must contain both letters and numbers"
    exit 1
fi


if [[ ! "$p" =~ [a-z] || ! "$p" =~ [A-Z] ]]; then
    echo "Password must include both small and capital letters"
    exit 1
fi

echo "Password is valid"
