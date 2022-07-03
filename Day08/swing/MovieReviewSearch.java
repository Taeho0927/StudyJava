package Day08.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class MovieReviewSearch extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1;
	JButton b1;
	
	MovieReviewSearch() {
		tf1 = new JTextField("검색어를 입력하세요");
		tf1.setBounds(20,50,200,30);
		
		b1 =  new JButton("검색");
		b1.setBounds(230, 50, 60, 30);
		
		l1 = new JLabel("관람평 1");
		l1.setBounds(20, 90, 800, 30);
		l2 = new JLabel("관람평 2");
		l2.setBounds(20, 130, 800, 30);
		l3 = new JLabel("관람평 3");
		l3.setBounds(20, 170, 800, 30);
		l4 = new JLabel("관람평 4");
		l4.setBounds(20, 210, 800, 30);
		l5 = new JLabel("관람평 5");
		l5.setBounds(20, 250, 800, 30);
		
		add(tf1); add(b1);
		add(l1); add(l2); add(l3); add(l4); add(l5);
		b1.addActionListener(this);
		
		setTitle("Movie Search");
		setSize(900,380);
		setLayout(null);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MovieReviewSearch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf1.getText();
		String URL = "https://search.naver.com/search.naver?query=영화+"+str;
		try {
			Document doc = Jsoup.connect(URL).get();
			Elements els = doc.select("p.area_text_box_ell");
			System.out.println(els);
			int i =1;
			
			for(Element el : els) {
				if(i==1) l1.setText(el.text());
				else if(i==2) l2.setText(el.text());
				else if(i==3) l3.setText(el.text());
				else if(i==4) l4.setText(el.text());
				else if(i==5) {
					l5.setText(el.text());
					break;
				}
				i++;
			}	
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
