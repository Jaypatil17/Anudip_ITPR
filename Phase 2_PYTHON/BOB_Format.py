print("Welcome to BOB Bank")

nm = "Jayvardhan"
mob = 9699898190  
pin = 1234
balance = 2000

print("Enter your 4-digit UPI PIN & do not share it with anyone.")
entered_pin = int(input("Enter your UPI PIN: "))

if entered_pin == pin:
    ch = 'y'
    while ch.lower() == 'y':
        print("\nWelcome, it's your account.")
        print("Choose an option:")
        print("W - Withdraw")
        print("D - Deposit")
        print("B - Check Balance")
        
        key = input("Enter your choice: ").upper()

        if key == "W":
            am = int(input("Enter withdrawal amount: "))
            if am > balance:
                print("Insufficient bank balance.")
            else:
                balance -= am
                print(" Withdrawal successful. Amount: ",am)
                print("Current balance:",balance)

        elif key == "D":
            de = int(input("Enter deposit amount: "))
            balance += de
            print("Deposit successful. Amount:", de)
            print("Current balance:", balance)

        elif key == "B":
            print(f"Your current bank balance is: {balance}")

        else:
            print("Invalid choice. Please select W, D, or B.")

        ch = input("Do you want to perform another transaction? (y/n): ")

    print("Thank you for using BOB Bank!")

else:
    print("Incorrect PIN. Access denied.")
    f=(input("Forgot pin choose(y/n):")).upper()
    if(f=="Y"):
        m=int(input("Enter mob number or acc number :"))
        if(mob==m):
            new_pin=int(input("Enter new pin :"))
            pin=new_pin
            print("Your pin is succssfully.")
            
    else:
        pass
        
