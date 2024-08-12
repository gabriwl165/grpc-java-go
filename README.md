# grpc-java
Aplicação simples de um servidor Grpc usando Java


```shell
protoc --go_out=. --go-grpc_out=. --proto_path=../../proto/ --go_opt=paths=source_relative --go-grpc_opt=paths=source_relative  health_check.proto
```
