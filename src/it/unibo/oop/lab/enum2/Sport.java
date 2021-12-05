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
    VOLLEY(6, "Volleyball", Place.INDOOR)

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
