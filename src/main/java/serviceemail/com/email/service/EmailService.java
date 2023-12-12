package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.entities.Produto;
import serviceemail.com.email.enums.StatusEmail;
import serviceemail.com.email.repository.EmailRepository;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    EmailRepository emailRepository;

    public void buildEmail (Pedido pedido) {
        Email email = new Email();
        email.setEmailFrom("luucaasm11@gmail.com");
        email.setEmailTo(pedido.getUsuario().getEmail());
        email.setSubject("Pedido número " + pedido.getId() + " criado com sucesso para " + pedido.getUsuario().getNome());
        email.setText("\n Teste \n");
        sendEmail(email);
    }
    public void sendEmail(Email email) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            emailSender.send(message);

            System.out.println(email.toString());

            email.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            email.setStatusEmail(StatusEmail.ERROR);
        }
    }
}
