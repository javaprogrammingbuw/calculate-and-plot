import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
public class Calculate extends JFrame{
	public Calculate(){
		input();
	}
	//https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
	//Input Text Fields
	private JTextField xtf1,ytf2,ztf3;
	private JTextField lenBay1,lenBay2;//Length of Bay1 and bay 2
	private JTextField topBeamW,midBeamW,grBeamW;
	private JTextField topColW,midColW,grColW;
	private JTextField lengthBeam1,lengthBeam2;
	private JTextField Ca,Cv,Na,Nv,I,R;
	private JTextField heiT,heiM,heiG,cT;
	private JTextField vShearT,vShear_M1,vShear_M2,vShear_M3,vShear_M4,vShear_M5,vShearG;
	private JTextField timeP,bShear;
	//Output Text field
	private JTextField valX,valY,valZ;
	private JTextField cal;
	private JTextField plot1;
	//Output Text Labels
	private JLabel valx,valy,valz;
	private JButton calculate;
	private JButton plot;

	//Input Text Labels
	private JLabel x,y,z;
	private JLabel lenB1,lenB2;
	private JLabel topBeamWLabel,midBeamWLabel,grBeamWLabel;
	private JLabel topColWLabel,midColWLabel,grColWLabel;
	private JLabel lengthBeam1Label,lengthBeam2Label;
	private JLabel CaLabel,CvLabel,NaLabel,NvLabel,ILabel,RLabel;
	private JLabel heiTLabel,heiMLabel,heiGLabel,cTLabel;
	private JLabel vShT,vSh_M1,vSh_M2,vSh_M3,vSh_M4,vSh_M5,vShG;
	private JLabel inp,oup;
	private JLabel tP,bV;

	private JPanel pane;
	private JPanel outputPane;



	//	//	//variables
	//		double topBW=Double.parseDouble(topBeamW.getText());
	//		double midBW=Double.parseDouble(midBeamW.getText());
	//		double grBW=Double.parseDouble(grBeamW.getText());
	//		
	//		double topCW=Double.parseDouble(topColW.getText());
	//		double midCW=Double.parseDouble(midColW.getText());
	//		double grCW=Double.parseDouble(grColW.getText());
	//		
	//		double lenb1=Double.parseDouble(lenBay1.getText());
	//		double lenb2=Double.parseDouble(lenBay2.getText());
	//		
	//		double ca=Double.parseDouble(Ca.getText());
	//		double cv=Double.parseDouble(Cv.getText());
	//		double na=Double.parseDouble(Na.getText());
	//		
	//		double nv=Double.parseDouble(Nv.getText());
	//		double i=Double.parseDouble(I.getText());
	//		double r=Double.parseDouble(R.getText());
	//		
	//		double hT=Double.parseDouble(heiT.getText());
	//		double hM=Double.parseDouble(heiM.getText());
	//		double hG=Double.parseDouble(heiG.getText());
	//		
	//		double ct=Double.parseDouble(cT.getText());


	private Font font = new Font("Arial", Font.PLAIN, 20);
	private Font font1 = new Font("Consolas", Font.BOLD, 30);
	private void input(){
		//Setting title
		setTitle("Project Azure III");

		//		inp= new JLabel();
		//		inp.setFont(font);
		//		inp.setText("INPUT");	


		xtf1= new JTextField();
		xtf1.setPreferredSize(new Dimension(100,30));
		xtf1.setFont(font);
		xtf1.setText("");
		x= new JLabel();
		x.setFont(font);
		x.setText("X");		






		ytf2= new JTextField();
		ytf2.setPreferredSize(new Dimension(100,30));
		ytf2.setFont(font);
		ytf2.setText("");
		y= new JLabel();
		y.setFont(font);
		y.setText("Y");


		ztf3= new JTextField();
		ztf3.setPreferredSize(new Dimension(100,30));
		ztf3.setFont(font);
		ztf3.setText("");
		z= new JLabel();
		z.setFont(font);
		z.setText("Z");



		lenBay1= new JTextField();
		lenBay1.setPreferredSize(new Dimension(100,30));
		lenBay1.setFont(font);
		lenBay1.setText("");
		lenB1= new JLabel();
		lenB1.setFont(font);
		lenB1.setText("Length of Bay 1");

		lenBay2= new JTextField();
		lenBay2.setPreferredSize(new Dimension(100,30));
		lenBay2.setFont(font);
		lenBay2.setText("");
		lenB2= new JLabel();
		lenB2.setFont(font);
		lenB2.setText("Length of Bay 2");


		topBeamW= new JTextField();
		topBeamW.setPreferredSize(new Dimension(100,30));
		topBeamW.setFont(font);
		topBeamW.setText("");
		topBeamWLabel= new JLabel();
		topBeamWLabel.setFont(font);
		topBeamWLabel.setText("Weight of Top Floor Beam");

		midBeamW= new JTextField();
		midBeamW.setPreferredSize(new Dimension(100,30));
		midBeamW.setFont(font);
		midBeamW.setText("");
		midBeamWLabel= new JLabel();
		midBeamWLabel.setFont(font);
		midBeamWLabel.setText("Weight of Mid Floor Beam");

		grBeamW= new JTextField();
		grBeamW.setPreferredSize(new Dimension(100,30));
		grBeamW.setFont(font);
		grBeamW.setText("");
		grBeamWLabel= new JLabel();
		grBeamWLabel.setFont(font);
		grBeamWLabel.setText("Weight of Ground Floor Beam");

		topColW= new JTextField();
		topColW.setPreferredSize(new Dimension(100,30));
		topColW.setFont(font);
		topColW.setText("");
		topColWLabel= new JLabel();
		topColWLabel.setFont(font);
		topColWLabel.setText("Weight of Top Floor Column");

		midColW= new JTextField();
		midColW.setPreferredSize(new Dimension(100,30));
		midColW.setFont(font);
		midColW.setText("");
		midColWLabel= new JLabel();
		midColWLabel.setFont(font);
		midColWLabel.setText("Weight of Mid Floor Column");

		grColW= new JTextField();
		grColW.setPreferredSize(new Dimension(100,30));
		grColW.setFont(font);
		grColW.setText("");
		grColWLabel= new JLabel();
		grColWLabel.setFont(font);
		grColWLabel.setText("Weight of Ground Floor Column");


		Ca= new JTextField();
		Ca.setPreferredSize(new Dimension(100,30));
		Ca.setFont(font);
		Ca.setText("");
		CaLabel= new JLabel();
		CaLabel.setFont(font);
		CaLabel.setText("Cofficient of Acc");

		Cv= new JTextField();
		Cv.setPreferredSize(new Dimension(100,30));
		Cv.setFont(font);
		Cv.setText("");
		CvLabel= new JLabel();
		CvLabel.setFont(font);
		CvLabel.setText("Cofficient of Vel");

		Na= new JTextField();
		Na.setPreferredSize(new Dimension(100,30));
		Na.setFont(font);
		Na.setText("");
		NaLabel= new JLabel();
		NaLabel.setFont(font);
		NaLabel.setText("Near Source factor acc");

		Nv= new JTextField();
		Nv.setPreferredSize(new Dimension(100,30));
		Nv.setFont(font);
		Nv.setText("");
		NvLabel= new JLabel();
		NvLabel.setFont(font);
		NvLabel.setText("Near Source factor vel");

		I= new JTextField();
		I.setPreferredSize(new Dimension(100,30));
		I.setFont(font);
		I.setText("");
		ILabel= new JLabel();
		ILabel.setFont(font);
		ILabel.setText("Importance Factor");

		R= new JTextField();
		R.setPreferredSize(new Dimension(100,30));
		R.setFont(font);
		R.setText("");
		RLabel= new JLabel();
		RLabel.setFont(font);
		RLabel.setText("Reduction Factor");

		heiT= new JTextField();
		heiT.setPreferredSize(new Dimension(100,30));
		heiT.setFont(font);
		heiT.setText("");
		heiTLabel= new JLabel();
		heiTLabel.setFont(font);
		heiTLabel.setText("Top Height");

		heiM= new JTextField();
		heiM.setPreferredSize(new Dimension(100,30));
		heiM.setFont(font);
		heiM.setText("");
		heiMLabel= new JLabel();
		heiMLabel.setFont(font);
		heiMLabel.setText("Middle Height");

		heiG= new JTextField();
		heiG.setPreferredSize(new Dimension(100,30));
		heiG.setFont(font);
		heiG.setText("");
		heiGLabel= new JLabel();
		heiGLabel.setFont(font);
		heiGLabel.setText("Ground Height");

		cT= new JTextField();
		cT.setPreferredSize(new Dimension(100,30));
		cT.setFont(font);
		cT.setText("");
		cTLabel= new JLabel();
		cTLabel.setFont(font);
		cTLabel.setText("Height Factor");


		calculate = new JButton();
		cal= new JTextField();
		cal.setPreferredSize(new Dimension(100,30));
		cal.setFont(font);
		cal.setText("");
		calculate.setText("Calculate");
		
		plot = new JButton();
		plot1= new JTextField();
		plot1.setPreferredSize(new Dimension(100,30));
		plot1.setFont(font);
		plot1.setText("");
		plot.setText("Plot");


		//		oup= new JLabel();
		//		oup.setFont(font);
		//		oup.setText("OUTPUT");	

		timeP= new JTextField();
		timeP.setPreferredSize(new Dimension(100,30));
		timeP.setFont(font);
		timeP.setText("");
		tP= new JLabel();
		tP.setFont(font);
		tP.setText("Time Period");

		bShear= new JTextField();
		bShear.setPreferredSize(new Dimension(100,30));
		bShear.setFont(font);
		bShear.setText("");
		bV= new JLabel();
		bV.setFont(font);
		bV.setText("Base Shear");

		valX= new JTextField();
		valX.setPreferredSize(new Dimension(100,30));
		valX.setFont(font);
		valX.setText("");
		valx= new JLabel();
		valx.setFont(font);
		valx.setText("Var-I");

		valY= new JTextField();
		valY.setPreferredSize(new Dimension(100,30));
		valY.setFont(font);
		valY.setText("");
		valy= new JLabel();
		valy.setFont(font);
		valy.setText("Var-II");

		valZ= new JTextField();
		valZ.setPreferredSize(new Dimension(100,30));
		valZ.setFont(font);
		valZ.setText("");
		valz= new JLabel();
		valz.setFont(font);
		valz.setText("Var-III");

		vShearT= new JTextField();
		vShearT.setPreferredSize(new Dimension(100,30));
		vShearT.setFont(font);
		vShearT.setText("");
		vShT= new JLabel();
		vShT.setFont(font);
		vShT.setText("TopShear");

		vShear_M1= new JTextField();
		vShear_M1.setPreferredSize(new Dimension(100,30));
		vShear_M1.setFont(font);
		vShear_M1.setText("");
		vSh_M1= new JLabel();
		vSh_M1.setFont(font);
		vSh_M1.setText("ShearMid_1");

		vShear_M2= new JTextField();
		vShear_M2.setPreferredSize(new Dimension(100,30));
		vShear_M2.setFont(font);
		vShear_M2.setText("");
		vSh_M2= new JLabel();
		vSh_M2.setFont(font);
		vSh_M2.setText("ShearMid_2");

		vShear_M3= new JTextField();
		vShear_M3.setPreferredSize(new Dimension(100,30));
		vShear_M3.setFont(font);
		vShear_M3.setText("");
		vSh_M3= new JLabel();
		vSh_M3.setFont(font);
		vSh_M3.setText("ShearMid_3");

		vShear_M4= new JTextField();
		vShear_M4.setPreferredSize(new Dimension(100,30));
		vShear_M4.setFont(font);
		vShear_M4.setText("");
		vSh_M4= new JLabel();
		vSh_M4.setFont(font);
		vSh_M4.setText("ShearMid_4");

		vShear_M5= new JTextField();
		vShear_M5.setPreferredSize(new Dimension(100,30));
		vShear_M5.setFont(font);
		vShear_M5.setText("");
		vSh_M5= new JLabel();
		vSh_M5.setFont(font);
		vSh_M5.setText("ShearMid_5");

		vShearG= new JTextField();
		vShearG.setPreferredSize(new Dimension(100,30));
		vShearG.setFont(font);
		vShearG.setText("");
		vShG= new JLabel();
		vShG.setFont(font);
		vShG.setText("GroundShear");

		calculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				if(xtf1.getText()!=null) {	

					String	xString=xtf1.getText();
					int xdou=Integer.parseInt(xString)	;
					int xans =propX(xdou);
					String ans1= Integer.toString(xans);
					valX.setText(ans1);

					String	yString=ytf2.getText();
					int ydou=Integer.parseInt(yString)	;
					String yans =propY(xdou);

					valY.setText(yans);

					String	zString=ztf3.getText();
					int zdou=Integer.parseInt(zString)	;
					double zans =propZ(zdou);
					String ansz= Double.toString(zans);
					valZ.setText(ansz);



					double t=timePeriod(xdou);
					String tT=Double.toString(t);
					timeP.setText(tT);

					double v=baseShear(xdou);
					String _v=Double.toString(v);
					bShear.setText(_v);


					double sTg [] =fXtg(xdou);
					vShearT.setText(Double.toString(sTg[1]));
					vShearG.setText(Double.toString(sTg[0]));
					double sM [] =fXmid(xdou);
					vShear_M1.setText(Double.toString(sM[0]));
					vShear_M2.setText(Double.toString(sM[1]));
					vShear_M3.setText(Double.toString(sM[2]));
					vShear_M4.setText(Double.toString(sM[3]));
					vShear_M5.setText(Double.toString(sM[4]));
//					double [][] data= {{sTg[0],1},{sM[0],2},{sM[1],3},{sM[2],4},{sM[3],5},{sM[0],6},{sTg[1],2}};
//					Graph g =new Graph(data);					
//					g.paint(getGraphics());
				}
				else {
					System.out.println("Please enter the value");
				}
			} 
		});
		plot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String	xString=xtf1.getText();
				int xdou=Integer.parseInt(xString)	;
				double sTg [] =fXtg(xdou);
				double sM [] =fXmid(xdou);
				double [][] data= {{sTg[0],10},{sM[0],20},{sM[1],30},{sM[2],40},{sM[3],50},{sM[4],60},{sTg[1],20}};
				
				JFrame graphFrame = new JFrame();
				JPanel mainPane = (JPanel) graphFrame.getContentPane();
				JPanel graphPane = new JPanel();
				graphPane = new Graph(data);
				//Graph g =new Graph(data);					
				graphPane.paint(getGraphics());
				graphPane.setPreferredSize(new Dimension(600, 600));
				graphPane.setLayout(new FlowLayout());
				mainPane.add(graphPane);
				graphFrame.getContentPane().add(graphPane, BorderLayout.CENTER);
				mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
				graphFrame.setVisible(true);
			}});
		createFlowLayout();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void createFlowLayout(){
		//mind the order of the components!
		pane = (JPanel) getContentPane();

		//		pane.add(inp);
		pane.add(x);
		pane.add(xtf1);


		pane.add(y);
		pane.add(ytf2);


		pane.add(z);
		pane.add(ztf3);


		pane.add(lenB1);
		pane.add(lenBay1);
		pane.add(lenB2);
		pane.add(lenBay2);

		pane.add(topBeamWLabel);
		pane.add(topBeamW);
		pane.add(midBeamWLabel);
		pane.add(midBeamW);
		pane.add(grBeamWLabel);
		pane.add(grBeamW);

		pane.add(topColWLabel);
		pane.add(topColW);
		pane.add(midColWLabel);
		pane.add(midColW);
		pane.add(grColWLabel);
		pane.add(grColW);

		pane.add(CaLabel);
		pane.add(Ca);
		pane.add(CvLabel);
		pane.add(Cv);
		pane.add(NaLabel);
		pane.add(Na);
		pane.add(NvLabel);
		pane.add(Nv);
		pane.add(ILabel);
		pane.add(I);
		pane.add(RLabel);
		pane.add(R);



		pane.add(heiTLabel);
		pane.add(heiT);
		pane.add(heiMLabel);
		pane.add(heiM);
		pane.add(heiGLabel);
		pane.add(heiG);
		pane.add(cTLabel);
		pane.add(cT);
		pane.add(calculate);
		pane.add(cal);
		pane.add(plot);
		pane.add(plot1);

		//		pane.add(vShT);
		//		pane.add(vShearT);
		//		pane.add(vSh_M1);
		//		pane.add(vShear_M1);
		//		pane.add(vSh_M2);
		//		pane.add(vShear_M2);
		//		pane.add(vSh_M3);
		//		pane.add(vShear_M3);
		//		pane.add(vSh_M4);
		//		pane.add(vShear_M4);
		//		pane.add(vSh_M5);
		//		pane.add(vShear_M5);
		//		pane.add(vShG);
		//		pane.add(vShearG);
		//pane.setLayout(new FlowLayout());
		//pane.setSize(500,500);
		//pack();
		pane.setLayout(new GridLayout(0,2));

		//		pane.add(oup);
		pane.add(valx);
		pane.add(valX);



		pane.add(valy);
		pane.add(valY);



		pane.add(valz);
		pane.add(valZ);
		pane.add(tP);
		pane.add(timeP);
		pane.add(bV);
		pane.add(bShear);
		pane.add(vShT);
		pane.add(vShearT);
		pane.add(vSh_M1);
		pane.add(vShear_M1);
		pane.add(vSh_M2);
		pane.add(vShear_M2);
		pane.add(vSh_M3);
		pane.add(vShear_M3);
		pane.add(vSh_M4);
		pane.add(vShear_M4);
		pane.add(vSh_M5);
		pane.add(vShear_M5);
		pane.add(vShG);
		pane.add(vShearG);
		pane.setSize(500,500);
		pack();
	}

	public int propX(int x) {

		int X=0;

		switch(x) {
		case 0: X=3;
		break;
		case 1: X=4;
		break;
		case 2: X=5;
		break;
		case 3: X=6;
		break;
		case 4: X=7;
		break;
		case 5: X=7;
		break;
		case 6: X=6;
		break;
		case 7: X=5;
		break;
		case 8: X=4;
		break;
		case 9: X=3;
		break;
		default : X=0;
		}
		return X;
	}

	public  static String propY(int y) {
		String Y="";
		switch(y) {
		case 0: Y="LBW";
		//System.out.println("RC:LowerBound"+"Infill:weak"+"FIW");
		break;
		case 1: Y="LBW";
		break;
		//	System.out.println("RC:LowerBound"+"Infill:weak"+"SS");
		case 2: Y="LBM";
		break;
		//System.out.println("RC:LowerBound"+"Infill:medium"+"FIW");
		case 3: Y="LBS";
		break;
		//System.out.println("RC:LowerBound"+"Infill:strong"+"FIW");
		case 4: Y="LBS";
		break;
		//System.out.println("RC:LowerBound"+"Infill:strong"+"FIW");
		case 5: Y="UBW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:weak"+"FIW");
		case 6: Y="UBW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:weak"+"SS");
		case 7: Y="UBM";
		break;
		//System.out.println("RC:UpperBound"+"Infill:medium"+"FIW");
		case 8: Y="UBS";
		break;
		//System.out.println("RC:UpperBound"+"Infill:strong"+"FIW");
		case 9: Y="UBS";
		break;
		//System.out.println("RC:UpperBound"+"Infill:strong"+"FIW");
		default : Y="Wrong input";
		}
		return Y;
	}


	public static  double propZ(int z) {

		int Z=0;
		switch(z) {
		case 0: Z=1;
		break;
		case 1: Z=2;
		break;
		case 2: Z=3;
		break;
		case 3: Z=4;
		break;
		case 4: Z=5;
		break;
		case 5: Z=1;
		break;
		case 6: Z=2;
		break;
		case 7: Z=3;
		break;
		case 8: Z=4;
		break;
		case 9: Z=5;
		break;
		default : Z=0;
		}
		return Z;
	}

	public  double weightTotal(int x) {

		int noOfFloors=propX(x);
		double topBW=Double.parseDouble(topBeamW.getText());
		double midBW=Double.parseDouble(midBeamW.getText());
		double grBW=Double.parseDouble(grBeamW.getText());

		double topCW=Double.parseDouble(topColW.getText());
		double midCW=Double.parseDouble(midColW.getText());
		double grCW=Double.parseDouble(grColW.getText());


		double lenb1=Double.parseDouble(lenBay1.getText());
		double lenb2=Double.parseDouble(lenBay2.getText());
		//Top floor weight
		//		double beamWeight=(Double.parseDouble(topBeamW.getText())+Double.parseDouble(midBeamW.getText())*(noOfFloors-2)+Double.parseDouble(grBeamW.getText()))*(Double.parseDouble(lengthBeam1.getText())+Double.parseDouble(lengthBeam2.getText()));
		//		double colWeight=(Double.parseDouble(topColW.getText())+Double.parseDouble(midColW.getText())+Double.parseDouble(grColW.getText()))*3;
		//		double totalWeight=beamWeight+colWeight;
		//		return totalWeight;
		double beamWeight=(topBW+midBW*(noOfFloors-2)+grBW)*(lenb1+lenb2);
		double colWeight=(topCW+midCW*(noOfFloors-2)+grCW)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	public  double weightTop() {
		double topBW=Double.parseDouble(topBeamW.getText());


		double topCW=Double.parseDouble(topColW.getText());


		double lenb1=Double.parseDouble(lenBay1.getText());
		double lenb2=Double.parseDouble(lenBay2.getText());




		//Top floor weight
		double beamWeight=topBW*(lenb1+lenb2);
		double colWeight=(topCW)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	public  double weightBot() {

		double grBW=Double.parseDouble(grBeamW.getText());


		double grCW=Double.parseDouble(grColW.getText());

		double lenb1=Double.parseDouble(lenBay1.getText());
		double lenb2=Double.parseDouble(lenBay2.getText());

		//Top floor weight
		double beamWeight=grBW*(lenb1+lenb2);
		double colWeight=grCW*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	public  double weightMid(int x) {

		double midBW=Double.parseDouble(midBeamW.getText());



		double midCW=Double.parseDouble(midColW.getText());


		double lenb1=Double.parseDouble(lenBay1.getText());
		double lenb2=Double.parseDouble(lenBay2.getText());

		int noOfFloors=propX(x);

		//Top floor weight
		double beamWeight=midBW*(noOfFloors-2)*(lenb1+lenb2);
		double colWeight=midCW*(noOfFloors-2)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}


	public double baseShearCoff(int x) {

		double cv=Double.parseDouble(Cv.getText());

		double i=Double.parseDouble(I.getText());
		double r=Double.parseDouble(R.getText());

		double t=timePeriod(x);
		double baseCoff=cv*i/(r*t);
		return baseCoff;
	}
	public  double timePeriod(int x) {


		double ct=Double.parseDouble(cT.getText());

		double hn=heightCal(x);
		double tPeriod=ct*(Math.pow(hn, (0.75)));
		return tPeriod;
	}
	public double heightCal(int x) {

		double hT=Double.parseDouble(heiT.getText());
		double hM=Double.parseDouble(heiM.getText());
		double hG=Double.parseDouble(heiG.getText());

		int noOfFloors=propX(x);
		double tHeight=hT+hG+(noOfFloors-2)*hM;
		return tHeight;

	}
	public double baseShear(int x) {


		double ca=Double.parseDouble(Ca.getText());

		double i=Double.parseDouble(I.getText());
		double r=Double.parseDouble(R.getText());

		double baseCoff=baseShearCoff(x);
		double weight=weightTotal(x);
		double baseShear=baseCoff*weight;
		double baseShearMax=2.5*ca*i*weight/r;
		double baseShearMin=0.11*i*weight;

		if(baseShear>baseShearMax) {
			return baseShearMax;
		}
		else if(baseShear<baseShearMin) {
			return baseShearMin;
		}
		else {
			return baseShear;
		}	
	}

	public double comFt(int x) {
		double t=timePeriod(x);
		double v=baseShear(x);
		double ft=0.07*t*v;
		double limMax=0.25*v;
		if(t<=0.7) {
			return 0.0;
		}
		else if (ft>limMax){
			return limMax;
		}
		else {
			return ft;
		}

	}

	public double sumOfFnWei(int x) {


		double hT=Double.parseDouble(heiT.getText());
		double hM=Double.parseDouble(heiM.getText());
		double hG=Double.parseDouble(heiG.getText());
		double sMid=0;
		double wTf=weightTop();
		double wGf=weightBot();
		double wMf=weightMid(x);
		int noOfFloors=propX(x);
		int midFloors=noOfFloors-2;
		// sum of ground and top
		double sumGnT=wTf*((noOfFloors-2)*hM+hT+hG)+wGf*hG;

		if(noOfFloors>2) {
			//sum of mid
			for (int i=1 ; i<=noOfFloors-2 ; i++) {
				sMid+=(wMf/midFloors)*(hM*i+hG);
			}	
			return sumGnT+sMid;
		}
		else {
			return sumGnT;
		}
	}
	public double [] wxhx(int x) {
		double hT=Double.parseDouble(heiT.getText());
		double hM=Double.parseDouble(heiM.getText());
		double hG=Double.parseDouble(heiG.getText());
		int noOfFloors=propX(x);
		int midFloors=noOfFloors-2;
		double[] val=new double [noOfFloors];

		double wTf=weightTop();
		double wGf=weightBot();
		double wMf=weightMid(x);
		double sumG=wGf*hG;
		double sumT=wTf*((noOfFloors-2)*hM+hT+hG);
		//	double [] valO=new double [2];
		//	valO[0]=sumG;
		//	valO[1]=sumT;
		double valO [] = {0,0};
		if(noOfFloors>2) {
			//sum of mid
			for (int i=1 ; i<=noOfFloors-2 ; i++) {
				val[i]=(wMf/midFloors)*(hM*i+hG);
			}

			return val;
		}
		else {
			return valO;
		}
	}
	public double [] wxhxGnT(int x) {

		double hT=Double.parseDouble(heiT.getText());
		double hM=Double.parseDouble(heiM.getText());
		double hG=Double.parseDouble(heiG.getText());
		// for ground and top 
		int noOfFloors=propX(x);
		double wTf=weightTop();
		double wGf=weightBot();
		double sumG=wGf*hG;
		double sumT=wTf*((noOfFloors-2)*hM+hT+hG);
		double valO [] = {sumG,sumT};
		return valO;
	}
	public double  vMinFt(int x) {
		double v = baseShear(x);
		double ft= comFt(x);
		return v-ft;
	}
	public double [] fXmid(int x) {
		int noOfFloors=propX(x);

		double[] storeyF=new double [noOfFloors];	
		double vMinFt=vMinFt(x);
		double n1[]=wxhx(x);

		double sum=sumOfFnWei(x);
		for (int i =0;i<noOfFloors;i++) {
			storeyF[i]=vMinFt*n1[i]/sum;
		}
		return storeyF;
	}
	public double [] fXtg(int x) {
		int noOfFloors=propX(x);
		double[] storeyF=new double [noOfFloors];	
		double vMinFt=vMinFt(x);
		double n2[]=wxhxGnT(x);
		double sum=sumOfFnWei(x);
		for (int i =0;i<2;i++) {
			storeyF[i]=vMinFt*n2[i]/sum;
		}
		return storeyF;
	}
	public static void main(String[] args){
		//places the application on the Swing Event Queue such that all UI updates are concurrency-safe

		EventQueue.invokeLater(() ->{
			Calculate cal = new Calculate();
			cal.setVisible(true);
		});

	}
}