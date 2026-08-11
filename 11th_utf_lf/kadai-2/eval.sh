#!/bin/sh
# バッチ処理用のシェルスクリプトを作成する
mkdir -p output

javac KP.java Solver.java

for file in input/*.txt
do
    name=$(basename "$file")
    java KP < "$file" > "output/$name"
done