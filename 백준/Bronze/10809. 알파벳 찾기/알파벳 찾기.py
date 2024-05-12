sword = input()
eng = 'abcdefghijklmnopqrstuvwxyz'
for i in eng:
    if i in sword:
        print(sword.index(i),end=' ')
    else:
        print(-1, end=' ')