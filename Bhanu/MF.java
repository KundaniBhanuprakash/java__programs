import java.awt.*;

class MF
{
 

   public static void main(String a[])
    {
	Frame f;
	TextField t1,t2;
	Label l1,l2;
	Button b;
  
  	f=new Frame();
	t1=new TextField(10);
	t2=new TextField(20);
	l1=new Label("name");
	l2=new Label("password");
	b=new Button("ok");

 	f.setSize(400,300);
	f.setLayout(new FlowLayout());
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(b);
	f.setVisible(true);
	 }
}
