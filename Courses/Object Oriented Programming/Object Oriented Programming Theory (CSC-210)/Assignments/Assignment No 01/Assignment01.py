class Car:

    def __init__(self, __made, __cname, __model, __transmission, __steering, __price):
        self.model = __model
        self.cname = __cname
        self.made = __made
        self.transmission = __transmission
        self.steering = __steering
        self.price = __price

    def Info(self):
        print(f"MADE           : {self.made}")
        print(f"CAR NAME       : {self.cname}")
        print(f"MODEL          : {self.model}")
        print(f"TRANSMISSION   : {self.transmission}")
        print(f"STEERING TYPE  : {self.steering}")
        print(f"PRICE PER DAY  : Rs{self.price}")

class Rent(Car):

    time = 0
    name = ""
    cont = 0
    address = ""

    def Charges(self):
        return self.price*self.time

    def Customer(self):
        self.name = input("\nEnter Your Name : ")
        self.cont = int(input("Enter Contact.No : "))
        self.address = input("Enter Address : ")
        self.time = int(
            input("For how many days do you want to rent a car : "))

    def Info(self):
        print(f"CUSTOMER NAME   : {self.name}")
        print(f"CONTACT NUMBER  : {self.cont}")
        print(f"ADDRESS         : {self.address}")
        print(f"MADE            : {self.made}")
        print(f"CAR NAME        : {self.cname}")
        print(f"MODEL           : {self.model}")
        print(f"TRANSMISSION    : {self.transmission}")
        print(f"STEERING TYPE   : {self.steering}")
        print(f"PRICE PER DAY   : {self.price}")
        print(f"CAR RENTED FOR  : {self.time} DAYS")
        print(f"TOTAL CHARGES   : Rs {self.Charges()}")


class Sale(Car):

    def __init__(self, __made, __cname, __model, __transmission, __steering, __price, __saleprice):
        super().__init__(__made, __cname, __model, __transmission, __steering, __price)
        self.saleprice = __saleprice
        self.name = ""
        self.cont = 0
        self.address = ""

    def Customer(self):
        self.name = input("\nEnter Your Name : ")
        self.cont = int(input("Enter Contact.No : "))
        self.address = input("Enter Address : ")

    def Info(self):
        print(f"MADE           : {self.made}")
        print(f"CAR NAME       : {self.cname}")
        print(f"MODEL          : {self.model}")
        print(f"TRANSMISSION   : {self.transmission}")
        print(f"STEERING TYPE  : {self.steering}")
        print(f"SALE PRICE     : Rs{self.saleprice}")

    def Reciept(self):
        print(f"CUSTOMER NAME   : {self.name}")
        print(f"CONTACT NUMBER  : {self.cont}")
        print(f"ADDRESS         : {self.address}")
        print(f"MADE            : {self.made}")
        print(f"CAR NAME        : {self.cname}")
        print(f"MODEL           : {self.model}")
        print(f"TRANSMISSION    : {self.transmission}")
        print(f"STEERING TYPE   : {self.steering}")
        print(f"SALE PRICE      : Rs{self.saleprice}")

class Admin(Car):

    username = "admin"
    pin = 12345
    checkusername = ""
    checkpin = 0

    def Login(self):
        print("\n\n~~~~~Login Page~~~~~\n\n")
        while(self.checkusername != self.username):
            while(self.checkpin != self.pin):
                self.checkusername = input("Enter username : ")
                if(self.checkusername == self.username):
                    self.checkpin = int(input("Enter pin : "))
                    if(self.checkpin == self.pin):
                        print("\nLogged In Successfully\n")
                    else:
                        print("\nInvalid Pin")
                else:
                    print("\ninvalid Username\n")

    def Update(self):
        print("\nWhat changes do you want to make for this Rent A Car (Select from following list)\n")
        print("1)MADE")
        print("2)CAR NAME")
        print("3)MODEL")
        print("4)TRANSMISSION")
        print("5)STEERING TYPE")
        print("6)PRICE PER DAY")
        num = int(input("\nType Option Number : "))
        match(num):
            case 1:
                self.made = input("\nMade : ")
                self.Info()
                
            case 2:
                self.cname = input(f"\nCar Name : ")
                self.Info()

            case 3:
                self.model = input("\nModel : ")
                self.Info()

            case 4:
                self.transmission = input("\nTransmission : ")
                self.Info()

            case 5:
                self.steering = input(f"\nSteering Type : ")
                self.Info()

            case 6:
                self.price = input("\nPrice/Day : ")
                self.Info()

            case _:
                print("\ninvalid option")

p = Car("TOYOTA", "GRANDE", "2020", "MANUAL", "Power", 15000)
p1 = Car("NISSAN", "DAYZ", "2018", "Auto", "Power", 11000)
p2 = Car("SUZUKI", "WAGON-R", "2015", "Auto", "Power", 10000)
p3 = Car("HONDA", "CIVIC", "2022", "Auto", "Power", 20000)

a = Admin("TOYOTA", "GRANDE", "2020", "MANUAL", "Power", 15000)
a1 = Admin("NISSAN", "DAYZ", "2018", "Auto", "Power", 110000)
a2 = Admin("SUZUKI", "WAGON-R", "2015", "Auto", "Power", 100000)
a3 = Admin("HONDA", "CIVIC", "2022", "Auto", "Power", 20000)

s = Sale("TOYOTA", "GRANDE", "2020", "MANUAL", "Power", 0, 2500000)
s1 = Sale("NISSAN", "DAYZ", "2018", "Auto", "Power", 0, 1800000)
s2 = Sale("SUZUKI", "WAGON-R", "2015", "Auto", "Power", 0, 1700000)
s3 = Sale("HONDA", "CIVIC", "2022", "Auto", "Power", 0, 8000000)

print("Select Option\n\n1)Admin\n2)User")
ser = int(input("\nType Here : "))

if(ser == 1):
    a.Login()
    print("\tCAR 1\n")
    p.Info()

    print("\n\tCAR 2\n")
    p1.Info()

    print("\n\tCAR 3\n")
    p2.Info()

    print("\n\tCAR 4\n")
    p3.Info()
    change = int(
        input("\n\nIn which car list do you want to make changes (Type Number) : "))
    match(change):
        case 1:
            a.Update()
        case 2:
            a1.Update()
        case 3:
            a2.Update()
        case 4:
            a3.Update()
        case _:
            print("Invalid Option")

elif(ser == 2):
    print("\nSelect Service\n\n1) Rent A Car\n2) Purchase Used Car")
    opt = int(input("\n(Type Option Number) : "))
    match(opt):
        case 1:
            print("\tCAR 1\n")
            p.Info()

            print("\n\tCAR 2\n")
            p1.Info()

            print("\n\tCAR 3\n")
            p2.Info()

            print("\n\tCAR 4\n")
            p3.Info()

            ans = int(input("\nSelect Car from following list (Type Number) : "))
            match(ans):
                case 1:
                    p = Rent("TOYOTA", "GRANDE", "2020",
                             "MANUAL", "Power", 15000)
                    p.Customer()
                    p.Charges()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    p.Info()
                case 2:
                    p1 = Rent("NISSAN", "DAYZ", "2018",
                              "Auto", "Power", 110000)
                    p1.Customer()
                    p1.Charges()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    p1.Info()
                case 3:
                    p2 = Rent("SUZUKI", "WAGON-R", "2015",
                              "Auto", "Power", 100000)
                    p2.Customer()
                    p2.Charges()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    p2.Info()
                case 4:
                    p3 = Rent("HONDA", "CIVIC", "2022", "Auto", "Power", 20000)
                    p3.Customer()
                    p3.Charges()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    p3.Info()

                case _:
                    print("Invalid Option")

        case 2:
            print("\tWe have Following Cars\n\nCAR 1\n")
            s.Info()

            print("\n\tCAR 2\n")
            s1.Info()

            print("\n\tCAR 3\n")
            s2.Info()

            print("\n\tCAR 4\n")
            s3.Info()

            ans = int(input("\nSelect Car from above list (Type Number) : "))
            match(ans):
                case 1:

                    s.Customer()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    s.Reciept()

                case 2:

                    s1.Customer()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    s1.Reciept()
                case 3:

                    s2.Customer()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    s2.Reciept()

                case 4:

                    s3.Customer()
                    print("\n\n~~~~~Reciept~~~~~\n\n")
                    s3.Reciept()

                case _:
                    print("Invalid Option")
        case _:
            print("Invalid Option")
else:
    print("Invalid Option")
