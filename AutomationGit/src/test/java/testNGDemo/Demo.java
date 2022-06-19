package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	@Test(groups = { "Smoke" })

	@Parameters({ "URL", "UserName" })
	public void demo() {

		System.out.println("demo");
//		System.out.println(urlName);
//		System.out.println(Username);
	}

	@Test(dataProvider = "getData")

	public void dummy(String UserName, String Password) {

		System.out.println("dummy");
		System.out.println(UserName);
		System.out.println(Password);
	}

	@DataProvider

	public Object[][] getData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "FuserName";
		data[0][1] = "Fpassword";
		data[1][0] = "SuserName";
		data[1][1] = "Spassword";
		data[2][0] = "TuserName";
		data[2][1] = "Tpassword";
		return data;

	}

}
