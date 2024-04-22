import sys

Test = int(sys.stdin.readline().rstrip())

for i in range(Test) :
    A,B = map(int, sys.stdin.readline().split())
    print(A+B)