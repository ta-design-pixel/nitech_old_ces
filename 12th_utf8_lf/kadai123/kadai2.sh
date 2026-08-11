#!/bin/sh
## 課題２のスクリプト

mkdir -p output

for file in 010 020 030
do
    name=$(basename "$file")
    num=${name#graph}
    num=${num%.txt}

    file="graph/graph${num}.txt"
    java BFSTester "$file" > "output/ans${num}.txt"
    cat "output/ans${num}.txt"
done