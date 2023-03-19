import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class aplicacion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Object[] options = {"Convertir monedas", "Convertir temperatura", "Salir"};
		int elige = JOptionPane.showOptionDialog(null, "Que deseas realizar?", "Conversor", 
				              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
				              null, options, options[0]);
		
		if (elige==2) {
			JOptionPane.showMessageDialog(null, "Programa cerrado");
			System.exit(0);			
			
		}
		if (elige==0) {
			String pattern = "#.##";
			DecimalFormat formatearDivisa = new DecimalFormat(pattern);
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = {"DOP a Dolar", "DOP a Euro", "DOP a Libras Esterlinas", 
						"DOP a Yen Japonés", "DOP a Won sur-coreano","Dolar a DOP", "Euro a DOP", 
						"Libras Esterlinas a DOP", "Yen Japonés a DOP", "Won sur-coreano a DOP"};
				String cambio = (String) JOptionPane.showInputDialog(null, "Elige una opcion:",
						"Conversor de Moneda",JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
				
				String input = JOptionPane.showInputDialog(null, "Ingrese cantidad en DOP");
				double pesos = 0;
				
				try {
					pesos = Double.parseDouble(input);					
				} catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}
				
				if (cambio.equals("DOP a Dolar")) {
					double dolar = pesos / 54;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Dominicanos son: " + 
					                              formatearDivisa.format(dolar) + " Dolares.");
					
				}else if(cambio.equals("DOP a Euro")) {
					double euro = pesos / 57.75;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Dominicanos son: " + 
					                              formatearDivisa.format(euro) + " Euros.");					
					
				}else if(cambio.equals("DOP a Libras Esterlinas")) {
					double libra = pesos / 65.99;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Dominicanos son: " + 
					                              formatearDivisa.format(libra) + " Libras Esterlinas.");					
					
				}else if(cambio.equals("DOP a Yen Japonés")) {
					double yen = pesos / 0.41;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Dominicanos son: " + 
					                              formatearDivisa.format(yen) + " Yen Japonés.");					
					
				}else if(cambio.equals("DOP a Won sur-coreano")) {
					double libra = pesos / 0.041;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Dominicanos son: " + 
					                              formatearDivisa.format(libra) + " Won sur-coreano.");					
					
				}else if (cambio.equals("Dolar a DOP")) {
					double dolar = pesos * 54;
					JOptionPane.showMessageDialog(null, pesos + " Dolares son: " + 
					                              formatearDivisa.format(dolar) + " Pesos Dominicanos.");
					
				}else if(cambio.equals("Euro a DOP")) {
					double euro = pesos * 57.75;
					JOptionPane.showMessageDialog(null, pesos + " Euros son: " + 
					                              formatearDivisa.format(euro) + " Pesos Dominicanos.");					
					
				}else if(cambio.equals("Libras Esterlinas a DOP")) {
					double libra = pesos * 65.99;
					JOptionPane.showMessageDialog(null, pesos + " Libras Esterlinas son: " + 
					                              formatearDivisa.format(libra) + " Pesos Dominicanos.");					
					
				}else if(cambio.equals("Yen Japonés a DOP")) {
					double yen = pesos * 0.41;
					JOptionPane.showMessageDialog(null, pesos + " Yen Japonés son: " + 
					                              formatearDivisa.format(yen) + " Pesos Dominicanos.");					
					
				}else if(cambio.equals("Won sur-coreano a DOP")) {
					double libra = pesos * 0.041;
					JOptionPane.showMessageDialog(null, pesos + " Won sur-coreano son: " + 
					                              formatearDivisa.format(libra) + " Pesos Dominicanos.");					
					
				}
				
				int confirma = JOptionPane.showConfirmDialog(null, "Deseas cambiar mas monedas?", 
						                               "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Finalizado");
				}
				
			
			}
			
		}
		
		if (elige==1) {
			boolean seguirPrograma = true;
			while (seguirPrograma) {
				String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
				int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion:",
						"Conversor de Temperatura",JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,null, opciones, opciones[0]);
				
				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
				double valor = 0.0;				
				try {
					valor = Double.parseDouble(valorNominal);					
				} catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				
				double resultado = 0;
				if (opcion == 0) {
					resultado = (valor * 9/5)+32;
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + 
												resultado + " Grados Fahrenheit.");					
				}else if(opcion == 1) {
					resultado = (valor - 32 ) * 5 / 9;
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + 
												resultado + " Grados Celsius.");					
				}
				
				int confirma = JOptionPane.showConfirmDialog(null, "Deseas seguir?", 
                        "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Finalizado");
				}
			}
		}

	}

}
