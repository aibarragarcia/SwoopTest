package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TestController {

    @RequestMapping(value ="math/add", method = { RequestMethod.GET, RequestMethod.POST } )
    public Test add(  @RequestParam(value="n1" ) long n1  , @RequestParam(value="n2") long n2) {
        return new Test(n1, n2);
    }
    
    @RequestMapping(value ="time/now" , method = RequestMethod.GET)
    public TestTime time(){
    		return new TestTime(); 	 	       
    }
    
    
}
