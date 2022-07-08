package Day07.Inter3;

public interface MyInterface {
	default void d_method() {
		System.out.println("MyInterface의 d");
	}
	
	static void s_method() {
		System.out.println("MyInterface의 s");
	}

}
