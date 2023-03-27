package assignment.abstraction;

public abstract class MultipleLanguage implements Language,TestTool {
	public void python()
	{
		System.out.println("Implemented method Python");
	}
	public abstract void ruby();
}
