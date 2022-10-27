package com.example.demojms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashMap;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demojms.vo.Email;

@Component
public class MessageListenerComponent implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {    	
        RestTemplate restTemplate = new RestTemplate();
        
        String resourceUrl = "http://localhost:8080/api/v1/email/enviar";        
    	
		try {
			Path path = Paths.get("C:\\tmp\\arquivos\\comprovante.pdf");
			
			byte[] btyArquivo =  Files.readAllBytes(path);
			
			String strArquivo  = Base64.getEncoder().encodeToString(btyArquivo);
			HashMap<String, String> anexos = new HashMap<>();
			anexos.put(path.toFile().getName(), strArquivo );
			
			Email email = new Email();
			email.setTo("marcelo.rebeque@gmail.com");
			email.setTo("mrepereira@fazenda.rj.gov.br");
			email.setSubject("Teste");
			email.setCorpo("Teste 01");
			email.setCopia(""); 
			email.setTipoEmail("HTML");
			email.setArquivos(anexos);
			
			
	        HttpEntity<Email> request = new HttpEntity<Email>(email);
	        
	        ResponseEntity<String> productCreateResponse = restTemplate.postForEntity(resourceUrl, request, String.class);
	        
	        System.out.println("Status :"+productCreateResponse);
	   		System.out.println("Anexo :"+path.toFile().getName());

	   		
	   		
		} catch (IOException e) {
			e.printStackTrace();
		}    	
    }   
}
