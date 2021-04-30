//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MarvellousListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
}
class FirstWindow
{
    public JFrame fobj;

    public FirstWindow()
	{
	    fobj = new JFrame("Marvellous Infosystems");
		JButton bobj1 = new JButton("Login");
		JButton bobj2 = new JButton("Cancle");
		JLabel lobj = new JLabel("Marvellous Login Portal");
		JLabel username = new JLabel("Username");
		JLabel password = new JLabel("Password");
		JTextField ut = new JTextField("Enter your username");
		JTextField pt = new JTextField("Enter your passowrd");
		lobj.setBounds(70,30,300,30);
		username.setBounds(20,80,80,30);
		ut.setBounds(110,80,150,30);
		password.setBounds(20,120,80,30);
		pt.setBounds(110,120,150,30);
		bobj1.setBounds(70,170,80,30);// x y w h
		bobj2.setBounds(160,170,80,30);
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(username);
		fobj.add(password);
		fobj.add(ut);
		fobj.add(pt);
		fobj.setSize(300,250);
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new MarvellousListener());

	}
}
	class GUI2
{
	public static void main(String arg[])
	{
		FirstWindow obj = new FirstWindow();
	}
}
