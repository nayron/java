package edu.univas.si.controleprodutos.view;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.experimental.chart.plot.CombinedXYPlot;

import edu.univas.si.controleprodutos.model.Venda;

public class SalesGraphicPanel extends JPanel {

   	private static final long serialVersionUID = 7972112141774550761L;
   	
   	private JButton _jButtonVoltar;
   	private JPanel _jPanelAnterior;
   	
   	ArrayList<Venda> _vendas = null;

	public SalesGraphicPanel(ArrayList<Venda> vendas, JPanel jPanelAnterior) {
        super(new BorderLayout());
        _vendas = vendas;  
        _jPanelAnterior = jPanelAnterior;
        
        JFreeChart chart = createCombinedChart();
        JPanel panelCentro = new ChartPanel(chart);
        
        JPanel panelSul = new JPanel();
        panelSul.add(getJButtonVoltar());
        
        add(panelCentro, BorderLayout.CENTER);
        add(panelSul, BorderLayout.SOUTH);
    }
	
	private JButton getJButtonVoltar(){
		if (_jButtonVoltar == null){
			_jButtonVoltar = new JButton("Voltar");
			_jButtonVoltar.setIcon(new ImageIcon(getClass().getResource("/images/voltar.png")));
			_jButtonVoltar.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(_jPanelAnterior);					
				}			
			});
		}
		return _jButtonVoltar;		
	}

   
    private JFreeChart createCombinedChart() {

        // create plot ...
        IntervalXYDataset data1 = createDataset1();
        
        XYItemRenderer renderer1 = new XYLineAndShapeRenderer(true, false);
        renderer1.setBaseToolTipGenerator(new StandardXYToolTipGenerator(
                StandardXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT,
                new SimpleDateFormat("dd-MM-yyyy"), new DecimalFormat("0.00")));
        renderer1.setSeriesStroke(0, new BasicStroke(4.0f,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        renderer1.setSeriesPaint(0, Color.blue);

        DateAxis domainAxis = new DateAxis("Data");
        domainAxis.setLowerMargin(0.0);
        domainAxis.setUpperMargin(0.02);
        ValueAxis rangeAxis = new NumberAxis("R$ Valor Vendido");
        XYPlot plot1 = new XYPlot(data1, null, rangeAxis, renderer1);
        plot1.setBackgroundPaint(Color.lightGray);
        plot1.setDomainGridlinePaint(Color.white);
        plot1.setRangeGridlinePaint(Color.white);

        // add a second dataset and renderer...
        IntervalXYDataset data2 = createDataset2();
        
        XYBarRenderer renderer2 = new XYBarRenderer() {
           
			private static final long serialVersionUID = 7600521905194134300L;

			public Paint getItemPaint(int series, int item) {
                XYDataset dataset = getPlot().getDataset();
                if (dataset.getYValue(series, item) >= 0.0) {
                    return Color.red;
                }
                else {
                    return Color.green;
                }
            }
        };
        renderer2.setSeriesPaint(0, Color.red);
        renderer2.setDrawBarOutline(false);
        renderer2.setBaseToolTipGenerator(new StandardXYToolTipGenerator(
                StandardXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT,
                new SimpleDateFormat("dd-MM-yyyy"), new DecimalFormat("0.00")));

        XYPlot plot2 = new XYPlot(data2, null, new NumberAxis("R$ Valor Vendido"),
                renderer2);
        plot2.setBackgroundPaint(Color.lightGray);
        plot2.setDomainGridlinePaint(Color.white);
        plot2.setRangeGridlinePaint(Color.white);

        CombinedXYPlot cplot = new CombinedXYPlot(domainAxis, rangeAxis);
        cplot.add(plot1, 1);
        cplot.add(plot2, 3);
        cplot.setGap(8.0);
        cplot.setDomainGridlinePaint(Color.white);
        cplot.setDomainGridlinesVisible(true);

        // return a new chart containing the overlaid plot...
        JFreeChart chart = new JFreeChart("Valor das vendas realizadas no período",
                JFreeChart.DEFAULT_TITLE_FONT, cplot, false);
        chart.setBackgroundPaint(Color.white);
        LegendTitle legend = new LegendTitle(cplot);
        chart.addSubtitle(legend);
        return chart;
    }

    private IntervalXYDataset createDataset1() {        
        TimeSeries series = new TimeSeries("Valor das vendas", Day.class);
        for (Venda venda: _vendas){			
            series.add(new Day(venda.getDate()), venda.getValorVendido());
        }        
        return new TimeSeriesCollection(series);
    }

    private IntervalXYDataset createDataset2() {       
        TimeSeries series = new TimeSeries("Valor das vendas", Day.class);
        for (Venda venda: _vendas){			
            series.add(new Day(venda.getDate()), venda.getValorVendido());           
        }         
        return new TimeSeriesCollection(series);
    }   
}
