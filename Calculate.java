//Import of required libraries
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class Calculate
public class Calculate extends JFrame{
	//constructor of class
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
	private JTextField timeP,bShear,totW,totH;
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
	private JLabel tP,bV,tW,tH;

	// Jpanel initialization
	private JPanel pane;

	// Saving all variables in an array, which is common parameter for every method 
	double lenb1,lenb2,topBW,midBW,grBW,topCW,midCW,grCW,ca,cv,na,nv,i,r,hT,hM,hG,ct;
	double  [] inpVal=  {lenb1,lenb2,topBW,midBW,grBW,topCW,midCW,grCW,ca,cv,na,nv,i,r,hT,hM,hG,ct};
	// Setting the font of the text
	private Font font = new Font("Arial", Font.PLAIN, 20);	
	// input method
	private void input(){
		//Setting title
		setTitle("Project : Calculate and Plot");

		//Setting the Input text and labels
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
		lenB1.setText("Length of Bay 1 (m)");

		lenBay2= new JTextField();
		lenBay2.setPreferredSize(new Dimension(100,30));
		lenBay2.setFont(font);
		lenBay2.setText("");
		lenB2= new JLabel();
		lenB2.setFont(font);
		lenB2.setText("Length of Bay 2 (m)");

		topBeamW= new JTextField();
		topBeamW.setPreferredSize(new Dimension(100,30));
		topBeamW.setFont(font);
		topBeamW.setText("");
		topBeamWLabel= new JLabel();
		topBeamWLabel.setFont(font);
		topBeamWLabel.setText("Weight of Top Floor Beam (KN/m)");

		midBeamW= new JTextField();
		midBeamW.setPreferredSize(new Dimension(100,30));
		midBeamW.setFont(font);
		midBeamW.setText("");
		midBeamWLabel= new JLabel();
		midBeamWLabel.setFont(font);
		midBeamWLabel.setText("Weight of Mid Floor Beam (KN/m)");

		grBeamW= new JTextField();
		grBeamW.setPreferredSize(new Dimension(100,30));
		grBeamW.setFont(font);
		grBeamW.setText("");
		grBeamWLabel= new JLabel();
		grBeamWLabel.setFont(font);
		grBeamWLabel.setText("Weight of Ground Floor Beam (KN/m)");

		topColW= new JTextField();
		topColW.setPreferredSize(new Dimension(100,30));
		topColW.setFont(font);
		topColW.setText("");
		topColWLabel= new JLabel();
		topColWLabel.setFont(font);
		topColWLabel.setText("Weight of Top Floor Column (KN)");

		midColW= new JTextField();
		midColW.setPreferredSize(new Dimension(100,30));
		midColW.setFont(font);
		midColW.setText("");
		midColWLabel= new JLabel();
		midColWLabel.setFont(font);
		midColWLabel.setText("Weight of Mid Floor Column (KN)");

		grColW= new JTextField();
		grColW.setPreferredSize(new Dimension(100,30));
		grColW.setFont(font);
		grColW.setText("");
		grColWLabel= new JLabel();
		grColWLabel.setFont(font);
		grColWLabel.setText("Weight of Ground Floor Column (KN)");


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
		heiTLabel.setText("Top Height (m)");

		heiM= new JTextField();
		heiM.setPreferredSize(new Dimension(100,30));
		heiM.setFont(font);
		heiM.setText("");
		heiMLabel= new JLabel();
		heiMLabel.setFont(font);
		heiMLabel.setText("Middle Height (m)");

		heiG= new JTextField();
		heiG.setPreferredSize(new Dimension(100,30));
		heiG.setFont(font);
		heiG.setText("");
		heiGLabel= new JLabel();
		heiGLabel.setFont(font);
		heiGLabel.setText("Ground Height (m)");

		cT= new JTextField();
		cT.setPreferredSize(new Dimension(100,30));
		cT.setFont(font);
		cT.setText("");
		cTLabel= new JLabel();
		cTLabel.setFont(font);
		cTLabel.setText("Height Factor");
		//Setting the Calculate button text and labels
		calculate = new JButton();
		cal= new JTextField();
		cal.setPreferredSize(new Dimension(100,30));
		cal.setFont(font);
		cal.setText("");
		calculate.setText("Calculate");
		//Setting the Plot button text and labels
		plot = new JButton();
		plot1= new JTextField();
		plot1.setPreferredSize(new Dimension(100,30));
		plot1.setFont(font);
		plot1.setText("");
		plot.setText("Plot");
		//Setting the Output text and labels
		timeP= new JTextField();
		timeP.setPreferredSize(new Dimension(100,30));
		timeP.setFont(font);
		timeP.setText("");
		tP= new JLabel();
		tP.setFont(font);
		tP.setText("Time Period (s)");

		bShear= new JTextField();
		bShear.setPreferredSize(new Dimension(100,30));
		bShear.setFont(font);
		bShear.setText("");
		bV= new JLabel();
		bV.setFont(font);
		bV.setText("Base Shear (KN)");

		valX= new JTextField();
		valX.setPreferredSize(new Dimension(100,30));
		valX.setFont(font);
		valX.setText("");
		valx= new JLabel();
		valx.setFont(font);
		valx.setText("Var-I-No.of Floors");

		valY= new JTextField();
		valY.setPreferredSize(new Dimension(100,30));
		valY.setFont(font);
		valY.setText("");
		valy= new JLabel();
		valy.setFont(font);
		valy.setText("Var-II-Material discription");

		valZ= new JTextField();
		valZ.setPreferredSize(new Dimension(100,30));
		valZ.setFont(font);
		valZ.setText("");
		valz= new JLabel();
		valz.setFont(font);
		valz.setText("Var-III-Time history set");

		totW= new JTextField();
		totW.setPreferredSize(new Dimension(100,30));
		totW.setFont(font);
		totW.setText("");
		tW= new JLabel();
		tW.setFont(font);
		tW.setText("Total Weight (KN)");		

		totH= new JTextField();
		totH.setPreferredSize(new Dimension(100,30));
		totH.setFont(font);
		totH.setText("");
		tH= new JLabel();
		tH.setFont(font);
		tH.setText("Total Height (m)");		


		vShearT= new JTextField();
		vShearT.setPreferredSize(new Dimension(100,30));
		vShearT.setFont(font);
		vShearT.setText("");
		vShT= new JLabel();
		vShT.setFont(font);
		vShT.setText("TopShear (KN)");

		vShear_M1= new JTextField();
		vShear_M1.setPreferredSize(new Dimension(100,30));
		vShear_M1.setFont(font);
		vShear_M1.setText("");
		vSh_M1= new JLabel();
		vSh_M1.setFont(font);
		vSh_M1.setText("ShearMid_1 (KN)");

		vShear_M2= new JTextField();
		vShear_M2.setPreferredSize(new Dimension(100,30));
		vShear_M2.setFont(font);
		vShear_M2.setText("");
		vSh_M2= new JLabel();
		vSh_M2.setFont(font);
		vSh_M2.setText("ShearMid_2 (KN)");

		vShear_M3= new JTextField();
		vShear_M3.setPreferredSize(new Dimension(100,30));
		vShear_M3.setFont(font);
		vShear_M3.setText("");
		vSh_M3= new JLabel();
		vSh_M3.setFont(font);
		vSh_M3.setText("ShearMid_3 (KN)");

		vShear_M4= new JTextField();
		vShear_M4.setPreferredSize(new Dimension(100,30));
		vShear_M4.setFont(font);
		vShear_M4.setText("");
		vSh_M4= new JLabel();
		vSh_M4.setFont(font);
		vSh_M4.setText("ShearMid_4 (KN)");

		vShear_M5= new JTextField();
		vShear_M5.setPreferredSize(new Dimension(100,30));
		vShear_M5.setFont(font);
		vShear_M5.setText("");
		vSh_M5= new JLabel();
		vSh_M5.setFont(font);
		vSh_M5.setText("ShearMid_5 (KN)");

		vShearG= new JTextField();
		vShearG.setPreferredSize(new Dimension(100,30));
		vShearG.setFont(font);
		vShearG.setText("");
		vShG= new JLabel();
		vShG.setFont(font);
		vShG.setText("GroundShear (KN)");


		// Adding functions when on click is performed in calculate button 
		calculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				inpVal [0]=Double.parseDouble(lenBay1.getText());
				inpVal [1]=Double.parseDouble(lenBay2.getText());
				inpVal [2]=Double.parseDouble(topBeamW.getText());
				inpVal [3]=Double.parseDouble(midBeamW.getText());
				inpVal [4]=Double.parseDouble(grBeamW.getText());
				inpVal [5]=Double.parseDouble(topColW.getText());
				inpVal [6]=Double.parseDouble(midColW.getText());
				inpVal [7]=Double.parseDouble(grColW.getText());
				inpVal [8]=Double.parseDouble(Ca.getText());
				inpVal [9]=Double.parseDouble(Cv.getText());
				inpVal [10]=Double.parseDouble(Na.getText());
				inpVal [11]=Double.parseDouble(Nv.getText());
				inpVal [12]=Double.parseDouble(I.getText());
				inpVal [13]=Double.parseDouble(R.getText());
				inpVal [14]=Double.parseDouble(heiT.getText());
				inpVal [15]=Double.parseDouble(heiM.getText());
				inpVal [16]=Double.parseDouble(heiG.getText());
				inpVal [17]=Double.parseDouble(cT.getText());
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



					double t=timePeriod(xdou,inpVal);
					String tT=Double.toString(t);
					timeP.setText(tT);

					double toW =weightTotal(xdou,inpVal);
					String toW_str= Double.toString(toW);
					totW.setText(toW_str);

					double toH =heightCal  (xdou,inpVal);
					String toH_str= Double.toString(toH);
					totH.setText(toH_str);

					double v=baseShear(xdou,inpVal);
					String _v=Double.toString(v);
					bShear.setText(_v);


					double sTg [] =fXtg(xdou,inpVal);
					vShearT.setText(Double.toString(sTg[1]));
					vShearG.setText(Double.toString(sTg[0]));
					double sM [] =fXmid(xdou,inpVal);
					if(xans==2 ) {
						vShear_M1.setText("0");
						vShear_M2.setText("0");
						vShear_M3.setText("0");
						vShear_M4.setText("0");
						vShear_M5.setText("0");
					}
					if(xans==3 ) {
						vShear_M1.setText(Double.toString(sM[0]));
						vShear_M2.setText("0");
						vShear_M3.setText("0");
						vShear_M4.setText("0");
						vShear_M5.setText("0");
					}
					else if(xans==4) {
						vShear_M1.setText(Double.toString(sM[1]));
						vShear_M2.setText(Double.toString(sM[0]));
						vShear_M3.setText("0");
						vShear_M4.setText("0");
						vShear_M5.setText("0");
					}
					else if(xans==5) {
						vShear_M1.setText(Double.toString(sM[2]));
						vShear_M2.setText(Double.toString(sM[1]));
						vShear_M3.setText(Double.toString(sM[0]));
						vShear_M4.setText("0");
						vShear_M5.setText("0");
					}
					else if(xans==6) {
						vShear_M1.setText(Double.toString(sM[3]));
						vShear_M2.setText(Double.toString(sM[2]));
						vShear_M3.setText(Double.toString(sM[1]));
						vShear_M4.setText(Double.toString(sM[0]));
						vShear_M5.setText("0");

					}
					else if(xans==7) {
						vShear_M1.setText(Double.toString(sM[4]));
						vShear_M2.setText(Double.toString(sM[3]));
						vShear_M3.setText(Double.toString(sM[2]));
						vShear_M4.setText(Double.toString(sM[1]));
						vShear_M5.setText(Double.toString(sM[0]));
					}



				}
				else {
					valX.setText("No Input was entered");
				}
			} 
		});
		//Adding functions on click for ploting a graph
		plot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				inpVal [0]=Double.parseDouble(lenBay1.getText());
				inpVal [1]=Double.parseDouble(lenBay2.getText());
				inpVal [2]=Double.parseDouble(topBeamW.getText());
				inpVal [3]=Double.parseDouble(midBeamW.getText());
				inpVal [4]=Double.parseDouble(grBeamW.getText());
				inpVal [5]=Double.parseDouble(topColW.getText());
				inpVal [6]=Double.parseDouble(midColW.getText());
				inpVal [7]=Double.parseDouble(grColW.getText());
				inpVal [8]=Double.parseDouble(Ca.getText());
				inpVal [9]=Double.parseDouble(Cv.getText());
				inpVal [10]=Double.parseDouble(Na.getText());
				inpVal [11]=Double.parseDouble(Nv.getText());
				inpVal [12]=Double.parseDouble(I.getText());
				inpVal [13]=Double.parseDouble(R.getText());
				inpVal [14]=Double.parseDouble(heiT.getText());
				inpVal [15]=Double.parseDouble(heiM.getText());
				inpVal [16]=Double.parseDouble(heiG.getText());
				inpVal [17]=Double.parseDouble(cT.getText());

				String	xString=xtf1.getText();
				int xdou=Integer.parseInt(xString)	;
				int xans =propX(xdou);
				double sTg [] =fXtg(xdou,inpVal);
				double sM [] =fXmid(xdou,inpVal);
				if(xans==2 ) {
					double [] data= {sTg[0],sTg[1]};
					graphPlot(data,xdou);
				}
				if(xans==3 ) {
					double [] data= {sTg[0],sM[0],sTg[1]};
					graphPlot(data,xdou);
				}
				else if(xans==4) {
					double [] data= {sTg[0],sM[0],sM[1],sTg[1]};
					graphPlot(data,xdou);	
				}
				else if(xans==5) {
					double [] data= {sTg[0],sM[0],sM[1],sM[2],sTg[1]};

					graphPlot(data,xdou);	
				}
				else if(xans==6) {
					double [] data= {sTg[0],sM[0],sM[1],sM[2],sM[3],sTg[1]};

					graphPlot(data,xdou);	
				}
				else if(xans==7) {
					double [] data= {sTg[0],sM[0],sM[1],sM[2],sM[3],sM[4],sTg[1]};

					graphPlot(data,xdou);	
				}
			}});
		createFlowLayout();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	//Creating a layout for the Jframe
	private void createFlowLayout(){
		//mind the order of the components!
		pane = (JPanel) getContentPane();
		// Adding all text box.labels and buttons to pane
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

		pane.setLayout(new GridLayout(0,2));

		pane.add(valx);
		pane.add(valX);
		pane.add(valy);
		pane.add(valY);
		pane.add(valz);
		pane.add(valZ);
		pane.add(tH);
		pane.add(totH);
		pane.add(tP);
		pane.add(timeP);
		pane.add(tW);
		pane.add(totW);
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
	// Method 1 for no of floors
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
	//Method 2 for Material properties
	public  static String propY(int y) {
		String Y="";
		switch(y) {
		case 0: Y="LB-Infill:weak-FIW";
		//System.out.println("RC:LowerBound"+"Infill:weak"+"FIW");
		break;
		case 1: Y="LB-Infill:weak-SS";
		break;
		//	System.out.println("RC:LowerBound"+"Infill:weak"+"SS");
		case 2: Y="LB-Infill:medium-FIW";
		break;
		//System.out.println("RC:LowerBound"+"Infill:medium"+"FIW");
		case 3: Y="LB-Infill:strong-FIW";
		break;
		//System.out.println("RC:LowerBound"+"Infill:strong"+"FIW");
		case 4: Y="LB-Infill:strong-FIW";
		break;
		//System.out.println("RC:LowerBound"+"Infill:strong"+"FIW");
		case 5: Y="UB-Infill:weak-FIW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:weak"+"FIW");
		case 6: Y="UB-Infill:weak-SS";
		break;
		//System.out.println("RC:UpperBound"+"Infill:weak"+"SS");
		case 7: Y="UB-Infill:medium-FIW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:medium"+"FIW");
		case 8: Y="UB-Infill:strong-FIW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:strong"+"FIW");
		case 9: Y="UB-Infill:strong-FIW";
		break;
		//System.out.println("RC:UpperBound"+"Infill:strong"+"FIW");
		default : Y="Wrong input";
		}
		return Y;
	}
	//Method 3 for Time history
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
	//Method 4 for total weight of building
	public  double weightTotal(int x,double [] inpVal) {

		int noOfFloors=propX(x);
		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];

		double beamWeight=(topBW+midBW*(noOfFloors-2)+grBW)*(lenb1+lenb2);
		double colWeight=(topCW+midCW*(noOfFloors-2)+grCW)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	//Method 5 for top weight
	public  double weightTop(double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		//Top floor weight
		double beamWeight=topBW*(lenb1+lenb2);
		double colWeight=(topCW)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	//Method 6 for bottom weight 
	public  double weightBot(double [] inpVal) {
		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		//Top floor weight
		double beamWeight=grBW*(lenb1+lenb2);
		double colWeight=grCW*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	//Method 7 for Middle weight 
	public  double weightMid(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		int noOfFloors=propX(x);
		//Top floor weight
		double beamWeight=midBW*(noOfFloors-2)*(lenb1+lenb2);
		double colWeight=midCW*(noOfFloors-2)*3;
		double totalWeight=beamWeight+colWeight;
		return totalWeight;
	}
	//Method 8 for Base shear cofficient
	public double baseShearCoff(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		double t=timePeriod(x,inpVal);
		double baseCoff=cv*i/(r*t);
		return baseCoff;
	}
	//Method 9 for timeperiod of building
	public  double timePeriod(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];

		double hn=heightCal(x,inpVal);
		double tPeriod=ct*(Math.pow(hn, (0.75)));
		return tPeriod;
	}
	//Method 10 for total height calculation of building
	public double heightCal(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];

		int noOfFloors=propX(x);
		double tHeight=hT+hG+(noOfFloors-2)*hM;
		return tHeight;

	}
	// Method 11 for Base shear calculation
	public double baseShear(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];

		double baseCoff=baseShearCoff(x,inpVal);
		double weight=weightTotal(x,inpVal);
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
	// Method 12 for cumputing ft
	public double comFt(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		double t=timePeriod(x,inpVal);
		double v=baseShear(x,inpVal);
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
	// Method 13 for computing sum of weights of ground and top
	public double sumOfFnWei(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		double sMid=0;
		double wTf=weightTop(inpVal);
		double wGf=weightBot(inpVal);
		double wMf=weightMid(x,inpVal);
		int noOfFloors=propX(x);
		int midFloors=noOfFloors-2;
		// sum of ground and top
		double sumGnT=wTf*((noOfFloors-2)*hM+hT+hG)+wGf*hG;

		if(noOfFloors>2) {
			//sum of mid
			for (int k=1 ; k<=noOfFloors-2 ; k++) {
				sMid+=(wMf/midFloors)*(hM*k+hG);
			}	
			return sumGnT+sMid;
		}
		else {
			return sumGnT;
		}
	}
	// Method 14 for computing sum of weights of Middle floors
	public double [] wxhx(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		int noOfFloors=propX(x);
		int midFloors=noOfFloors-2;
		double[] val=new double [midFloors];

		double wTf=weightTop(inpVal);
		double wGf=weightBot(inpVal);
		double wMf=weightMid(x,inpVal);
		double sumG=wGf*hG;
		double sumT=wTf*((noOfFloors-2)*hM+hT+hG);
		double valO [] = {0,0};
		if(noOfFloors>2) {
			//sum of mid
			for (int k=1 ; k<=noOfFloors-2 ; k++) {
				val[k-1]=(wMf/midFloors)*(hM*k+hG);
			}

			return val;
		}
		else {
			return valO;
		}
	}
	// Method 15 for computing sum of weights of ground and top not cumulative
	public double [] wxhxGnT(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		// for ground and top 
		int noOfFloors=propX(x);
		double wTf=weightTop(inpVal);
		double wGf=weightBot(inpVal);
		double sumG=wGf*hG;
		double sumT=wTf*((noOfFloors-2)*hM+hT+hG);
		double valO [] = {sumG,sumT};
		return valO;
	}
	//Method 16 cumputing of V minus Ft factor
	public double  vMinFt(int x,double [] inpVal) {

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		double v = baseShear(x,inpVal);
		double ft= comFt(x,inpVal);
		return v-ft;
	}
	//Method 17 for storey forces for middle floors
	public double [] fXmid(int x,double [] inpVal) {
		int noOfFloors=propX(x);

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];

		double[] storeyF=new double [noOfFloors-2];	
		double vMinFt=vMinFt(x,inpVal);
		double n1[]=wxhx(x,inpVal);
		//	System.out.println(n1[0]+""+n1[1]);
		double sum=sumOfFnWei(x,inpVal);
		for (int k =0;k<noOfFloors-2;k++) {
			storeyF[k]=vMinFt*n1[k]/sum;
		}
		return storeyF;
	}
	//Method 18 for top and ground floor
	public double [] fXtg(int x,double [] inpVal) {
		int noOfFloors=propX(x);

		double lenb1=inpVal [0];
		double lenb2=inpVal [1];
		double topBW=inpVal [2];
		double midBW=inpVal [3];
		double grBW=inpVal  [4];
		double topCW=inpVal [5];
		double midCW=inpVal [6];
		double grCW=inpVal [7];
		double ca=inpVal [8];
		double cv=inpVal [9];
		double na=inpVal [10];
		double nv=inpVal [11];
		double i=inpVal [12];
		double r=inpVal [13];
		double hT=inpVal [14];
		double hM=inpVal [15];
		double hG=inpVal [16];
		double ct=inpVal [17];
		double[] storeyF=new double [noOfFloors];	
		double vMinFt=vMinFt(x,inpVal);
		double n2[]=wxhxGnT(x,inpVal);
		double sum=sumOfFnWei(x,inpVal);
		for (int k =0;k<2;k++) {
			storeyF[k]=vMinFt*n2[k]/sum;
		}
		return storeyF;
	}
	//Method 19 for ploting of a graph 
	//https://www.youtube.com/watch?v=cw31L_OwX3A&list=LLRkVz3oUd1GQ1KNwXBC_NqA&index=3&t=1844s
	public void graphPlot(double [] data,int x ) {

		int noOfFloors=propX(x);
		JFrame graphFrame = new JFrame();
		graphFrame.setTitle("Storey Shear");
		graphFrame.setSize(500,500);
		graphFrame.setLayout(new BorderLayout());
		graphFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		XYSeries ser=new XYSeries("");
		for (int i=0;i<noOfFloors;i++) {
			ser.add(data[i], (i+1)*1);
		}
		XYSeriesCollection xy=new XYSeriesCollection();
		xy.addSeries(ser);
		JFreeChart chart = ChartFactory.createXYLineChart(
				"Storey Shear of 2D Frame", 
				"Force",
				"No of Stories", xy,  PlotOrientation.VERTICAL, false,  false,  false);
		graphFrame.add(new ChartPanel(chart),  BorderLayout.CENTER);
		graphFrame.setVisible(true);
	}
	public static void main(String[] args){
		//places the application on the Swing Event Queue such that all UI updates are concurrency-safe
		EventQueue.invokeLater(() ->{
			Calculate cal = new Calculate();
			cal.setVisible(true);
		});

	}
}