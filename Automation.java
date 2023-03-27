package assignment.abstraction;

public class Automation extends MultipleLanguage {
	public static void main(String[] args) {
		Automation lang=new Automation();
		lang.java();
		lang.selenium();
		lang.ruby();
	}
	public void java() {
		System.out.println("Java");
		
	}

	public void selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

}
