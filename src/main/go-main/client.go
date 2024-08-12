package main

import (
	"context"
	"github.com/gabriwl165/grpc-java-go/src/main/go-main/generated"
	"google.golang.org/grpc"
	"log"
)

func main() {
	var conn *grpc.ClientConn
	conn, err := grpc.Dial(":50052", grpc.WithInsecure())

	if err != nil {
		log.Fatalf("Could not connect: %s", err)
	}

	defer conn.Close()

	c := generated.NewHealthCheckClient(conn)

	message := generated.Empty{}

	response, err := c.Hello(context.Background(), &message)

	if err != nil {
		log.Fatalf("Error when calling: %s", err)
	}

	log.Printf("Response from server: %s", response.Message)

}
