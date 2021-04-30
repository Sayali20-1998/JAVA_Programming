
import java.awt.*;
import java.awt.event.*;


class MarvellousListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class MarvellousActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button Clicked");
	}
}



class FirstWindow
{
	public Frame fobj;
	public FirstWindow()
	{
		fobj = new Frame("Marvellous InfoSystems");
		Button bobj1 = new Button("Login");
		Button bobj2 = new Button("Cancle");
		Label lobj = new Label("Marvellos Login Portal");
		Label username = new Label("Username");
		Label password = new Label("Password");
		TextField ut = new TextField("Enter your Username");
		TextField pt = new TextField("Enter your password");
		

		fobj.addWindowListener(new MarvellousListener());
		bobj1.addActionListener(new MarvellousActionListener());
		
		lobj.setBounds(70,30,300,30);
		username.setBounds(20,80,80,30);
		ut.setBounds(110,80,150,30);
		password.setBounds(20,120,80,30);
		pt.setBounds(110,120,150,30);
		bobj1.setBounds(70,170,80,30);//x y w h
		bobj2.setBounds(160,170,80,30);

		
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(username);
		fobj.add(password);
		fobj.add(ut);
		fobj.add(pt);
		fobj.setSize(350,250);
		fobj.setLayout(null);
		fobj.setVisible(true);

	}
}

class GUI3
{
	public static void main(String arg[])
	{
		FirstWindow obj = new FirstWindow();	
	}
}