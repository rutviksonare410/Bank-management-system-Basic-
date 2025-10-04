import java.util.*;  

abstract class Account
{
    int acc;
    String name;
    double balance;

    protected int getacc()
    {
        return acc;
    }
    protected void setacc(int acc)
    {
        this.acc=acc;
    }
    

    protected String getname()
    {
        return name;
    }
    protected void setname(String name)
    {
        this.name=name;
    }

    protected double  getbalance()
    {
        return balance;
    }
    protected void setbalace(double balance)
    {
        this.balance=balance;
    }

    public void withdraw(int amount)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int otp=r.nextInt(10000);
        System.out.println("Your OTP is:= "+otp);
        System.out.print("Enter OTP Sent On Your Mobile:= ");
        if(otp==sc.nextInt())
        {
        if(balance>=amount)
        {
            
            balance-=amount;
            System.out.println("***********************!Withdraw Successful!*************************");
            System.out.println("Withdraw Successfull Of := "+amount+" rs");
            System.out.println("Available Balance:= "+balance+" rs");
            System.out.println("------------------------TRANSACTION DONE VIA CASH--------------------------");
        }
        else
        {
            System.out.println("insufficient balance*********!Withdraw Failed!*************************");
        }

        }
        else
        {
            System.out.println("Your OTP Is Invalid Please Enter Valid OTP");
            
        }   
    }
    ///////overloading For ATM/////////
public void withdraw(int amount, int atm)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int otp=r.nextInt(10000);
        System.out.println("Your OTP is:= "+otp);
        System.out.print("Enter OTP Sent On Your Mobile:= ");
        if(otp==sc.nextInt())
        {
        if(balance>=amount)
        {
            
            balance-=amount;
            System.out.println("***********************!Withdraw Successful!*************************");
            System.out.println("Withdraw Successfull Of := "+amount+" rs");
            System.out.println("Available Balance:= "+balance+" rs");
            System.out.println("------------------------TRANSACTION DONE VIA ATM--------------------------");
        }
        else
        {
            System.out.println("insufficient balance*********!Withdraw Failed!*************************");
        }

        }
        else
        {
            System.out.println("Your OTP Is Invalid Please Enter Valid OTP");
            
        }
    }

    ////////overloading For Visa////////
public void withdraw(int amount, String visa)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int otp=r.nextInt(10000);
        System.out.println("Your OTP is:= "+otp);
        System.out.print("Enter OTP Sent On Your Mobile:= ");
        if(otp==sc.nextInt())
        {
        if(balance>=amount)
        {
            
            balance-=amount;
            System.out.println("***********************!Withdraw Successful!*************************");
            System.out.println("Withdraw Successfull Of := "+amount+" rs");
            System.out.println("Available Balance:= "+balance+" rs");
            System.out.println("------------------------TRANSACTION DONE VIA VISA--------------------------");
        }
        else
        {
            System.out.println("insufficient balance*********!Withdraw Failed!*************************");
        }

        }
        else
        {
            System.out.println("Your OTP Is Invalid Please Enter Valid OTP");
            
        }

    }


    /////////deposit/////////
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("***********************!Deposit Successful!*************************");
        System.out.println("Deposit Successfull Of := "+amount+" rs");
        System.out.println("Available Balance:= "+balance +" rs");
    }
    
    
    public void display()
    {
        System.out.println("Account Number: "+getacc());
        System.out.println("Account Holder Name: "+getname());
        System.out.println("Account Balance: "+getbalance());

    }
}

class Savings extends Account
{
     

    public Savings(int acc,String name, double balance)
    {
        System.out.println("***********************!Savings Account!*************************");
        setacc(acc);
        setname(name);
        setbalace(balance);
        
    }
    
    
}


class Current extends Account
{
    int limit = 1000;

    public Current(int acc, String name, double balance, int limit)
    {
        System.out.println("***********************!Current Account!*************************");
        setacc(acc);
        setname(name);
        setbalace(balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount);
    
    if(amount>limit)
    {
        System.out.println("Your Withdraw Limit Is Exceed");
    }
}
}



class Bank
{
    public static void main(String[] args)
    {

        
        Current c = new Current(123, "Saurabh Sonare", 5000, 1000);
        c.display();
        c.deposit(2000);
        c.withdraw(1000);
        System.out.println("--------------------------------------------------");


        Current c1= new Current(123, "Rutvik Sonare", 9000, 10000);
        c1.display();
        c1.deposit(2100);
        c1.withdraw(9000,123442);
        System.out.println("--------------------------------------------------");


        Account d= new Current(123, "Hiamnshu Sonare", 7000, 20000);
        d.display();
        d.deposit(12000);
        d.withdraw(15000,"!@#DDSD");
    }
}

