package us.inest.app.mockito;

public class Collaborator {
	public String transformString(String input) {
		return doStuff();
	}

	private String doStuff() {
		return "";
	}
}
