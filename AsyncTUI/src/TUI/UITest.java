package TUI;

public class UITest implements InputListener {

	private IUI ui;

	public static void main(String[] args) {
		UITest test = new UITest();
		test.ui = new TUI();
		test.ui.registerListener(test);
		test.ui.showMenu();
	}

	@Override
	public void onSelectItem(String item) {
		System.err.println("ItemSelected:" + item);
		
	}
}
