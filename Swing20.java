package days16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

class MiniGame extends JFrame implements ActionListener{
	/*
	JLabel title;
	JLabel com;
	JLabel user;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	*/
	JLabel com;
	JLabel user;
	JLabel result;
	
	MiniGame(){
		Container con = getContentPane();
		con.setLayout( new BorderLayout());
		
		JPanel p1 = new JPanel();  
		// NORTH - JLabel 1개 "준비가 되면 아래 가위바위보중 하나를 선택하세요"
		// FlowLayout 가운데 정렬
		JPanel p2 = new JPanel();  
		// CENTER - JLabel 세개 : "컴퓨터가 낸 이미지" vs "사용자가 낸 이미지"
		// FlowLayout 가운데 정렬
		JPanel p3 = new JPanel();  
		// SOUTH - 버튼 세개 "가위" "바위" "보"
		// FlowLayout 가운데 정렬
		
		// p1
		JLabel title1 = new JLabel("가위/바위/보");
		JLabel title2 = new JLabel(" - 가위바위보중 하나를 클릭하세요");
		Font f1 = new Font("굴림", Font.BOLD, 30);
		title1.setFont(f1);
		Font f2 = new Font("굴림", Font.BOLD, 18);
		title2.setFont(f2);
		
		p1.setLayout( new FlowLayout(FlowLayout.CENTER));
		p1.add( title1 );
		p1.add( title2 );
		
		con.add(p1, BorderLayout.NORTH);
		
		//p2
		com = new JLabel();
		user = new JLabel();
		ImageIcon icom = new ImageIcon("src/images/0.jpg");
		ImageIcon iuser = new ImageIcon("src/images/0.jpg");
		com.setIcon( icom );
		user.setIcon( iuser );
		JLabel vs = new JLabel("VS");
		
		vs.setFont(f1);
		Border b = new BevelBorder(BevelBorder.RAISED);
		com.setBorder( b );
		user.setBorder( b );
		
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		p2.add( com );
		p2.add( vs );
		p2.add( user );
		con.add(p2, BorderLayout.CENTER);
		
		//p3
		JLabel l3 = new JLabel("가위 ~ 바위 ~ ");
		JButton b1 = new JButton("가위");
		JButton b2 = new JButton("바위");
		JButton b3 = new JButton("보");
		result = new JLabel("");
		p3.setLayout( new FlowLayout( FlowLayout.CENTER, 20, 10));
		l3.setFont(f1);	b1.setFont(f1);	b2.setFont(f1);	b3.setFont(f1);
		
		result.setFont(f1);
		result.setForeground(Color.RED);
		
		p3.add(l3);	p3.add(b1);	p3.add(b2);	p3.add(b3);	p3.add(result);
		con.add(p3, BorderLayout.SOUTH);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setTitle("가위바위보 미니게임 실습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		/*
		title = new JLabel("준비가 되면 아래 가위바위보중 하나를 선택하세요");
		
		ImageIcon comii = new ImageIcon("src/images/0.jpg");
		ImageIcon userii = new ImageIcon("src/images/0.jpg");
		
		com = new JLabel(comii);
		user = new JLabel(userii);
		p1.add(title);
		
		Font f = new Font("굴림", Font.BOLD, 20);
		title.setFont(f);
		com.setFont(f);
		user.setFont(f);
		p2.add(com);
		p2.add(user);
		
		jb1 = new JButton("가위");
		jb2 = new JButton("바위");
		jb3 = new JButton("보");
		p3.add(jb1);	p3.add(jb2);	p3.add(jb3);
		p3.setFont(f);
		
		con.add(p1, BorderLayout.NORTH);
		con.add(p2, BorderLayout.CENTER);
		con.add(p3, BorderLayout.SOUTH);
		
		setTitle("가위바위보 미니게임 실습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resultString;
		String userString = e.getActionCommand();
		
		int comInt = (int)(Math.random()*3);
		String comString;
		if( comInt == 0 ) comString = "가위";
		else if( comInt == 1 ) comString = "바위";
		else comString = "보";
		
		ImageIcon icom;  // 사용자와 컴퓨터가 낸 가위바위보 이미지를 시작
		ImageIcon iuser;
		
		if( comString.equals("가위")) icom = new ImageIcon("src/images/1_1.jpg");
		else if( comString.equals("바위")) icom = new ImageIcon("src/images/2_1.jpg");
		else icom = new ImageIcon("src/images/3_1.jpg");
		
		if( userString.equals("가위")) iuser = new ImageIcon("src/images/1_2.jpg");
		else if( userString.equals("바위")) iuser = new ImageIcon("src/images/2_2.jpg");
		else iuser = new ImageIcon("src/images/3_2.jpg");
		
		com.setIcon( icom );
		user.setIcon( iuser );  // 사용자와 컴퓨터가 낸 가위바위보 이미지를 표시 끝
		
		if( comString.equals("가위") && userString.equals("보")) resultString = "패배";
		else if( comString.equals("바위") && userString.equals("가위")) resultString = "패배";
		else if( comString.equals("보") && userString.equals("바위")) resultString = "패배";
		else if( comString.equals( userString )) resultString = "무승부";
		else resultString = "승리";  // 승패 결정
		
		result.setText(resultString);
		if( resultString.equals("승리")) result.setForeground(Color.BLUE);
		else if( resultString.equals("무승부")) result.setForeground(Color.BLACK);
		else result.setForeground(Color.RED);  // 승패 화면 표시
		}
}


public class Swing20 {

	public static void main(String[] args) {
		
		new MiniGame();
		
	}

}
