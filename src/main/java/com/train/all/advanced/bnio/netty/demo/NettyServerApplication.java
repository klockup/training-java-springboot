package com.train.all.advanced.bnio.netty.demo;


public class NettyServerApplication {

    public static void main(String[] args) {
        HttpServer server = new HttpServer(false,8808);
        try {
            server.run();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
