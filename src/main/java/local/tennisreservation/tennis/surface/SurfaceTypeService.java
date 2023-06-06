package local.tennisreservation.tennis.surface;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@Service
public class SurfaceTypeService {
    public List<SurfaceType> getSurfaces() {
        return List.of(
                new SurfaceType("Grass", 1F),
                new SurfaceType("Clay", 1.2F),
                new SurfaceType("Hard", 1.5F),
                new SurfaceType("Carpet", 1.8F)
        );
    }
}
