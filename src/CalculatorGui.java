import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//police de caractéres
		Font f18 = new Font("Times New Roman", Font.BOLD, 18);
		Font f28 = new Font("Times New Roman", Font.BOLD, 28);
		
		// déclaration d'interface
		JFrame frame = new JFrame("Calculator");
		frame.setSize(435, 420);
		
		//cette fonction pour positioner la fenêtre au centre
		frame.setLocationRelativeTo(null);
		
		//pour stopée l'execution au moment de ferme la fenêtre 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*setLayaout pour spécifier que vous souhaitez positionner les composants graphiques 
		(tels que les boutons, les étiquettes, etc.) manuellement, sans utiliser de 
		gestionnaire de disposition automatique */
		frame.setLayout(null);
		
		//declaration des objets
		/*JLabel est une classe de la bibliothèque Swing de Java 
		 * qui représente un composant d'étiquette,
		 *  utilisé pour afficher du texte ou une icône*/
		JLabel oldvalue = new JLabel();
		JLabel operation = new JLabel();
		JLabel Newvalue = new JLabel("0");
		JButton btn0 = new JButton("0");
		JButton btndot = new JButton(".");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnplus = new JButton("+");
		JButton btnmin = new JButton("-");
		JButton btnmult = new JButton("*");
		JButton btndiv = new JButton("/");
		JButton btnequal = new JButton("=");
		JButton btnremove = new JButton("->");
		JButton btnclear = new JButton("C");
		JButton btnsigne = new JButton("+/-");
		
		//les dimonsion de chaque objet down accros wigth higth
		oldvalue.setBounds(0,5, 380, 25);
		operation.setBounds(390,5, 15, 25);
		Newvalue.setBounds(0,10,400, 100);
		btnsigne.setBounds(2,135, 100, 40);
		btnclear.setBounds(105,135,100,40);
		btnremove.setBounds(210,135,100,40);
		btndiv.setBounds(315,135,100,40);
		btn7.setBounds(2,180,100,40);
		btn8.setBounds(105,180,100,40);
		btn9.setBounds(210,180, 100, 40);
		btnmult.setBounds(315,180,100, 40);
		btn4.setBounds(2,225, 100, 40);
		btn5.setBounds(105, 225, 100,40);
		btn6.setBounds(210, 225, 100, 40);
		btnmin.setBounds(315, 225, 100, 40);
		btn1.setBounds(2, 270,100,40);
		btn2.setBounds(105, 270, 100, 40);
		btn3.setBounds(210, 270, 100, 40);
		btnplus.setBounds(315, 270, 100, 40);
		btn0.setBounds(2, 315,205, 40);
		btndot.setBounds(210, 315, 100, 40);
		btnequal.setBounds(315, 315, 100, 40);
		
 
		
		//l'ecreture de gauche à droit
		oldvalue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Newvalue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		oldvalue.setFont(f18);
		operation.setFont(f18);
		Newvalue.setFont(f28);
		btn0.setFont(f18);
		btn1.setFont(f18);
		btn2.setFont(f18);
		btn3.setFont(f18);
		btn4.setFont(f18);
		btn5.setFont(f18);
		btn6.setFont(f18);
		btn7.setFont(f18);
		btn8.setFont(f18);
		btn9.setFont(f18);
		btnplus.setFont(f18);
		btnmin.setFont(f18);
		btndiv.setFont(f18);
		btnmult.setFont(f18);
		btnequal.setFont(f18);
		btnclear.setFont(f18);
		btnsigne.setFont(f18);
		btnremove.setFont(f18);
		btndot.setFont(f18);
		
		frame.add(oldvalue);
		frame.add(operation);
		frame.add(Newvalue);
		frame.setVisible(true);
		frame.add(btnsigne);
		frame.add(btnclear);
		frame.add(btnremove);
		frame.add(btndiv);
		frame.add(btn0);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btnplus);
		frame.add(btnmin);
		frame.add(btnmult);
		frame.add(btnequal);
		frame.add(btndot);
		
		//pour les coleurs
		frame.getContentPane().setBackground(Color.BLACK);
		btn0.setBackground(Color.DARK_GRAY);
		btndot.setBackground(Color.DARK_GRAY);
		btn1.setBackground(Color.DARK_GRAY);
		btn2.setBackground(Color.DARK_GRAY);
		btn3.setBackground(Color.DARK_GRAY);
		btn4.setBackground(Color.DARK_GRAY);
		btn5.setBackground(Color.DARK_GRAY);
		btn6.setBackground(Color.DARK_GRAY);
		btn7.setBackground(Color.DARK_GRAY);
		btn8.setBackground(Color.DARK_GRAY);
		btn9.setBackground(Color.DARK_GRAY);
		btnclear.setBackground(Color.WHITE);
		btnsigne.setBackground(Color.WHITE);
		btnremove.setBackground(Color.WHITE);
		btndiv.setBackground(Color.ORANGE);
		btnmult.setBackground(Color.ORANGE);
		btnmin.setBackground(Color.ORANGE);
		btnequal.setBackground(Color.ORANGE);
		btnplus.setBackground(Color.ORANGE);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Newvalue.getText().equals("0"))
					Newvalue.setText("1");
				else
				Newvalue.setText(Newvalue.getText()+"1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Newvalue.getText().equals("0"))
					Newvalue.setText("2");
				else
				Newvalue.setText(Newvalue.getText()+"2");
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Newvalue.getText().equals("0"))
					Newvalue.setText("3");
				else
				Newvalue.setText(Newvalue.getText()+"3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(Newvalue.getText().equals("0"))
								Newvalue.setText("4");
							else
							Newvalue.setText(Newvalue.getText()+"4");
						}
					});
		btn5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(Newvalue.getText().equals("0"))
						Newvalue.setText("5");
					else
					Newvalue.setText(Newvalue.getText()+"5");
				}
			});
		btn6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(Newvalue.getText().equals("0"))
						Newvalue.setText("6");
					else
					Newvalue.setText(Newvalue.getText()+"6");
				}
			});
		btn7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(Newvalue.getText().equals("0"))
						Newvalue.setText("7");
					else
					Newvalue.setText(Newvalue.getText()+"7");
				}
			});
		btn8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(Newvalue.getText().equals("0"))
						Newvalue.setText("8");
					else
					Newvalue.setText(Newvalue.getText()+"8");
				}
			});
		btn9.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(Newvalue.getText().equals("0"))
						Newvalue.setText("9");
					else
					Newvalue.setText(Newvalue.getText()+"9");
				}
			});
		 
		btnmin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					oldvalue.setText(Newvalue.getText()+oldvalue.getText()+("-"));
				}
			});
		btndot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				oldvalue.setText(Newvalue.getText()+oldvalue.getText()+("."));
				Newvalue.setText("");
			}
		});
		
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				Newvalue.setText(Newvalue.getText()+("0"));
				}catch(Exception ex){
					if(Newvalue.getText()=="0")
						Newvalue.setText("0");
				}
			}
		});
		
		btnclear.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Newvalue.setText("0");
						oldvalue.setText("");
						operation.setText("");
					}
				});
		btnremove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Newvalue.setText(Newvalue.getText().substring(0, Newvalue.getText().length()-1));
					
				}catch(Exception ex)
				{
					if(Newvalue.getText()=="0")
						Newvalue.setText("0");
				}
			}
		});
		
		btnsigne.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//puis le convertit en un entier
				int num = Integer.parseInt(Newvalue.getText());
				num *=-1;
				Newvalue.setText(String.valueOf(num));
				
			}
		});
		
		 
		
		 
		 
				

		
		
		
		

		
		
		
		

	}

}
