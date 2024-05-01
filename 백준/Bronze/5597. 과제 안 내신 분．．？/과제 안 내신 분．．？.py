students = list(range(1, 31))
report_list = []

for _ in range(28):
    num = int(input())
    report_list.append(num)
    complement = list(set(students) - set(report_list))
print(min(complement))
print(max(complement))