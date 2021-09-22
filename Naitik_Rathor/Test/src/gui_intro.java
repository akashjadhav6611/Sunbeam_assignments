import javax.swing.JOptionPane;


public class gui_intro{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		//JOptionPane.showMessageDialog(null,"Your name is " + name);
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		//JOptionPane.showMessageDialog(null,"Your Age Is "+age);

		double height =Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
		JOptionPane.showMessageDialog(null,"You are "+name+" and your age is "+age+" and you are "+height+" cms tall.");
	}
}
