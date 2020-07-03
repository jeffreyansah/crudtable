package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.servlet.http.HttpServlet;

import org.junit.jupiter.api.Test;

import servlet.StuffController;

class ServletTest extends HttpServlet{

	
	StuffController controller= new StuffController();
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
