package com.example.demojms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListenerComponent implements ApplicationRunner {

    private JmsTemplate jmsTemplate;
    private JmsTemplate jmsTemplateTopic;

    @Autowired
    public MessageListenerComponent(JmsTemplate jmsTemplate, JmsTemplate jmsTemplateTopic) {
        this.jmsTemplate = jmsTemplate;
        this.jmsTemplateTopic = jmsTemplateTopic;
    }
    
    @JmsListener(destination = "emailCorp.email")
    public void onReceiverQueue(String str) {
        System.out.println( str );
    }
	
//    @JmsListener(destination = "topic.sample", containerFactory = "jmsFactoryTopic")
//    public void onReceiverTopic(String str) {
//        System.out.println( str );
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	String email;
    	
    	
    	
    	for (int i = 0; i < 10; i++) {
    		email = "{user: 'Rebeque " +  i + "' , usando: 'fila'}";
            jmsTemplate.convertAndSend("emailCorp.email", email);
			
		}
        //jmsTemplate.convertAndSend("emailCorp.email", "{user: 'Rebeque02', usando: 'fila'}");
        // jmsTemplateTopic.convertAndSend("topic.sample", "{user: 'wolmir', usando: 'tópico'}");
        System.out.println("Eu vou testar!!");
    }

}
