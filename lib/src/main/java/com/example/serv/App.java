package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAgEX9qJCL9mqgL9DCqHqdrsEJKfHwb9BU";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("");
        //FIXME the key underneath is the old addRegId. The new one will be placed in the empty string
        //APA91bGB-ZbeyCtLP_QRNQE5zu4Y-1LgRlTFiIMh2vDrhtgVwL5vTo5DYiE_YFo4ftOjxk4Nihykt_LSTPL9T_7FX64I7EQoe-l_eQ_4-T36BwAdOgAioktNUE1fwFoaPe6fdzQ1Aayx
            //String str = msg.getPayload().get("message");
        c.createData("Working!!", "Test message");

        return c;
    }
}

