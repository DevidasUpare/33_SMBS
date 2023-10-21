package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.tcs.constants.AppConstants;

@SpringBootApplication
public class ApplicationConsum {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsum.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC, groupId = "group_ashokit_order")
	public void subscribeMsg(String order)
	{
		System.out.println("*** Msg Recieved From Kafka *** :: ");
		System.out.println(order);
		
		//logic
	}

}
