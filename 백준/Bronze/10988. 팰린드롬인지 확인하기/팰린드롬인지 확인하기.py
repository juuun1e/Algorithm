words = list(input())
if words[::1] == words[::-1]:
    print(1)
else:
    print(0)