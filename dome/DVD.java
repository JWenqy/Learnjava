package dome;

public class DVD extends Item{
	private String reporter;
	private int time;
	//private boolean gotIt;
	private String comment;
	private String title;  //��������඼��title�����������title����,����֮��û���κι�ϵ
	
	public DVD(String title,String reporter, int time, String comment) {
		//super();    //��super��һ��ʱ,Ĭ��ִ��Item�Ŀչ��캯��������DVD���Զ��̳и������ԣ����Ը�ֵ�ɸ���չ��캯�����޹��캯������
		super(title);       
		//����̳��Ը����title���Ա�Ϊ��this is father title gotit Ϊfalse����gotitΪtrue
		//��ʹDVDû��title���ԣ�����Ҳ�̳��˸����title�����а���title����
		this.title=title;   // ���������title���Ա�ΪDVD��s title
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
