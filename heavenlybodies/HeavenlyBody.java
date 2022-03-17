package heavenlybodies;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private BodyTypes bodyTypes;

    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyTypes = bodyTypes;
        this.key = new Key(name, bodyTypes);
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if ( obj instanceof HeavenlyBody ) {
            return this.key.equals(((HeavenlyBody) obj).getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name,bodyType);
    }

    @Override
    public String toString() {
        return name+": "+ bodyTypes +", "+orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return (this.name.hashCode() + this.bodyType.hashCode() + 22);
        }

        @Override
        public boolean equals(Object obj) {
            Key key =(Key) obj;
            return ((this.bodyType.equals(key.bodyType)) && (this.name.equals(key.name)));
        }

        @Override
        public String toString() {
            return (name+": "+bodyType);
        }
    }

}
