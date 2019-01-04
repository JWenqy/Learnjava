package Class_java;
public class Machine {

	int price;      //成员变量与成员函数
	int balance;
	int total;
	
	Machine()			//构造函数
	{
		total=0;
	}
	Machine(int price)   //重载
	{
		this.price=price;
		this.getFood();  //成员函数内部调用自己的函数
	}
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount)
	{
		balance=balance+amount;
		this.showBalance();
		
	}
	void showBalance()
	{
		System.out.println(balance);
		
	}
	void getFood()
	{
		if(balance>=price) {
			System.out.println("Here you are");
			balance-=price;
			total+=price;
		}
	}
	
	//ctrl+shift+B break Point 
	public static void main(String[] args) {
	Machine a=new Machine(100);	
	a.showBalance();
	}

}
