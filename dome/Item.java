package dome;

public class Item {
	private String title;  //����CD��ʹû�г�ʼ��titleҲ�����Զ��̳и������ж���������������private�����Բ��ɼ�
	//protected String title;
	//�����еĳ�ʼ�����������ʼ���������������������ʼ��������������������������Ķ����ʼ����������������Ķ����ʼ��������
	
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
		System.out.println("����DVD����û��print��������Ӹ���Item�еõ��̳�");
		
	}
	
	public String printtitle() {
		return title;
	}
	

}
