package local.tennisreservation.tennis.surface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@Service
public class SurfaceTypeService {
    private final SurfaceRepository surfaceRepository;

    @Autowired
    public SurfaceTypeService(SurfaceRepository surfaceRepository) {
        this.surfaceRepository = surfaceRepository;
    }
    public List<SurfaceType> getSurfaces() {
        return surfaceRepository.findAll();
    }
}
