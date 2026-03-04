#!/bin/bash
echo "Prime numbers  between 1 and 50 are: "
for (( n=2; n<=50; n++))
do 
	flag=1
	for((i=2;i<=n/2;i++))
	do
		if [ $((n%i)) -eq 0 ]; then
			flag=0
			break
		fi
	done

	if [ $flag -eq 1 ]; then
		echo $n
	fi
done
