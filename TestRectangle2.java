
class Account{
int acc no;
String name;
float amount;
void insert(int a,String n,float amt){
acc no=a;
name=n;
amount=amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("insufficient Balance");
}else{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void chechBalace(){System.out.println("Balance is:"+amount);}
void display(){System.out.println(acc no+""+name+""+amount);}
}
class TestAccount{
public static void main(String[] args){
Account a1=new Account();
a1.insert(832345,"Ankith",1000);
a1.checkBalance();
a1.deposite(40000);
a1.checkBalance();
a1.withdraw(15000);





