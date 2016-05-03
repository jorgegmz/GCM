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

        c.addRegId("APA91bGnuord-wE0MJFMNqygSKDRP9EWHP5Qidk9ftk9nRx0ocmqEiqzWxNVl02vQof7VMoDJF7PJGzBpu01WYqTvYOW0DD6_BLXC0g56SVLA_xB-5nX_ZCHP7ZZrDA0xGnq6BHw4w7Z");
        //FIXME the key underneath is the old addRegId. The new one will be placed in the empty string
        //APA91bGB-ZbeyCtLP_QRNQE5zu4Y-1LgRlTFiIMh2vDrhtgVwL5vTo5DYiE_YFo4ftOjxk4Nihykt_LSTPL9T_7FX64I7EQoe-l_eQ_4-T36BwAdOgAioktNUE1fwFoaPe6fdzQ1Aayx
            //String str = msg.getPayload().get("message");
        c.createData("Working!!", "Test message");

        return c;
    }
}

