package notebook;

import java.util.ArrayList;
import java.util.HashSet;

//�������飺����Ϊһ�����
class Value {
	private int i;
	public void set(int i) {
		this.i=i;
	}
	public int get() { return i;
	}
	public String toString() {
		return ""+i;
	}
}


public class NoteBook {
	private ArrayList<String> notes=new ArrayList<String>();
	//Container:ArrayListΪ�������ͣ�StringΪԪ������
	//��������ֻ��һ���洢������ʱ��չ
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s,int location) {
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNode(int index) {
		System.out.println(notes.get(index));
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a=new String[notes.size()];
//		for(int i=0;i<notes.size();i++)
//		{
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		NoteBook nb=new NoteBook();
		nb.add("first");
		nb.add("second");
	    nb.add("third",1);
	    nb.add("first",3);
	    nb.getNode(1);
	    System.out.println(nb.getSize());
	    //nb��һ��ArrayList����������ʱ���������.get()����������������a[i],
	  //  String[] a=nb.list();
	   
	    int[] ia=new int[10];
	    
	    
	    System.out.println("This is hashset:");
	  //HashsetΪ���ϣ�û�����򣬵���arraylist���ݷ���˳���������
	    HashSet<String> has=new HashSet<String>();
	    has.add("first");
	    has.add("Second");
	    has.add("first");
	    System.out.println(has);
	   //hashû��������get��indes��
	   
	    
	    
//	    for(int i=0;i<ia.length;i++)
//	    {
//	    	
//	    	ia[i]=i;
//	    }
//	    for(int k:ia) {
//	    	System.out.println(k);
//	    }
	    
	   
	    //�������飺
//	    
//	    Value[] al=new Value[10];
//	    for(int i=0;i<10;i++) {
//	    	al[i]=new Value();  //������ע��ʹ�ö�������ʱ������new��Ӧ�Ķ�����ܲ��ᱨ��
//	    	al[i].set(i); //������ÿ��Ϊһ������
//	    }
//	    for(Value k:al) {
//	    	System.out.println(k.get());
//	    	k.set(0);
//	    }
//	    for(Value k:al) {
//	    	System.out.println(k.get());
//	    	//����public string tostring������ֱ�Ӵ�k�Ϳ�����
//	    }
//	   
	   
	    System.out.println("end");
	}

}
