students = [1+i for i in range(30)]
for _ in range(28):
    num = int(input())
    students.remove(num)
print(min(students))
print(max(students))
