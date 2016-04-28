
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.init();

	}

	private void init() {
		Sommeil sommeil = new Sommeil();
	//	Reveil reveil= new Reveil();
		sommeil.start();
		//reveil.start();
		
	}

}
