import sys
n = int(sys.stdin.readline().rstrip())
scores = list(map(int, sys.stdin.readline().split()))
high = max(scores)

for i in range(n):
    scores[i] = scores[i]/high * 100
print(sum(scores)/n)