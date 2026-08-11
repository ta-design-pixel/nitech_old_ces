#!/bin/sh
# 課題１の内容を記述せよ

mkdir -p output

for file in graph/graph*.txt
do
    name=$(basename "$file")

    java GraphTester "$file" > "output/$name"

    diff "$file" "output/$name"
done