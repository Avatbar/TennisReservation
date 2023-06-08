package local.tennisreservation.tennis;

import local.tennisreservation.tennis.court.Court;
import local.tennisreservation.tennis.court.CourtRepository;
import local.tennisreservation.tennis.surface.SurfaceRepository;
import local.tennisreservation.tennis.surface.SurfaceType;
import local.tennisreservation.tennis.user.User;
import local.tennisreservation.tennis.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Random;

/**
 * @author Tadeas Machacek
 */
@Configuration
public class DatabaseConfig {
    @Bean
    CommandLineRunner commandLineRunner(SurfaceRepository surfaceRepository, CourtRepository courtRepository, UserRepository userRepository) {
        return args -> {
            surfaceRepository.saveAll(createSurfaces());
//            courtRepository.save(new Court("Court 1", surfaceRepository.findById(1L).get()));
            courtRepository.saveAll(createCourts(surfaceRepository));
            userRepository.saveAll(createUsers());
        };
    }

    private List<SurfaceType> createSurfaces() {
        SurfaceType grass = new SurfaceType("Grass", 1F);
        SurfaceType clay = new SurfaceType("Clay", 1.2F);
        SurfaceType hard = new SurfaceType("Hard", 1.5F);
        SurfaceType carpet = new SurfaceType("Carpet", 1.8F);

        return List.of(grass, clay, hard, carpet);
    }

    private List<Court> createCourts(SurfaceRepository surfaces) {
        List<Long> ids = surfaces.findAll().stream().map(SurfaceType::getId).toList();
        int available = ids.size();
        Random random = new Random();

        Court court1 = new Court("Court 1", surfaces.findById(2L).get());
        Court court2 = new Court("Court 2", surfaces.findById(1L).get());
//        Court court3 = new Court("Court 3", surfaces.findById(ids.get((int) random.nextLong(available))).get());
//        Court court4 = new Court("Court 4", surfaces.findById(ids.get((int) random.nextLong(available))).get());

        return List.of(court1, court2);
    }

    private List<User> createUsers() {
        User user1 = new User("Adam", "11111");
        User user2 = new User("Bob", "22222");
        User user3 = new User("Cyril", "33333");
        User user4 = new User("David", "44444");

        return List.of(user1, user2, user3, user4);
    }
}
