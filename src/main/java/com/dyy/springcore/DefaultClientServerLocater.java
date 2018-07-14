package com.dyy.springcore;

public class DefaultClientServerLocater {

    public ClientService getClientService(){
        return ClientService.creatInstance();
    }
}
