package br.com.fuelclub.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Empresa;

public class EmailJava {

	Email email;

	public EmailJava(){
		email = new SimpleEmail();
		configure();
	}

	private void configure(){
		email.setHostName("mail.fuelclub.com.br");
		email.setSmtpPort(587);
		email.setDebug(true);
		email.setAuthentication("contato@fuelclub.com.br", "@contato12");
		email.setSSLOnConnect(true);
	}
	public void enviarEmailEmpresa(Empresa empresa){
		try {
			email.setFrom("contato@fuelclub.com.br");
			email.setSubject("Recupera��o de Senha");
			email.setMsg("Ol� " + empresa.getEmpresa_nome_fantasia() + "! A sua senha para acesso ao sistema"
					+ ": " + empresa.getEmpresa_senha());
			email.addTo(empresa.getEmpresa_email());
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
	
	public void enviarEmailAdm(Administrador_Sistema administrador_Sistema){
		try {
			email.setFrom("contato@fuelclub.com.br");
			email.setSubject("Recupera��o de Senha");
			email.setMsg("Ol� " + administrador_Sistema.getAdministrador_sistema_nome() + "! A sua senha para acesso ao sistema"
					+ ": " + administrador_Sistema.getAdministrador_sistema_senha());
			email.addTo(administrador_Sistema.getAdministrador_sistema_email());
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
