import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {   //class-Runnable
			@Override
			public void run() {     //run method
				new WindowFrame();      //new instances
			}
		});
	}

}

//WindowFrame object on the event dispatch thread. 
//The WindowFrame class is expected to contain the necessary code for building and displaying the main window of the application.
