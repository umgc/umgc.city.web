package umgc.city.team1.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "city")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "uuid")
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="state")
    private String state;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_user_id", nullable = false)
    private CityUser cityUser;

    public City(String name, String state, CityUser cityUser){
        this.name = name;
        this.state = state;
        this.cityUser = cityUser;
    }

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private Set<ZoneLandUse> zoneLanduses;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private Set<Zone> zones;

}
