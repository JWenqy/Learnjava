package dome;

public class Item {
	private String title;  //子类CD即使没有初始化title也可以自动继承父类所有东西，但是这里是private，所以不可见
	//protected String title;
	//父类中的初始化包括定义初始化及构造器，先做定义初始化再做构造器，总是先做父类的定义初始化构造器再做子类的定义初始化构造器
	
	protected boolean gotIt=true;
	public Item()
	{
		
	}
	
	public Item(String title) {
		this.title="this is father title";
	}
	
	public Item(String title,boolean gotIt) {
		this.title="this is father title include got it=false";
		this.gotIt=false;
		
	}
	public static void main(String[] args) {
		

	}

	public void print() {
		System.out.println("由于DVD子类没有print方法，则从父类Item中得到继承");
		
	}
	
	public String printtitle() {
		return title;
	}
	

}
