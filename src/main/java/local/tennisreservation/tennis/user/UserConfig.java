package local.tennisreservation.tennis.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User user1 = new User("Adam", "11111");
            User user2 = new User("Bob", "22222");
            User user3 = new User("Cyril", "33333");
            User user4 = new User("David", "44444");

            repository.saveAll(
                    List.of(user1, user2, user3, user4)
            );
        };
    }
}
