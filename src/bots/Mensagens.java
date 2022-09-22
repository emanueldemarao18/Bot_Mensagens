package bots;

import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Mensagens {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int contador = 1;
		
		int mensagens_enviadas = 0;
		Robot robo_emanuel = new Robot();

		Scanner ler = new Scanner(System.in);
		String texto = "";
		// do {
		System.out.println("Digite a mensagem a enviar");

		texto = ler.nextLine();

		StringSelection palavras = new StringSelection(texto);

		Clipboard area_transferencia = Toolkit.getDefaultToolkit().getSystemClipboard();

		area_transferencia.setContents(palavras, null);

		System.out.println("As mensagens vão ser enviadas em 5 segundos");
		Thread.sleep(1);

		while (contador <= 1000000000) {

			Thread.sleep(1000);

			robo_emanuel.keyPress(KeyEvent.VK_CONTROL);
			
			
			robo_emanuel.keyPress(KeyEvent.VK_V);
			
			
			
			robo_emanuel.keyRelease(KeyEvent.VK_CONTROL);
			robo_emanuel.keyRelease(KeyEvent.VK_V);

			robo_emanuel.keyPress(KeyEvent.VK_ENTER);
			robo_emanuel.keyRelease(KeyEvent.VK_ENTER);
			mensagens_enviadas++;
			
			System.out.println(mensagens_enviadas);

			contador += 1;

		}
		// } while (!texto.equalsIgnoreCase("sair"));

		ler.close();

	}

}
