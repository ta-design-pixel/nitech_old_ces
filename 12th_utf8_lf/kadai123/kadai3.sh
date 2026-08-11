#!/bin/sh
## 課題３のスクリプト

mkdir -p output

for file in 005 015 025
do
    name=$(basename "$file")
    num=${name#graph}
    num=${num%.txt}
    file="graph/graph${num}.txt"

    java DFSTester "$file" > "output/ans$num.txt"
    cat "output/ans${num}.txt"
done