package inner_class;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MFrame extends Frame{
	public MFrame() {
		setTitle("AnonymousTest2");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(1300,1000);
		setVisible(true);
	}
}
public class test {

	public static void main(String[] args) {
		new MFrame();
	}

}
