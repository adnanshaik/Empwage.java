#!/bin/bash -x

sum=0
until [ $r1 -eq 6 ] && [ $r2 -eq 6 ]
do
r1=$((RANDOM%6+1))
r2=$((RANDOM%6+1))
sum=$((sum+r1+r2))
done

echo $sum




