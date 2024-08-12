import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.HealthCheckService;

import java.io.IOException;
import java.util.logging.Logger;

public class ApplicationServe {
    private static final Logger logger = Logger.getLogger(ApplicationServe.class.getName());

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(50052).addService(
                new HealthCheckService()
        ).build();

        server.start();

        logger.info("Serve started on " + server.getPort());

        server.awaitTermination();

    }
}
