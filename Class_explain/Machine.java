package Class_java;
public class Machine {

	int price;      //��Ա�������Ա����
	int balance;
	int total;
	
	Machine()			//���캯��
	{
		total=0;
	}
	Machine(int price)   //����
	{
		this.price=price;
		this.getFood();  //��Ա�����ڲ������Լ��ĺ���
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
