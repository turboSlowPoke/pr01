import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by kuteynikov on 17.03.2017.
 */
public class Main {
    public static void main(String[] a) throws Exception {
        Frontend frontend = new Frontend();
        Server server = new Server(8080);
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(contextHandler);
        contextHandler.addServlet(new ServletHolder(frontend),"/authform");
        server.start();
        server.join();
    }
}
