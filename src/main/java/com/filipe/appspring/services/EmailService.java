package com.filipe.appspring.services;

import org.springframework.mail.SimpleMailMessage;

import com.filipe.appspring.domain.Cliente;
import com.filipe.appspring.domain.Pedido;

public interface EmailService {

	public void sendOrderConfirmation(Pedido obj);
	
	public void sendEmail(SimpleMailMessage msg);

	public void sendNewPasswordEmail(Cliente cliente, String newPass);
}
