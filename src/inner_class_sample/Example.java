package inner_class_sample;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();	//クラスOuterをインスタンス化
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(Constants.Cat.NAME);
		System.out.println(Constants.Cat.LEG_COUNT);
		System.out.println(Constants.Octopus.NAME);
		System.out.println(Constants.Octopus.LEG_COUNT);
	}
}
