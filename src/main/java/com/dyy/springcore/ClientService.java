package com.dyy.springcore;

public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService(){}
    public static ClientService creatInstance(){
        return clientService;
    }
}
