package generated

import (
	"context"
	"log"
)

type HealthCheck struct {
	HealthCheckServer
}

func (s *HealthCheck) Hello(ctx context.Context, message *Empty) (*HealthCheckResponse, error) {
	log.Printf("Received Request: %v", message)
	return &HealthCheckResponse{Message: "Hello"}, nil
}
