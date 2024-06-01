point_x = []
point_y = []
four_x = 0
four_y = 0

for _ in range(3):
    x,y = map(int,input().split())
    point_x.append(x)
    point_y.append(y)

for i in range(3):
    if point_x.count(point_x[i]) == 1: # x좌표 중 한 번만 존재하는 포인트
        four_x = point_x[i]
    if point_y.count(point_y[i]) == 1: # y좌표 중 한 번만 존재하는 포인트
        four_y = point_y[i]

print(four_x, four_y)