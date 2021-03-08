package app;

public class Application {

	public static void main(String[] args) {
		
		View view = new View();
		Controller controller = new Controller(view);
		view.getFrame().setVisible(true);

		
	}
}
