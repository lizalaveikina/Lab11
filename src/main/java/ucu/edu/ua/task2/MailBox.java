package ucu.edu.ua.task2;

import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.errors.MailjetException;


import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<MailInfo> information = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        information.add(info);
    }

    public void sendAll() throws MailjetException, MailjetSocketTimeoutException {

        MailSender sender = new MailSender();

        for (MailInfo mailInfo : information) {
            sender.sendMail(mailInfo);
        }

    }
    
}
