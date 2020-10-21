package com.vscodeissue.second;

import com.vscodeissue.first.MySharedEnum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondApplication {

	private MySharedEnum vsCode = MySharedEnum.VSCODE;
	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);

	}

}
