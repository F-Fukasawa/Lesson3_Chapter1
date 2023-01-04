package inner_class_sample;

public class Outer {
	 // 外部クラスに定義したフィールドgreeting
	private static String greeting = "こんにちは";
	
	public class Inner{
		public String hello() {
			//内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			return greeting;		}
	}
}
