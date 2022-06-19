package testNGDemo;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = { "Smoke" })
	public void data() {

		System.out.println("data");
	}

}
