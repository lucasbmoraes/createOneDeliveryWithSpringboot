package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.entities.Produto;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public Email buildEmail (Pedido pedido) {
        Email email = new Email();
        StringBuilder bodyEmail = new StringBuilder();

        bodyEmail.append("Pedido número " + pedido.getId() + " criado com sucesso para " + pedido.getUsuario().getNome());

        bodyEmail.append("\n Detalhes do pedido: \n");

        for (Produto produto : pedido.getProdutos()) {
            bodyEmail.append(produto.getQuantidade() +"x" + produto.getNome());
            bodyEmail.append("\n");
        }

        email.setEmailFrom("luucaasm11@gmail.com");
        email.setEmailTo(pedido.getUsuario().getEmail());
        email.setSubject("PEDIDO REALIZADO");
        email.setText(bodyEmail.toString());

        return email;
    }
    public void sendEmail(Email email) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            emailSender.send(message);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
