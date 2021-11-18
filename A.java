public class A {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doNothing(String text, int number) {
		System.out.println(text);
		System.out.println(number);
	}
}