package ma.project.demo.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
public class GpsCoordinateId implements Serializable {

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "id_device", nullable = false)
    private int idDevice;

    // Getters and Setters
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GpsCoordinateId that = (GpsCoordinateId) o;
        return idDevice == that.idDevice && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, idDevice);
    }
}