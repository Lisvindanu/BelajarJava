package BelajarBroCode;

import java.util.HashMap;

public class IdPassword {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IdPassword(){
        logininfo.put("Lisvindanu", "Tampan");
        logininfo.put("Rafly", "Mulet");
        logininfo.put("Bro", "abc123");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
