package io.github.oliviercailloux.y2018.thejoker2323;


import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.oliviercailloux.y2018.thejoker2323.HelloServlet;

class TestHelloServlet {
	
	@Test
	void test() throws Exception, IOException  {       
        HelloServlet serv = new HelloServlet();
        assertEquals("Hello world",serv.sayHello());
	}

}
