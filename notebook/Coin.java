package notebook;

import java.util.HashMap;

//创建hash表


public class Coin {
		private HashMap<Integer,String> a=new HashMap<Integer,String>();
		public Coin(){
			a.put(1,"penny");
			a.put(10,"dime");
			a.put(25,"quarter");
			a.put(50,"dollar");
			a.put(50, "五毛");
			System.out.println(a.keySet().size());
			System.out.println(a);
			for(Integer k:a.keySet()) {
				String s=a.get(k);
				System.out.println(s);
			}
		}
 
		public String getName(int amount) {
			if(a.containsKey(amount)) {
				return a.get(amount);
			}
			else {
				return "Not Found";
			}
//		switch(amount) {
//		case 10:return "dime";
//		case 5:return "dollar";
//		}
//		
		
	}
	

	public static void main(String[] args) {
		Coin a=new Coin();
		System.out.println(a.getName(50));
		//HashMap也是一个集合，只会包含最后
		System.out.println("the end");
	}

}
