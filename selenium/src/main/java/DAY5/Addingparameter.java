package DAY5;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Addingparameter {


@Test
@Parameters ({"Val1","Val2"})
public void Sum(int Val1,int Val2){
	int finalsum=Val1+Val2;
	System.out.println(finalsum);
	
}

}
