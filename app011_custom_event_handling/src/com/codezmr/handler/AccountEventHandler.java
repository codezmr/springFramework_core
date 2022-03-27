package com.codezmr.handler;

import org.springframework.context.ApplicationListener;

import com.codezmr.event.AccountEvent;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent accountEvent) {
		
		accountEvent.genrateLog();

	}

}
