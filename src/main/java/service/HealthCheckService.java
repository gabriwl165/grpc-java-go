package service;

import generated.Empty;
import generated.HealthCheckResponse;
import generated.healthCheckGrpc;
import io.grpc.stub.StreamObserver;

public class HealthCheckService extends healthCheckGrpc.healthCheckImplBase {

    @Override
    public void hello(Empty request, StreamObserver<HealthCheckResponse> responseObserver) {
        HealthCheckResponse.Builder response = HealthCheckResponse.newBuilder();
        response.setMessage("Hello World!");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
