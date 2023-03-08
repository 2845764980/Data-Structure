//https://blog.csdn.net/auspicious____/article/details/79322808
package tree;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.*;

public class TreeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode biology=new DefaultMutableTreeNode("生物");
		DefaultMutableTreeNode animal=new DefaultMutableTreeNode("动物");
		DefaultMutableTreeNode plant=new DefaultMutableTreeNode("植物"); 
		DefaultMutableTreeNode zaolei=new DefaultMutableTreeNode("藻类植物");
		DefaultMutableTreeNode juelei=new DefaultMutableTreeNode("蕨类植物");
		DefaultMutableTreeNode elephant=new DefaultMutableTreeNode("大象");
		DefaultMutableTreeNode monkey=new DefaultMutableTreeNode("猴子");
		plant.add(zaolei);
		plant.add(juelei);
		animal.add(elephant);
		animal.add(monkey);
		biology.add(animal);
		biology.add(plant);
		JTree biologytree = new JTree(biology);
		JPanel biologypanel=new JPanel();
		biologypanel.setBorder(new EmptyBorder(5,5,5,5));
		biologypanel.setLayout(new BorderLayout(0,0));
		JScrollPane biologyscrollpane=new JScrollPane();
		biologyscrollpane.setViewportView(biologytree);
		biologypanel.add(biologyscrollpane);
		JFrame biologyframe=new JFrame("增加凭证代码");
		biologyframe.add(biologypanel);
		biologyframe.setUndecorated(true);
		biologyframe.setBounds(0,0,300,260);
		biologyframe.setVisible(true);

	}

}
