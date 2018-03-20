package client;

public class HourServerConsume {
    public static void main(String[] args){
        ClientJavaLocalHourServerRestFulWS client = new ClientJavaLocalHourServerRestFulWS();
        System.out.println(client.getJson());
    }
}
