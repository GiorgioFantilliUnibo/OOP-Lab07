/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /**
     * Basketball.
     */
    BASKET(5, "Basketball", Place.INDOOR),

    /**
     * Football.
     */
    SOCCER(11, "Football", Place.OUTDOOR),

    /**
     * Tennis.
     */
    TENNIS(1, "Tennis", Place.OUTDOOR),

    /**
     * Cycling.
     */
    BIKE(1, "Cycling", Place.OUTDOOR),

    /**
     * Formula One.
     */
    F1(1, "Formula One", Place.OUTDOOR),

    /**
     * Moto GP.
     */
    MOTOGP(1, "Moto GP", Place.OUTDOOR),

    /**
     * Volleyball.
     */
    VOLLEY(6, "Volleyball", Place.INDOOR);

    
    private final int nTeamMember;
    private final String name;
    private final Place activityPlace;

    private Sport(final int nTeamMember, final String name, final Place activityPlace) {
        this.nTeamMember = nTeamMember;
        this.name = name;
        this.activityPlace = activityPlace;
    }

    /**
     * @return true only if called on individual sports.
     */
    public boolean isIndividualSport() {
        return this.nTeamMember == 1;
    }
    
    /**
     * @return true in case the sport is practices indoor.
     */
    public boolean isIndoorSport() {
        return this.activityPlace.equals(Place.INDOOR);
    }
    
    /**
     * @return the place where this sport is practiced
     */
    public Place getPlace() {
        return this.activityPlace;
    }
    
    /**
     * @return the string representation of a sport.
     */
    @Override
    public String toString() {
        return "Sport [Name: "+ this.name + ", Team members: "
                + this.nTeamMember +", Activity place: "+ this.activityPlace +"]";
    }
}
