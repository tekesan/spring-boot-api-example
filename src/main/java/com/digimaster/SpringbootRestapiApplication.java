package com.digimaster;

import com.digimaster.entities.Order;
import com.digimaster.entities.User;
import com.digimaster.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(UserRepository repository) {
		return args -> createUser(repository);
	}

	void createUser(UserRepository r){

		for (int i = 1; i < 10; i++) {
			User user=new User("user"+i, "Digi"+i, "Master"+i, "something@gmail.com"+i, "USER", "SSN00"+i, "New York", new ArrayList<>());
			List<Order> orders = new ArrayList<>();
			orders.add(new Order("Order001 - "+user.getFirstname(),user));
			orders.add(new Order("Order002 - "+user.getFirstname(),user));
			orders.add(new Order("Order003 - "+user.getFirstname(),user));

			user.setOrders(orders);
			r.save(user);
		}

	}

}
