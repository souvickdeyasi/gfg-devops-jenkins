package springboothsecurity.security;

//@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SecurityApplication.class, args);
		int l = 10;
		int b = 20;
		System.out.println("Area of the given Rectangle is : " + SecurityApplication.areaRect(l, b));

	}

	static public int areaRect(int l, int b) {
		return (l * b);
	}
}
