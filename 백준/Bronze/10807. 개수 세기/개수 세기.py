import sys
N = int(sys.stdin.readline().rstrip())
n_list = list(map(int, sys.stdin.readline().split()))
V = int(sys.stdin.readline().rstrip())

print(n_list.count(V))