package Connection;

import java.io.Serializable;

public class Package implements Serializable {

    private String message;

    public Package(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }


}