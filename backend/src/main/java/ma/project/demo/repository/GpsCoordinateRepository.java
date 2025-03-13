package ma.project.demo.repository;



import ma.project.demo.entites.GpsCoordinate;
import ma.project.demo.entites.GpsCoordinateId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GpsCoordinateRepository extends JpaRepository<GpsCoordinate, GpsCoordinateId> {
    List<GpsCoordinate> findAllByOrderByIdDateAsc();
}