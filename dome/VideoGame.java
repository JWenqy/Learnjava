package dome;

public class VideoGame extends Item {
	private int numberOfPlayers;
	
	
	
	public VideoGame(String title, boolean gotIt,int number) {
		super(title, gotIt);  //���˸��๹�캯�����������Ϊprivate�����������ûʲô��
		numberOfPlayers=number;
	}

	@Override
	public void print() {
		System.out.println("this is VedioGame.Override");
		super.print();
	}



	public static void main(String[] args) {
		VideoGame a=new VideoGame("the titleV",true,22);
		a.print();
		
		System.out.println("the end");
	}

}
