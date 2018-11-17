
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(400,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1><b>SpeedTest</b></h1>");
		sb.append("<div style='table' >");
		//PRIMA RIGA
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("Date");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("Up(Mbps)");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("Down(Mpbs)");
		sb.append("</div>");
		
		sb.append("</div>");
		//SECONDA RIGA
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("1/7/18");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("25.0");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("28.9");
		sb.append("</div>");
		
		sb.append("</div>");
		//TERZA RIGA
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("7/9/18");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("24.6");
		sb.append("</div>");
		
		sb.append("<div style=display:table-cell>");
		sb.append("1.99");
		sb.append("</div>");
		
		sb.append("</div>");
		
		
		
		
		
		
		
		// TODO Convertire lo StringBuilder in String
		String str=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

