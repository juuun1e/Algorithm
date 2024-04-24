import sys
Test = int(sys.stdin.readline().rstrip())

for i in range(1, Test+1) :
    A,B = map(int, sys.stdin.readline().split())
    print(f'Case #{i}: {A} + {B} = {A+B}')