package TUI;

import java.util.Scanner;

public class TUI implements IUI {

	private InputListener listener;

	public TUI() {
		//Listening thread
		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true){
					String input = scanner.next();
					if (listener!=null) listener.onSelectItem(input);
					showMenu();
				}

			}
		}).start();
	}

	@Override
	public void registerListener(InputListener listener) {
		this.listener= listener;

	}

	@Override
	public void showMenu() {
		System.out.println("\r\r\r\r");
		System.out.println("Indtast et tal");

	}

	@Override
	public void showAdminMenu() {		
		System.out.println("\r\r\r\r");
		System.out.println("Indtast et admin tal");

	}

}
