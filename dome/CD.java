package dome;

public class CD extends Item {
	//private String title;
	private String singer;
	private int time;
	private String rank;
	//private boolean gotIt;
	private String comment;
	
	
	public CD(String title,String singer, int time, String rank,boolean gotIt,String comment) {
		super(title,gotIt);  //���۷��ʸ���õ������������룬��������Ĺ������б��붼��gotIt����
		//��ʱ�������븸��Ĺ��캯��public(title)�У��������titleΪprivate��������ʱtitleֵ�Ǳ����˸��๹�캯��,gotit Ϊfalse
		//������Ϊtitleʱ��˵�����ɷ��ʵ��²�������this.title=title��������Ȩ���ٸ��Ļ�������в��ܷ���title
		//this.title=title;   //��������У���ôԭ���ĸ���title�����ٴα仯������title�����û�����У�������ݼ�Ϊ����title
		this.singer = singer;
		this.time = time;
		this.rank = rank;
		this.comment = comment;
	}


	
	@Override  //�������أ��븸�����object������ȫ��ͬ��ֵ��
	public String toString() {
		return "CD [singer=" + singer + ", time=" + time + ", rank=" + rank + ", comment=" + comment + ", toString()="
				+ super.toString() + "]";
	}
	//���Է�����ʾ�������

	
	
	public static void main(String[] args) {
		CD cd=new CD("title4","xx",5,"bad",true,"--**"); //��Ȼ��������һ�£�����ʵ���������ռ��ڴ洴��û�й�ϵ����ַ��ͬ���������µĶ���
		CD cd1=new CD("title4","xx",11,"bad",true,"--**");
		System.out.println(cd.equals(cd1)); //����trueֵ����Ϊ����singerһ��
		cd.print();
		String s="object  "+cd;
		System.out.println(s);
		
		
		
	     System.out.println("the end");	
	}

	@Override
	public boolean equals(Object obj) {
		CD cc=(CD)obj;  //����������
		return singer.equals(cc.singer);
	}



	public void print() {
		//System.out.println(title+"--"+singer+":"+time+" "+rank+" "+comment); 
		//����titleΪprivateʱ������ֱ�ӷ���,��ô�����Ҫ���ʣ������ڸ������һ��print����
		System.out.println(super.printtitle()+"--"+singer+":"+time+" "+rank+" "+gotIt+comment); 
		
		
		
		
	}

}
