package store;

import javax.xml.registry.infomodel.User;

public class Message {
    String message;
    String user;

    public Message(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
