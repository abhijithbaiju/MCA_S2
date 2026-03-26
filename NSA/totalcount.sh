 #!/bin/bash
s="."
f=$(find "$s" -type f -name "*.txt")  # Corrected the spacing here
count=0
for file in $f;  # Changed $files to $f
do
        occ=$(grep -o "Linux" "$file" | wc -l)  # Changed -1 to -l
        count=$((count + occ))
done
echo "Total count of 'Linux' in all .txt files: $count"


