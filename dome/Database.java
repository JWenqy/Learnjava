package dome;

import java.util.ArrayList;

public class Database {

	//private ArrayList<CD> listCD=new ArrayList<CD>();
	//private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	private ArrayList<Item> listItem=new ArrayList<Item>();
	//����������Ǵ�ʱItem��̬����������ʱ��DVD��CD�����̬
	//
	
	/*public void add(CD cd) {
		listCD.add(cd);  //����CD�еĹ��캯�����й���
	}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);  //����CD�еĹ��캯�����й���
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
		db.add(new CD("title1","nd",10,"good",true,"***"));  //������һ��������ʱ������дnew CD�������չ��캯����������
		db.add(new CD("title2","ac",5,"bad",true,"--**"));
		db.add(new DVD("DVD's title ","eee",5,"0000"));
		db.list();
		//ǰ����item�����CD�Ķ�������print��ʱ��ͽ��뵽CD��print���������DVD��print
		//��Ȼ��һ��item���ͻ�print��������print���໹��CD����DVD�಻�ÿ��ǣ���̬
		
		//��������
		Item item=new Item();
		CD cd=new CD("title2","xx",5,"bad",true,"--**");
		//cd=item;    //��item����cd������
		//item=cd;  //��cd����item�������
		//������item����cd��
		int a=(int)10.2;  //��ʱ10.2�Ѿ����10
		item=(Item)cd;   //ȥ�����лᱨ��ֻ�е�����item��ʱʵ�ʹ������һ��CD���͵��²ſ�����
		//����cdֻ�Ǳ����ͱ���Ϊ��Item���ͣ�������CD���Ͳ�û�з����ı䣬Item�Ķ�̬������CD
		CD cc=(CD)item;
		
		
		System.out.println("the end");
	}

}
