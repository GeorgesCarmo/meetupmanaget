package br.com.georges.meetupmanager;

import org.springframework.boot.SpringApplication;

public class TestMeetupmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(MeetupmanagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
