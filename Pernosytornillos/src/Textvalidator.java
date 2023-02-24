import javax.swing.JOptionPane;

public class Textvalidator {

public Textvalidator() {
	
}
public boolean isanIntnumber(String b) {
	try {
		Integer.valueOf(b);
	}catch(Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Introducir valores numericos validos","Error",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if(Integer.valueOf(b)<0) {
		JOptionPane.showMessageDialog(null, "Introducir valores numericos validos(no menores a 0)","Error",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	return true;
	
	
}
}
