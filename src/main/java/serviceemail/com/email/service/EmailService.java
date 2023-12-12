package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    Pedido pedido;

    public void sendEmail(Email emailModel, Pedido pedido) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject("Pedido criado com sucesso!");
            message.setText("O seu pedido de número" + pedido.getId() + "foi realizado com sucesso e logo chegará em sua residência.");
            emailSender.send(message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
