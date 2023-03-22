
def add(x, y):
    result =  x + y
    return round(result, 2)
def subtract(x, y):
    result =  x - y
    return round(result, 2)
def multiply(x, y):
    result =  x * y
    return round(result, 2)
def divide(x, y):
    result =  x / y
    return round(result, 2)

print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")


# control + / to comment or use hash tag

a = 'y'

while a.lower() == 'y' : 
    choice = input("Enter choice(1/2/3/4):")
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))

    if choice == '1':           
        print("\n",num1,"+",num2,"= ", add(num1,num2),"\n")
    elif choice == '2' :       
        print("\n",num1,"-",num2,"=", subtract(num1,num2),"\n")
    elif choice == '3':
        print("\n",num1,"*",num2,"=", multiply(num1,num2),"\n")
    elif choice == '4' and num2 != 0:
        print("\n",num1,"/",num2,"=", divide(num1,num2),"\n")
    else:
        print("Invalid input \n")
    
    a = (input("Do you wish to continue? Y/N "))


