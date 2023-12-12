package serviceemail.com.email.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import serviceemail.com.email.dto.EmailDto;
import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.service.EmailService;

@RestController
@RequestMapping(value = "/email")
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("/sendingEmail")
    public ResponseEntity<Email> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
        Email email = new Email();
        BeanUtils.copyProperties(emailDto, email);
        emailService.sendEmail(email);
        return new ResponseEntity<>(email, HttpStatus.CREATED);
    }
}
