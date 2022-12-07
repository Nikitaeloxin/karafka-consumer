package telran.java2022;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}


	@KafkaListener(topics = "54vk0un9-default", groupId = "group_id")
	public void consume(String message) {
		System.out.println("message = " + message);
	}

}
