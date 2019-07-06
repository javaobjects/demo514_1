package 接口;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("我的第一个窗体");
		
		frame.setSize(200,200);
		JButton btn = new JButton("click me");
		
//		ActionListener a = new ActionListener();//报错，接口不能被实例化，但是我们可以通过另一种方法把接口“实例化”
		
		btn.addActionListener(new ActionListener() {//匿名内部类：
													//1.让一个匿名内部类实现ActionListener接口
													//2.把这个内部类实例化

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("哎呀，你点击我咯");
			}
		});
		
		
		frame.add(btn);
		
		frame.setVisible(true);
	}

}
