package gui;

import java.awt.Frame;
import java.awt.Label;

public class MoveComponent extends Frame {
	public MoveComponent() {
		//���̾ƿ��� null �� ����
		setLayout(null);
		
		//���̾ƿ��� null �̶� ��ǥ�� ũ�⸦ ���� �����ؾ� �մϴ�.
		Label lbl = new Label("@");
		lbl.setLocation(20,100);
		lbl.setSize(20,20);
		add(lbl);
		
		setTitle("������Ʈ �̵�");
		setLocation(100,100);
		setSize(300,500);
		//ũ�� ������ ���ϰ� ����
		setResizable(false);
		setVisible(true);
		
		//lbl �����̱�
		int sign = 20;
		while(true) {
			int x = lbl.getLocation().x;
			int y = lbl.getLocation().y;
			if(x == 300) {
				sign = -20;
			}else if(x == 0) {
				sign = 20;
			}
			x = x + sign;
			
			try {
				Thread.sleep(1000);
				lbl.setLocation(x, y);
			}catch(Exception e) {}
		}
		
	}
}





