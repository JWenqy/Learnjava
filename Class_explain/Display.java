package Second;


class A{
	//�ǿ��Ե� һ�����뵥Ԫ�ж����
	//����һ�����뵥Ԫ�����ж��public �࣬�������ﲻ��д public class A
	//��public ֻ���ڰ��������� ��ȥ�򲻿���
}
public class Display {
	
	//����=����+����
	private int value=0;
	private int limit=0;
	
	public Display(int limit)
	{this.limit=limit;}
	
	public void increase() {
		value++;
		if(value==limit)
		{
			value=0;
		}
	}
	
	public void show(Display r) {
		int a;
		a=r.limit+r.value;
		//˽���������ģ�������ﻹ��Display�࣬��ô�ǿ��Է��ʵ�����
	}
	
	public int getvalue()
	{ return value;}
	
	//friendly ��λ��ͬһ����  class_java����ͬʱ����
	int anotherV(int a,int b) {
		int c=a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		Display d=new Display(24);
		

	}

}
