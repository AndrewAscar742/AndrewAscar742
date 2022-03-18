package p1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Variável
		int peso;
		double altura;

		float abaixoPeso = 18.5f;
		int normalPeso = 25;
		int acimaPeso = 30;

		// JOptionPane e Mensagem no Console
		String val1 = JOptionPane.showInputDialog("Digite o seu peso");
		if (val1 == null) {
			return;
			
		}else {
			peso = Integer.parseInt(val1);
			System.out.println("Seu peso é: " + peso);
		}
		
		String val2 = JOptionPane.showInputDialog("Digite a sua altura");
		if (val2 == null){
			return;
			
		} else {
			altura = Double.parseDouble(val2);
			
		}
		String msg = String.format("Sua altura é %.2f", altura);
		System.out.println(msg);
		
		//Laço para validação
		while (true) {

			// Validação da altura && peso
			if (altura <= 0 || peso <= 0) {
				JOptionPane.showMessageDialog(null, "Você inseriu dados errados!");
				peso = 0; // Zerei a memória para não haver casos de memória suja e sair errado no sistema
				altura = 0;

				peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
				System.out.println("Seu peso é: " + peso);

				altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura"));
				msg = String.format("Sua altura é %.2f", altura);
				System.out.println(msg);

			} else {
				
				// Development
				double IMC = peso / (Math.pow(altura, altura));
				if (IMC < abaixoPeso) {
						JOptionPane.showMessageDialog(null, "Você é abaixo do peso!");
						break;
					} else {
				if (IMC <= normalPeso) {
						JOptionPane.showMessageDialog(null, "Você esta entre o peso!");
						break;
					} else {
				if (IMC < acimaPeso) {
						JOptionPane.showMessageDialog(null, "Você está acima do peso!");
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Você está obeso!");
						break;

						}

					}

				}

			}
		}

	}
}
