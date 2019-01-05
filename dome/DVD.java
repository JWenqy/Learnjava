package dome;

public class DVD extends Item{
	private String reporter;
	private int time;
	//private boolean gotIt;
	private String comment;
	private String title;  //父类和子类都有title，会出现两个title属性,他们之间没有任何关系
	
	public DVD(String title,String reporter, int time, String comment) {
		//super();    //无super这一行时,默认执行Item的空构造函数，子类DVD中自动继承父类属性，属性赋值由父类空构造函数或无构造函数构建
		super(title);       
		//这里继承自父类的title属性变为“this is father title gotit 为false”，gotit为true
		//即使DVD没有title属性，这里也继承了父类的title，表中包含title属性
		this.title=title;   // 这里子类的title属性变为DVD‘s title
		this.reporter = reporter;   
		this.time = time;
		this.comment = comment;
	}

	/*public void print() {
		System.out.println(reporter+":"+time+" "+comment);
	}
*/

	public static void main(String[] args) {
		

	}

}
