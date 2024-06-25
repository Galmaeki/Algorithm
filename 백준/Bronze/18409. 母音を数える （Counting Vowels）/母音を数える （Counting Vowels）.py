input()

text = input()
answer = 0
for i in text:
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
        answer += 1

print(answer)
