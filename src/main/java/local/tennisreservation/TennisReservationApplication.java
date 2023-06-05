package local.tennisreservation;

import local.tennisreservation.tennis.SurfaceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TennisReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TennisReservationApplication.class, args);
    }

    @GetMapping("/")
    public List<SurfaceType> hello() {
        return List.of(
                new SurfaceType("Grass", 1F),
                new SurfaceType("Clay", 1.2F),
                new SurfaceType("Hard", 1.5F),
                new SurfaceType("Carpet", 1.8F)
        );
    }
}
