package com.codezmr.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.codezmr.event.AccountEvent;

public class AccountEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		
		this.publisher = publisher;
	}
	
	public void publish(String message) {
		AccountEvent accountEvent = new AccountEvent(this, message);
		publisher.publishEvent(accountEvent);
	}

}
