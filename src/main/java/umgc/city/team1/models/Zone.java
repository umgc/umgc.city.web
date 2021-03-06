package umgc.city.team1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@Data
@Entity
@Table(name = "zone")
public class Zone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "uuid")
    private UUID id;

    @Column(name = "zone_symbol")
    @NotNull
    private String zoneSymbol;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "city_id",  referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;

    public Zone(String zoneSymbol, String description, City city){
        this.zoneSymbol = zoneSymbol;
        this.description = description;
        this.city = city;
    }

    public Zone(String zoneSymbol, String description){
        this.zoneSymbol = zoneSymbol;
        this.description = description;
    }

}
