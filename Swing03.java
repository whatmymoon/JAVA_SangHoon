package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{
	
	// 1. ActionListener를 implemetns 합니다.
	// 2. 적용할 컨트롤에 addActionListner 메서드로 감시설정을 합니다.
	// 3. 해당 컨트롤에 이벤트가 발생하면 호출되는 actionPerformed 메소드를 오버라이드합니다.
	JLabel result = new JLabel("");  // 버튼 클릭에 의해서 결과가 담길 최초 비어있는 라벨
	
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		male.addActionListener(this);
		female.addActionListener(this);
		// 구체적인 이벤트 감시대상을 설정합니다. 위 두개의 버튼 중 한개 클릭되면 actionPerforemed 가 호출
		
		setTitle("버튼 이벤트 테스트");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 리스너가 설정된 컨트롤에 이벤트가 일어나면 자동 호출되는 메서드 : 이벤트가 일어난 내용이 e에 전달
		String s = e.getActionCommand();  // 이벤트가 일어난 컨트롤에 표시된 텍스트를 얻습니다.
		// System.out.println(s);
		result.setText(s + "를 선택하셨습니다");
	}
}

public class Swing03 {

	public static void main(String[] args) {
		
		new ButtonEvent();
		
	}

}
