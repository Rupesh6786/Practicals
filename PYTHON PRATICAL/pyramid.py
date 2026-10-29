rows = int(input("Enter number of rows: "))

ascii_value = 1

for i in range(rows):
    for j in range(i+1):
        num = int(ascii_value)
        print(num, end=" ")
    
    ascii_value += 1
    print("\n")
