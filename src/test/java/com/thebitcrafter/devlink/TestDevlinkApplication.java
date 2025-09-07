package com.thebitcrafter.devlink;

import org.springframework.boot.SpringApplication;

public class TestDevlinkApplication {

	public static void main(String[] args) {
		SpringApplication.from(DevlinkApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
