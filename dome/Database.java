package dome;

import java.util.ArrayList;

public class Database {

	//private ArrayList<CD> listCD=new ArrayList<CD>();
	//private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	private ArrayList<Item> listItem=new ArrayList<Item>();
	//对象变量都是此时Item静态，但是运行时有DVD有CD对象多态
	//
	
	/*public void add(CD cd) {
		listCD.add(cd);  //按照CD中的构造函数进行构造
	}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);  //按照CD中的构造函数进行构造
	}
*/	
	public void add(Item item) {
		listItem.add(item);
	}
		
	public void list() {
		/*for(CD cd:listCD)
		{
			cd.print();
		}
		*/
		for(Item item:listItem) {
			item.print();
		}
	}
	public static void main(String[] args) {
		Database db=new Database();
		db.add(new CD("title1","nd",10,"good",true,"***"));  //在输入一个构造类时，必须写new CD（）按照构造函数方法构造
		db.add(new CD("title2","ac",5,"bad",true,"--**"));
		db.add(new DVD("DVD's title ","eee",5,"0000"));
		db.list();
		//前两个item管理的CD的对象，所以print的时候就进入到CD的print，后面进入DVD的print
		//既然是一个item，就会print，至于是print父类还是CD还是DVD类不用考虑，多态
		
		//向上造型
		Item item=new Item();
		CD cd=new CD("title2","xx",5,"bad",true,"--**");
		//cd=item;    //把item交给cd不可以
		//item=cd;  //把cd交给item管理可以
		//怎样把item交给cd？
		int a=(int)10.2;  //此时10.2已经变成10
		item=(Item)cd;   //去掉这行会报错，只有当父类item此时实际管理的是一个CD类型底下才可造型
		//这里cd只是被造型被视为是Item类型，但是其CD类型并没有发生改变，Item的动态类型是CD
		CD cc=(CD)item;
		
		
		System.out.println("the end");
	}

}
