package Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

@Path("/w")
@GET
@Produces(MediaType.TEXT_PLAIN)
public String getTestService() {
	return "Hello World! I don't have any idea about this";
	}
}