import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConferenceRegistrationSystem {
public static void main(String args[]) {
CreateGUI cg=new CreateGUI();
}
}
class CreateGUI extends JFrame implements ItemListener {

//private JComboBox cbRegistration;
private JComboBox cbOptional;
private JCheckBox chkDinner;
private JRadioButton chkGE;
private JRadioButton chkST;
/*private JCheckBox chkJava;
private JCheckBox chkNS;*/
private JTextField txtTotal;
private double sum=0.0;
private ButtonGroup bg;

private Container c;
public CreateGUI() {

c=this.getContentPane();
c.setLayout(new GridLayout(4,1,0,5));

/*JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
p1.add(new JLabel("Select Registration Type: "));
cbRegistration=new JComboBox();
cbRegistration.addItem("Select");
cbRegistration.addItem("General");
cbRegistration.addItem("Student");
p1.add(cbRegistration);*/

JPanel p1=new JPanel();
p1.setBorder(BorderFactory.createTitledBorder("Select Registration Type:"));
p1.setLayout(new GridLayout(4,1));
chkGE=new JRadioButton("General");
chkST=new JRadioButton("Student");
p1.setSize(new Dimension(150,200));

bg = new ButtonGroup();
bg.add(chkGE);
bg.add(chkST);

JPanel p2=new JPanel();
chkDinner=new JCheckBox("Opening night dinner with a keynote speech");
p2.add(chkDinner);
p2.setBorder(BorderFactory.createTitledBorder("Optional"));

/*JPanel p3=new JPanel();
p3.setBorder(BorderFactory.createTitledBorder("Optional preconference workshops"));
p3.setLayout(new GridLayout(4,1));
chkECommerce=new JCheckBox("Introduction to E-commerce");
chkWeb=new JCheckBox("The Fututre of the Web");
chkJava=new JCheckBox("Advanced Java Programming");
chkNS=new JCheckBox("Network Security");
p3.setSize(new Dimension(150,200));
*/


JPanel p3=new JPanel();
p3.setLayout(new FlowLayout());
p3.add(new JLabel("Optional preconference workshops: "));
cbOptional=new JComboBox();
cbOptional.addItem("Introduction to E-commerce");
cbOptional.addItem("The Fututre of the Web");
cbOptional.addItem("Advanced Java Programming");
cbOptional.addItem("Network Security");
p3.add(cbOptional);
p3.setSize(new Dimension(150,200));

JPanel p4=new JPanel();
p4.add(new JLabel("Total: $"));
txtTotal=new JTextField(15);
txtTotal.setText("0.0");
p4.add(txtTotal);

p1.add(chkGE);
p1.add(chkST);

/*bg.add(chkGE);
bg.add(Student_Registration);
p3.add(chkJava);
p3.add(chkNS);
*/
c.add(p1);
c.add(p2);
c.add(p3);
c.add(p4);

chkGE.addItemListener(this);
chkST.addItemListener(this);
cbOptional.addItemListener(this);
chkDinner.addItemListener(this);
/*chkECommerce.addItemListener(this);
chkJava.addItemListener(this);
chkNS.addItemListener(this);
chkWeb.addItemListener(this);*/

this.setTitle("Conference Registration System");
this.setSize(500,400);
this.setLocation(400,200);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void itemStateChanged(ItemEvent ie) {

if(ie.getSource()==chkGE) {
if(chkGE.isSelected())
sum=895;
else if(chkST.isSelected())
sum=495;
else
sum=495;

txtTotal.setText(sum+"");
chkDinner.setSelected(false);
/*cbOptional.setSelected(false);
chkWeb.setSelected(false);
chkNS.setSelected(false);
chkECommerce.setSelected(false);*/
}

if(ie.getSource()==cbOptional) {
   if(cbOptional.getSelectedIndex()==1)
sum+=395;
   else
sum-=395;
   txtTotal.setText(sum+"");
}

else
if(ie.getSource()==cbOptional) {
   if(cbOptional.getSelectedIndex()==2)
sum+=295;
   else
sum-=295;
   txtTotal.setText(sum+"");
}

else
if(ie.getSource()==cbOptional) {
   if(cbOptional.getSelectedIndex()==3)
sum+=295;
   else
sum-=295;
   txtTotal.setText(sum+"");
}
else
if(ie.getSource()==cbOptional) {
   if(cbOptional.getSelectedIndex()==4)
sum+=395;
   else
sum-=395;
   txtTotal.setText(sum+"");
}

else
if(ie.getSource()==chkDinner) {
   if(chkDinner.isSelected())
sum+=30;
   else
sum-=30;
   txtTotal.setText(sum+"");
}

}

}



