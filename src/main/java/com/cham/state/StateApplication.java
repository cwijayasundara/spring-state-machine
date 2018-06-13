package com.cham.state;

import com.cham.state.model.Events;
import com.cham.state.model.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class StateApplication implements CommandLineRunner {

	@Autowired
	private StateMachine<States, Events> stateMachine;

	public static void main(String[] args) {
		SpringApplication.run(StateApplication.class, args);
	}

	public void run(String... args) throws Exception{
		stateMachine.sendEvent(Events.TRADE_PLACED);
		stateMachine.sendEvent(Events.TRADE_COMPLETED);
	}
}
