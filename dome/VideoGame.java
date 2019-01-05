package dome;

public class VideoGame extends Item {
	private int numberOfPlayers;
	
	
	
	public VideoGame(String title, boolean gotIt,int number) {
		super(title, gotIt);  //用了父类构造函数，如果属性为private，输入的内容没什么用
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
