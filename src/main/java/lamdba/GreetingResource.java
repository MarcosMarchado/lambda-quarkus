package lamdba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//https://towardsaws.com/creating-aws-codepipeline-using-aws-cdk-6d6895d56cee
//https://towardsaws.com/deploying-a-lambda-function-using-aws-codepipeline-7b1d06a45f39
@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello jaxrs!";
    }

    @GET
    @Path("/pipeline-aws")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloAws() {
        return "hello AWS!";
    }
}
