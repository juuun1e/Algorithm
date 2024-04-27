import sys

for i in sys.stdin:
    a, b = map(int,i.split())
    if a+b != 0 :
        print(a+b)