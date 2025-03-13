package ma.project.demo.entites;
import jakarta.persistence.*;

@Entity
@Table(name = "arch_1004901")
public class GpsCoordinate {

    @EmbeddedId
    private GpsCoordinateId id;

    @Column(name = "speed", nullable = false)
    private int speed;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    // Getters and Setters
    public GpsCoordinateId getId() {
        return id;
    }

    public void setId(GpsCoordinateId id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}