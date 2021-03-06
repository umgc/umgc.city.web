package umgc.city.team1.models.incoming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapShape {
    private String codeLabel;
    private String zoneCode;
    private String overlayCode;
}
