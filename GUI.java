
import java.awt.*;

class Firstwindow
{
	public Frame fobj;
	public Firstwindow()
	{
		Frame fobj = new Frame("Marvellous Infosystems");
		Button bobj1 = new Button("Login");
		Button bobj2 = new Button("Cancle");
		Label lobj = new Label("Marvellous Login Portal");
		Label username = new Label("Username");
		Label password = new Label("Password");
		TextField ut = new TextField("Enter your username");
		TextField pt = new TextField("Enter your passowrd");
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
	}
}

class GUI
{
	public static void main(String arg[])
	{
		Firstwindow obj = new Firstwindow();
	}
}
