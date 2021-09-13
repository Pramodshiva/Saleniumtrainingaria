package DAY5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Addingdataprovider {
@DataProvider(name="dataprovider")
public Object[][]providedata(){
	return new Object[][] {{2},{3}};
}
@Test(dataProvider = "dataprovider")
public void sum(String v1){
	System.out.println(v1);
}
}
