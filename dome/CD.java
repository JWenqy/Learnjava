package dome;

public class CD extends Item {
	//private String title;
	private String singer;
	private int time;
	private String rank;
	//private boolean gotIt;
	private String comment;
	
	
	public CD(String title,String singer, int time, String rank,boolean gotIt,String comment) {
		super(title,gotIt);  //不论访问父类得到还是自身输入，这里子类的构造器中必须都有gotIt属性
		//此时首先跳入父类的构造函数public(title)中，如果父类title为private，子类这时title值是被有了父类构造函数,gotit 为false
		//但父类为title时，说明不可访问底下不能再有this.title=title，子类无权利再更改或者类别中不能访问title
		//this.title=title;   //如果有这行，那么原来的父类title内容再次变化成输入title，如果没有这行，输出内容即为父类title
		this.singer = singer;
		this.time = time;
		this.rank = rank;
		this.comment = comment;
	}


	
	@Override  //函数重载，与父类或者object类有完全相同的值型
	public String toString() {
		return "CD [singer=" + singer + ", time=" + time + ", rank=" + rank + ", comment=" + comment + ", toString()="
				+ super.toString() + "]";
	}
	//可以方便显示类的内容

	
	
	public static void main(String[] args) {
		CD cd=new CD("title4","xx",5,"bad",true,"--**"); //虽然两者内容一致，但是实际在两处空间内存创建没有关系，地址不同，是两个新的对象
		CD cd1=new CD("title4","xx",11,"bad",true,"--**");
		System.out.println(cd.equals(cd1)); //返回true值，因为两者singer一样
		cd.print();
		String s="object  "+cd;
		System.out.println(s);
		
		
		
	     System.out.println("the end");	
	}

	@Override
	public boolean equals(Object obj) {
		CD cc=(CD)obj;  //先向下造型
		return singer.equals(cc.singer);
	}



	public void print() {
		//System.out.println(title+"--"+singer+":"+time+" "+rank+" "+comment); 
		//父类title为private时，不能直接访问,那么如果想要访问，可以在父类设计一个print函数
		System.out.println(super.printtitle()+"--"+singer+":"+time+" "+rank+" "+gotIt+comment); 
		
		
		
		
	}

}
