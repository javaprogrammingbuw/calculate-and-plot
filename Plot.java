import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Plot extends Calculate {
	public Plot() {	
	}
	
	//Method 19 for ploting of a graph 
	//Reference : https://www.youtube.com/watch?v=cw31L_OwX3A&list=LLRkVz3oUd1GQ1KNwXBC_NqA&index=3&t=1844s
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
				"Storey Force (kN) ",
				"No of Stories (#)", xy,  PlotOrientation.VERTICAL, false,  false,  false);
		graphFrame.add(new ChartPanel(chart),  BorderLayout.CENTER);
		graphFrame.setVisible(true);
	}
}
