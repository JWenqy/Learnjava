package Class_java;

import Second.Display;

public class Clock {
	private Display hour=new Display(24);  //two classes
	//the member var in one class can be another class  ��Ա����
	//clock let the clock ������display������������л���
	private Display minute=new Display(60);
    //a=hour.limit  is not visible
	public void start()
	{
		while(true) {
		minute.increase();
		if(minute.getvalue()==0) {
			hour.increase();
		}
		System.out.printf("%02d:%02d\n",hour.getvalue(),minute.getvalue());
	}
	}
	
	public static void main(String[] args) {
		Clock clock=new Clock();
		//clock.start();
		//clock.hour.anotherV(2,7);  Dispaly λ��Second��ʱ������
	}

}
