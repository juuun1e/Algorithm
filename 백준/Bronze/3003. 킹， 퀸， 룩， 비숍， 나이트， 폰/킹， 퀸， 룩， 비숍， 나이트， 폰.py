total = [1, 1, 2, 2, 2, 8]

chess = list(map(int, input().split()))
for i in range (6):
    print(total[i]-chess[i], end=' ')