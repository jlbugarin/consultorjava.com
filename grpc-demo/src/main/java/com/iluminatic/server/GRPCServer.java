package com.iluminatic.server;

import java.io.IOException;

import com.iluminatic.service.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server server = ServerBuilder.forPort(8080).addService(new UserService()).build();
		server.start();
		System.out.println("Servidor Iniciado en puero: "+server.getPort());
		server.awaitTermination();
	}

}
