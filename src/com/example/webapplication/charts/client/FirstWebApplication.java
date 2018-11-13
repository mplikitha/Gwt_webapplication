package com.example.webapplication.charts.client;

import com.example.webapplication.charts.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.PieChart;
import com.googlecode.gwt.charts.client.sankey.Sankey;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FirstWebApplication implements EntryPoint {
//	 private PieChart chart;
//
//	   private void initialize() {
//	      ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
//	      chartLoader.loadApi(new Runnable() {
//	         public void run() {
//	            // Create and attach the chart
//	            chart = new PieChart();
//	            RootPanel.get().add(chart);
//	            draw();
//	         }
//	      });
//	   }
//	   private void draw() {
//	      // Prepare the data
//	      DataTable data = DataTable.create();
//	      data.addColumn(ColumnType.STRING, "Browser");
//	      data.addColumn(ColumnType.NUMBER, "Percentage");
//	      data.addRow("Firefox", 45.0);
//	      data.addRow("IE", 26.8);
//	      data.addRow("Chrome", 12.8);
//	      data.addRow("Safari", 8.5);
//	      data.addRow("Opera", 6.2);
//	      data.addRow("Others", 0.7);
//
//	      // Draw the chart
//	      chart.draw(data);
//	      chart.setWidth("400px");
//	      chart.setHeight("400px");
//	   }
//	   public void onModuleLoad() {
//	      initialize();
//	   }
//	}
	
	
	
	 private Sankey chart;

	   private void initialize() {
	      ChartLoader chartLoader = new ChartLoader(ChartPackage.SANKEY);
	      chartLoader.loadApi(new Runnable() {
	         public void run() {
	            // Create and attach the chart
	            chart = new Sankey();
	            RootPanel.get().add(chart);
	            draw();
	         }
	      });
	   }
	   private void draw() {
	      // Prepare the data
	      DataTable data = DataTable.create();
	      data.addColumn(ColumnType.STRING, "From");
	      data.addColumn(ColumnType.STRING, "To");
	      data.addColumn(ColumnType.NUMBER, "Weight");

	      data.addRow("Brazil","Portugal",5);
	      data.addRow("Brazil","France",1 );
	      data.addRow("Brazil","Spain",1 );
	      data.addRow("Brazil","England",1 );
	      data.addRow("Canada","Portugal",1 );
	      data.addRow("Canada","France",5 );
	      data.addRow("Canada","England",1 );
	      data.addRow("Mexico","Portugal",1 );
	      data.addRow("Mexico","France",1 );
	      data.addRow("Mexico","Spain",5 );
	      data.addRow("Mexico","England",1 );
	      data.addRow("USA","Portugal",1 );
	      data.addRow("USA","France",1 );
	      data.addRow("USA","Spain",1 );
	      data.addRow("USA","England",5);      

	      // Draw the chart
	      chart.draw(data);
	      chart.setWidth("400px");
	      chart.setHeight("400px");
	   }
	   public void onModuleLoad() {
	      initialize();
	   }
	}