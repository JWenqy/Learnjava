package notebook;

import java.util.ArrayList;
import java.util.HashSet;

//对象数组：数组为一组对象
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
	//Container:ArrayList为容器类型，String为元素类型
	//不像数组只有一定存储，可随时扩展
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
	    //nb是一个ArrayList容器，访问时本身借用了.get()方法，而数组则是a[i],
	  //  String[] a=nb.list();
	   
	    int[] ia=new int[10];
	    
	    
	    System.out.println("This is hashset:");
	  //Hashset为集合，没有排序，但是arraylist根据放入顺序进行排序
	    HashSet<String> has=new HashSet<String>();
	    has.add("first");
	    has.add("Second");
	    has.add("first");
	    System.out.println(has);
	   //hash没有排序，则get（indes）
	   
	    
	    
//	    for(int i=0;i<ia.length;i++)
//	    {
//	    	
//	    	ia[i]=i;
//	    }
//	    for(int k:ia) {
//	    	System.out.println(k);
//	    }
	    
	   
	    //对象数组：
//	    
//	    Value[] al=new Value[10];
//	    for(int i=0;i<10;i++) {
//	    	al[i]=new Value();  //！！！注意使用对象数组时必须先new相应的对象才能不会报错
//	    	al[i].set(i); //数组中每个为一个对象
//	    }
//	    for(Value k:al) {
//	    	System.out.println(k.get());
//	    	k.set(0);
//	    }
//	    for(Value k:al) {
//	    	System.out.println(k.get());
//	    	//加上public string tostring后，这里直接打k就可以了
//	    }
//	   
	   
	    System.out.println("end");
	}

}
