package Screens;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Inicialization.MainClass;


public class Home extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton shannon,tsallis,renyin,euclidian,euclidianQ,manhattan,chebyshev;
	private JButton kullback,jensen,hellinger,wootter,sax,pip,pbWeigth,entropyPlane;
	private JButton paa,complexity,equalitiesValues,pme,hcPlane,distribution,tsPlane;
	private JButton patternsOnGraph,histogram,chooseFile,result;
	private JTextField nameFile,dim,del,q,pattern,letters,partition,nPoints,TResult;
	private Background construtorImage = null;
	private JComboBox points,Cdistribution,entropy;
	private String[] myPoints = {"All points" , "First Point"};
	private String[] typesDistribution = {"Band and Pompe" , "Bandt and Pompe weigth"};
	private String[] typesEntropy = {"Shannon" , "Tsallis", "Renyi", "Min entropy"};
	
	public Home(int option){
		super("Time Series Analysis");
		ImageIcon icone = new ImageIcon("icone.png");
		setIconImage(icone.getImage());
		construtorImage = new Background("branco.png");
		construtorImage.setSize(2000, 1500);
		panel = new JPanel();
		panel.setLayout(null);
		
		ImageIcon logomarca = new ImageIcon("TS.png");
		JLabel label = new JLabel(logomarca);
		label.setBounds(5, 1, 188, 97);
		
		nameFile = new JTextField("Time Series Name");
		nameFile.setBounds(70, 125, 320, 30);
		panel.add(nameFile);
		
		chooseFile = new JButton(new ImageIcon("chooseFile.png"));
		chooseFile.setBounds(422, 125, 150, 30);
		chooseFile.setBackground(Color.white);
		chooseFile.setBorderPainted(false);
		panel.add(chooseFile);
		
		FileEvento handler1 = new FileEvento();
		chooseFile.addActionListener(handler1);
		
		shannon = new JButton(new ImageIcon("shannon.png"));
		shannon.setBounds(70, 180, 250, 34);
		shannon.setBackground(Color.white);
		panel.add(shannon);
		ChooseEvento handler2 = new ChooseEvento();
		shannon.addActionListener(handler2);
		
		ResultEvento handler3 = new ResultEvento();
		
		tsallis = new JButton(new ImageIcon("tsallis.png"));
		tsallis.setBounds(70, 214, 250, 34);
		tsallis.setBackground(Color.white);
		panel.add(tsallis);
		tsallis.addActionListener(handler2);
		
		renyin = new JButton(new ImageIcon("renyin.png"));
		renyin.setBounds(70, 248, 250, 34);
		renyin.setBackground(Color.white);
		panel.add(renyin);
		renyin.addActionListener(handler2);
		
		euclidian = new JButton(new ImageIcon("euclidian.png"));
		euclidian.setBounds(70, 282, 250, 34);
		euclidian.setBackground(Color.white);
		panel.add(euclidian);
		euclidian.addActionListener(handler2);
		
		euclidianQ = new JButton(new ImageIcon("quadratic.png"));
		euclidianQ.setBounds(70, 316, 250, 34);
		euclidianQ.setBackground(Color.white);
		panel.add(euclidianQ);
		tsallis.addActionListener(handler2);
		
		manhattan = new JButton(new ImageIcon("manhattan.png"));
		manhattan.setBounds(70, 350, 250, 34);
		manhattan.setBackground(Color.white);
		panel.add(manhattan);
		manhattan.addActionListener(handler2);
		
		chebyshev = new JButton(new ImageIcon("chebyshev.png"));
		chebyshev.setBounds(70, 384, 250, 34);
		chebyshev.setBackground(Color.white);
		panel.add(chebyshev);
		chebyshev.addActionListener(handler2);
		
		hellinger = new JButton(new ImageIcon("hellinger.png"));
		hellinger.setBounds(70, 418, 250, 34);
		hellinger.setBackground(Color.white);
		panel.add(hellinger);
		hellinger.addActionListener(handler2);
		
		jensen = new JButton(new ImageIcon("jensen.png"));
		jensen.setBounds(70, 452, 250, 34);
		jensen.setBackground(Color.white);
		panel.add(jensen);
		jensen.addActionListener(handler2);
		
		wootter = new JButton(new ImageIcon("wootter.png"));
		wootter.setBounds(70, 486, 250, 34);
		wootter.setBackground(Color.white);
		panel.add(wootter);
		wootter.addActionListener(handler2);
		
		kullback = new JButton(new ImageIcon("kullback.png"));
		kullback.setBounds(70, 520, 250, 34);
		kullback.setBackground(Color.white);
		panel.add(kullback);
		kullback.addActionListener(handler2);
		
		complexity = new JButton(new ImageIcon("complexity.png"));
		complexity.setBounds(70, 554, 250, 34);
		complexity.setBackground(Color.white);
		panel.add(complexity);
		complexity.addActionListener(handler2);
		
		pme = new JButton(new ImageIcon("pme.png"));
		pme.setBounds(320, 180, 250, 34);
		pme.setBackground(Color.white);
		panel.add(pme);
		pme.addActionListener(handler2);
		
		sax = new JButton(new ImageIcon("sax.png"));
		sax.setBounds(320, 214, 250, 34);
		sax.setBackground(Color.white);
		panel.add(sax);
		sax.addActionListener(handler2);
		
		pip = new JButton(new ImageIcon("pip.png"));
		pip.setBounds(320, 248, 250, 34);
		pip.setBackground(Color.white);
		panel.add(pip);
		pip.addActionListener(handler2);
		
		paa = new JButton(new ImageIcon("paa.png"));
		paa.setBounds(320, 282, 250, 34);
		paa.setBackground(Color.white);
		panel.add(paa);
		paa.addActionListener(handler2);
		
		pbWeigth = new JButton(new ImageIcon("pbWeigth.png"));
		pbWeigth.setBounds(320, 316, 250, 34);
		pbWeigth.setBackground(Color.white);
		panel.add(pbWeigth);
		pbWeigth.addActionListener(handler2);
		
		equalitiesValues = new JButton(new ImageIcon("equalities.png"));
		equalitiesValues.setBounds(320, 350, 250, 34);
		equalitiesValues.setBackground(Color.white);
		panel.add(equalitiesValues);
		equalitiesValues.addActionListener(handler2);
		
		distribution = new JButton(new ImageIcon("distribution.png"));
		distribution.setBounds(320, 384, 250, 34);
		distribution.setBackground(Color.white);
		panel.add(distribution);
		distribution.addActionListener(handler2);
		
		entropyPlane = new JButton(new ImageIcon("entropyPlane.png"));
		entropyPlane.setBounds(320, 418, 250, 34);
		entropyPlane.setBackground(Color.white);
		panel.add(entropyPlane);
		entropyPlane.addActionListener(handler2);
		
		hcPlane = new JButton(new ImageIcon("hcPlane.png"));
		hcPlane.setBounds(320, 452, 250, 34);
		hcPlane.setBackground(Color.white);
		panel.add(hcPlane);
		hcPlane.addActionListener(handler2);
		
		tsPlane = new JButton(new ImageIcon("timeSeriePlane.png"));
		tsPlane.setBounds(320, 486, 250, 34);
		tsPlane.setBackground(Color.white);
		panel.add(tsPlane);
		tsPlane.addActionListener(handler2);
		
		patternsOnGraph = new JButton(new ImageIcon("patternsOnGraph.png"));
		patternsOnGraph.setBounds(320, 520, 250, 34);
		patternsOnGraph.setBackground(Color.white);
		panel.add(patternsOnGraph);
		patternsOnGraph.addActionListener(handler2);
		
		histogram = new JButton(new ImageIcon("histogram.png"));
		histogram.setBounds(320, 554, 250, 34);
		histogram.setBackground(Color.white);
		panel.add(histogram);
		histogram.addActionListener(handler2);
		
		ImageIcon dimension = new ImageIcon("dimension.png");
		JLabel label3 = new JLabel(dimension);
		ImageIcon delay = new ImageIcon("tal.png");
		JLabel label4 = new JLabel(delay);
		result = new JButton(new ImageIcon("seta.png"));
		result.setBounds(630, 610, 50, 50);
		result.setBackground(Color.white);
		result.setBorderPainted(false);
		
		switch(option){
		case 1:
			//Distance and entropy
			label3.setBounds(70,600,98,28);
			panel.add(label3);
			
			label4.setBounds(70,628,98,28);
			panel.add(label4);
			
			dim = new JTextField();
			dim.setBounds(170, 600, 30, 30);
			panel.add(dim);
			
			del = new JTextField();
			del.setBounds(170, 628, 30, 30);
			panel.add(del);
			
			panel.add(result);
			result.addActionListener(handler3);
			
			break;
		case 2:
			//Distance and entropy
			label3.setBounds(70,600,98,28);
			panel.add(label3);
			
			label4.setBounds(70,628,98,28);
			panel.add(label4);
			
			ImageIcon Q = new ImageIcon("q.png");
			JLabel label5 = new JLabel(Q);
			label5.setBounds(70,656,98,28);
			panel.add(label5);
			
			dim = new JTextField();
			dim.setBounds(170, 600, 30, 30);
			panel.add(dim);
			
			del = new JTextField();
			del.setBounds(170, 628, 30, 30);
			panel.add(del);
			
			q = new JTextField();
			q.setBounds(170, 656, 30, 30);
			panel.add(q);
			
			panel.add(result);
			result.addActionListener(handler3);
			
			break;
		case 3:
			//Patterns on graph
			ImageIcon numberPattern = new ImageIcon("pattern.png");
			JLabel label6 = new JLabel(numberPattern);
			label6.setBounds(70,628,98,28);
			panel.add(label6);
			
			pattern = new JTextField();
			pattern.setBounds(170, 629, 30, 28);
			panel.add(pattern);
			
			ImageIcon imPoints = new ImageIcon("points.png");
			JLabel label7 = new JLabel(imPoints);
			label7.setBounds(70,600,98,28);
			panel.add(label7);
			
			points = new JComboBox(myPoints);
			points.setBounds(170,600, 90, 28);
			points.setBackground(Color.white);
			panel.add(points);
			
			panel.add(result);
			result.addActionListener(handler3);
			
			break;
		case 4:
			//SAX
			ImageIcon imletters = new ImageIcon("letters.png");
			JLabel label8 = new JLabel(imletters);
			label8.setBounds(70,600,152,28);
			panel.add(label8);
			
			letters = new JTextField();
			letters.setBounds(224, 600, 30, 28);
			panel.add(letters);
			
			ImageIcon imPartition = new ImageIcon("partitions.png");
			JLabel label9 = new JLabel(imPartition);
			label9.setBounds(70,628,98,28);
			panel.add(label9);
			
			partition = new JTextField();
			partition.setBounds(170, 629, 30, 28);
			panel.add(partition);
			
			panel.add(result);
			result.addActionListener(handler3);
			
			break;
			
		case 5:
			//PIP
			ImageIcon imNPoints = new ImageIcon("NumberOfPoints.png");
			JLabel label10 = new JLabel(imNPoints);
			label10.setBounds(70,600,152,28);
			panel.add(label10);
			
			nPoints = new JTextField();
			nPoints.setBounds(224, 600, 30, 28);
			panel.add(nPoints);	
			
			panel.add(result);	
			result.addActionListener(handler3);	
			
			break;
			
		case 6:
			//PAA			
			ImageIcon imPartition2 = new ImageIcon("partitions.png");
			JLabel label11 = new JLabel(imPartition2);
			label11.setBounds(70,600,98,28);
			panel.add(label11);
			
			partition = new JTextField();
			partition.setBounds(170, 601, 30, 28);
			panel.add(partition);
			
			panel.add(result);	
			result.addActionListener(handler3);		
			
			break;
			
		case 7:
			//Entropy Plane	
			label3.setBounds(70,600,98,28);
			panel.add(label3);
			
			dim = new JTextField();
			dim.setBounds(170, 600, 30, 30);
			panel.add(dim);

			label4.setBounds(70,628,98,28);
			panel.add(label4);
			
			del = new JTextField();
			del.setBounds(170, 628, 30, 30);
			panel.add(del);
			
			ImageIcon QQ = new ImageIcon("q.png");
			JLabel label12 = new JLabel(QQ);
			label12.setBounds(70,656,98,28);
			panel.add(label12);
			
			q = new JTextField();
			q.setBounds(170, 656, 30, 30);
			panel.add(q);
			
			ImageIcon imDistribution = new ImageIcon("distribution1.png");
			JLabel label14 = new JLabel(imDistribution);
			label14.setBounds(240,600,98,28);
			panel.add(label14);
			
			Cdistribution = new JComboBox(typesDistribution);
			Cdistribution.setBounds(340,600, 170, 28);
			Cdistribution.setBackground(Color.white);
			panel.add(Cdistribution);
			
			ImageIcon imEntropy = new ImageIcon("entropy.png");
			JLabel label15 = new JLabel(imEntropy);
			label15.setBounds(240,628,98,28);
			panel.add(label15);
			
			entropy = new JComboBox(typesEntropy);
			entropy.setBounds(340,628, 170, 28);
			entropy.setBackground(Color.white);
			panel.add(entropy);
			
			ImageIcon imPartition3 = new ImageIcon("partitions.png");
			JLabel label13 = new JLabel(imPartition3);
			label13.setBounds(240,656,98,28);
			panel.add(label13);
			
			partition = new JTextField();
			partition.setBounds(340, 657, 30, 28);
			panel.add(partition);	
			
			panel.add(result);
			result.addActionListener(handler3);	
			
			break;
			
		case 8:
			//HC Plane
			label3.setBounds(70,600,98,28);
			panel.add(label3);
			
			label4.setBounds(70,628,98,28);
			panel.add(label4);
			
			dim = new JTextField();
			dim.setBounds(170, 600, 30, 30);
			panel.add(dim);
			
			del = new JTextField();
			del.setBounds(170, 628, 30, 30);
			panel.add(del);
			
			ImageIcon imPartition4 = new ImageIcon("partitions.png");
			JLabel label16 = new JLabel(imPartition4);
			label16.setBounds(70,656,98,28);
			panel.add(label16);
			
			partition = new JTextField();
			partition.setBounds(170, 657, 30, 28);
			panel.add(partition);	
			
			panel.add(result);
			result.addActionListener(handler3);	
			
			break;
			
		case 9:
			
			ImageIcon imResult = new ImageIcon("result.png");
			JLabel label117 = new JLabel(imResult);
			label117.setBounds(910,530,128,54);
			panel.add(label117);
			
			TResult = new JTextField();
			TResult.setBounds(1045, 530,74, 54);
			panel.add(TResult);	
			
			break;
			
		}
		
		ImageIcon grafico = new ImageIcon("grafico.png");
		JLabel label2 = new JLabel(grafico);
		label2.setBounds(800, 150, 448, 357);
		
		panel.add(label);
		panel.add(label2);
		panel.add(construtorImage);

		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private class FileEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == chooseFile) {
				
			}
		}
	}

	private class ChooseEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if ((event.getSource() == euclidian)||(event.getSource() == euclidianQ)||
				(event.getSource() == manhattan)||(event.getSource() == chebyshev) ||
				(event.getSource() == hellinger)||(event.getSource() == complexity)||
				(event.getSource() == shannon)||(event.getSource() == pme)||
				(event.getSource() == pbWeigth)||(event.getSource() == distribution)||
				(event.getSource() == histogram)||(event.getSource() == jensen)) {				
				MainClass.mudarTela(1);
				Home.this.dispose();				
			}
			if((event.getSource() == kullback)||(event.getSource() == wootter)||
			   (event.getSource() == tsallis)||(event.getSource() == renyin)){			
				MainClass.mudarTela(2);
				Home.this.dispose();							
			}
			if((event.getSource() == patternsOnGraph)){			
				MainClass.mudarTela(3);
				Home.this.dispose();								
			}
			if((event.getSource() == sax)){			
				MainClass.mudarTela(4);
				Home.this.dispose();								
			}
			if((event.getSource() == pip)){			
				MainClass.mudarTela(5);
				Home.this.dispose();								
			}
			if((event.getSource() == paa)){			
				MainClass.mudarTela(6);
				Home.this.dispose();								
			}
			if((event.getSource() == entropyPlane)){			
				MainClass.mudarTela(7);
				Home.this.dispose();								
			}
			if((event.getSource() == hcPlane)){			
				MainClass.mudarTela(8);
				Home.this.dispose();								
			}
			if((event.getSource() == equalitiesValues)||(event.getSource() == tsPlane)){			
				MainClass.mudarTela(0);
				Home.this.dispose();								
			}
		}
	}

	private class ResultEvento implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == result) {			
				MainClass.mudarTela(9);
				Home.this.dispose();							
			}
		}
	}

}
