package Teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// Vari�vel
		int peso;
		double altura;

		float abaixoPeso = 18.5f;
		int normalPeso = 25;
		int acimaPeso = 30;

		// JOptionPane e Mensagem no Console
		String val1 = JOptionPane.showInputDialog("Digite o seu peso");
		if (val1 == null) {
			return;

		} else {
			peso = Integer.parseInt(val1);
			System.out.println("Seu peso �: " + peso);
		}

		String val2 = JOptionPane.showInputDialog("Digite a sua altura");
		if (val2 == null) {
			return;

		} else {
			altura = Double.parseDouble(val2);

		}
		String msg = String.format("Sua altura � %.2f", altura);
		System.out.println(msg);

		// La�o para valida��o
		while (true) {

			// Valida��o da altura && peso
			if (altura <= 0 || peso <= 0) {
				JOptionPane.showMessageDialog(null, "Voc� inseriu dados errados!");
				peso = 0; // Zerei a mem�ria para n�o haver casos de mem�ria suja e sair errado no sistema
				altura = 0;

				peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
				System.out.println("Seu peso �: " + peso);

				altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura"));
				msg = String.format("Sua altura � %.2f", altura);
				System.out.println(msg);

			} else {

				// Development
				double IMC = peso / (Math.pow(altura, 2));
				System.out.println(IMC);
				if (IMC < abaixoPeso) {
					JOptionPane.showMessageDialog(null, "Voc� � abaixo do peso!");
					break;
				} else {
					if (IMC <= normalPeso) {
						JOptionPane.showMessageDialog(null, "Voc� esta entre o peso!");
						break;
					} else {
						if (IMC < acimaPeso) {
							JOptionPane.showMessageDialog(null, "Voc� est� acima do peso!");
							break;
						} else {
							JOptionPane.showMessageDialog(null, "Voc� est� obeso!");
							break;

						}

					}

				}

			}
		}

	}

}
