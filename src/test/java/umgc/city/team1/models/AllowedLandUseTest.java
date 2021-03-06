package umgc.city.team1.models;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@Data
class AllowedLandUseTest {

    @Test
    public void testAllowedLandUseSetAndGetId() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        UUID uuid = UUID.randomUUID();
        try {
            allowedLandUse.setId(uuid);
            assertEquals(allowedLandUse.getId(), uuid);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }

    @Test
    public void testAllowedLandUseSetAndGetZoneId() {
        UUID zoneId = UUID.randomUUID();
        Zone zone = new Zone();
        zone.setId(zoneId);
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        allowedLandUse.setZone(zone);
        try {
            assertEquals(allowedLandUse.getZone().getId(), zoneId);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }

    @Test
    public void testAllowedLandUseSetAndGetApplicationUrl() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        String URL = "https://domain.anywhere/url";
        try {
            allowedLandUse.setApplicationUrl(URL);
            assertEquals(allowedLandUse.getApplicationUrl(), URL);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }

    @Test
    public void testAllowedLandUseSetAndGetPermitDescription() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        String permitDescription = "permitDescription";
        try {
            allowedLandUse.setPermitDescription(permitDescription);
            assertEquals(allowedLandUse.getPermitDescription(), permitDescription);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }

    @Test
    public void testAllowedLandUseSetAndGetPermitName() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        String permitName = "permitName";
        try {
            allowedLandUse.setPermitName(permitName);
            assertEquals(allowedLandUse.getPermitName(), permitName);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }
    @Test
    public void testAllowedLandUseSetAndGetZone() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        Zone zone = new Zone();
        try {
            allowedLandUse.setZone(zone);
            assertEquals(allowedLandUse.getZone(), zone);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }
    @Test
    public void testAllowedLandUseSetAndGetZoneLandUse() {
        AllowedLandUse allowedLandUse = new AllowedLandUse();
        ZoneLandUse zoneLandUse = new ZoneLandUse();
        try {
            allowedLandUse.setZoneLandUse(zoneLandUse);
            assertEquals(allowedLandUse.getZoneLandUse(), zoneLandUse);
        } catch (Exception e2) {
            fail("Threw exception when not expected one");
        }
    }
}
