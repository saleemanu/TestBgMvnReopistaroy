package testNGBaseClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(priority = 0, dataProvider = "datasetting")
	public void testingwithusernames(String username, String password) {
		System.out.println(username + " " + password);
	}

	@DataProvider
	public Object[][] datasetting() {
		Object data[][] = new Object[2][2];
		data[0][0] = "username1";
		data[0][1] = "password1";

		data[1][0] = "username2";
		data[1][1] = "password2";

		return data;
	}

	@Test(priority = 1, dataProvider = "datasetting2")
	public void testingwithusernames2(String username, String password) {
		System.out.println(username + " " + password);
	}

	@DataProvider
	public Object[][] datasetting2() {
		Object data1[][] = { { "username3", "password3" }, { "username4", "password4" } };
		return data1;
	}

}
