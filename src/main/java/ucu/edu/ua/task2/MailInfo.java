package ucu.edu.ua.task2;

enum MailCode {

    BIRTHDAY, GIFT
   
}


class MailInfo {

    private MailCode type;
    private Client client;


    public MailInfo(Client client, MailCode type) {
        this.client = client;
        this.type = type;
    }

    @Override

    public String toString() {
        return "Client: " + client + ", type: " + type;
    }
}