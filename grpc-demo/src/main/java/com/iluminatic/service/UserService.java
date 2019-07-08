package com.iluminatic.service;

import com.iluminatic.grpc.User.APIResponse;
import com.iluminatic.grpc.User.Empty;
import com.iluminatic.grpc.User.LoginRequest;
import com.iluminatic.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("LOGIN...");
		String user =request.getUsername();
		String pass =request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if (user.equals(pass)){
			response.setResponseCode(0).setResponsemessage("OK");
			
		}else{
			response.setResponseCode(100).setResponsemessage("NO OK");
			
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		//super.login(request, responseObserver);
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}

}
