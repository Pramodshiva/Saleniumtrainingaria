package DAY5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class passingmultipledata {
@DataProvider(name="dataprovider",parallel=true)
public Object[][] adddata(){
	return new Object[][] {new Object[][]{{1,3},{6,8}},{3,5}};
}
@Test(dataProvider="dataprovider")
public void add(int a,int b){
	int c=a+b;
	System.out.println(c);
}
}
