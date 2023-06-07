package local.tennisreservation.tennis.surface;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@Configuration
public class SurfaceConfig {
    @Bean
    CommandLineRunner commandLineRunner(SurfaceRepository repository) {
        return args -> {
            SurfaceType grass = new SurfaceType("Grass", 1F);
            SurfaceType clay = new SurfaceType("Clay", 1.2F);
            SurfaceType hard = new SurfaceType("Hard", 1.5F);
            SurfaceType carpet = new SurfaceType("Carpet", 1.8F);

            repository.saveAll(
                    List.of(grass, clay, hard, carpet)
            );
        };
    }
}
