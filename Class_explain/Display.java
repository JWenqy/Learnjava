package Second;


class A{
	//是可以的 一个编译单元有多个类
	//但是一个编译单元不能有多个public 类，比如这里不能写 public class A
	//无public 只能在包里起作用 出去则不可以
}
public class Display {
	
	//对象=属性+操作
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
		//私有是针对类的，如果这里还有Display类，那么是可以访问到变量
	}
	
	public int getvalue()
	{ return value;}
	
	//friendly 即位于同一个包  class_java可以同时运行
	int anotherV(int a,int b) {
		int c=a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		Display d=new Display(24);
		

	}

}
