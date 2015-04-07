package stuba.bpbpdatabasemapper;
// Generated Apr 7, 2015 10:21:49 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * GtfsTrips generated by hbm2java
 */
public class GtfsTrips  implements java.io.Serializable {


     private GtfsTripsId id;
     private GtfsRoutes gtfsRoutes;
     private String serviceIdAgencyId;
     private String serviceIdId;
     private String tripHeadsign;
     private String directionId;
     private Set stopRealTimesHistories = new HashSet(0);
     private Set gtfsStopTimeses = new HashSet(0);
     private Set tripPositionses = new HashSet(0);

    public GtfsTrips() {
    }

	
    public GtfsTrips(GtfsTripsId id) {
        this.id = id;
    }
    public GtfsTrips(GtfsTripsId id, GtfsRoutes gtfsRoutes, String serviceIdAgencyId, String serviceIdId, String tripHeadsign, String directionId, Set stopRealTimesHistories, Set gtfsStopTimeses, Set tripPositionses) {
       this.id = id;
       this.gtfsRoutes = gtfsRoutes;
       this.serviceIdAgencyId = serviceIdAgencyId;
       this.serviceIdId = serviceIdId;
       this.tripHeadsign = tripHeadsign;
       this.directionId = directionId;
       this.stopRealTimesHistories = stopRealTimesHistories;
       this.gtfsStopTimeses = gtfsStopTimeses;
       this.tripPositionses = tripPositionses;
    }
   
    public GtfsTripsId getId() {
        return this.id;
    }
    
    public void setId(GtfsTripsId id) {
        this.id = id;
    }
    public GtfsRoutes getGtfsRoutes() {
        return this.gtfsRoutes;
    }
    
    public void setGtfsRoutes(GtfsRoutes gtfsRoutes) {
        this.gtfsRoutes = gtfsRoutes;
    }
    public String getServiceIdAgencyId() {
        return this.serviceIdAgencyId;
    }
    
    public void setServiceIdAgencyId(String serviceIdAgencyId) {
        this.serviceIdAgencyId = serviceIdAgencyId;
    }
    public String getServiceIdId() {
        return this.serviceIdId;
    }
    
    public void setServiceIdId(String serviceIdId) {
        this.serviceIdId = serviceIdId;
    }
    public String getTripHeadsign() {
        return this.tripHeadsign;
    }
    
    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }
    public String getDirectionId() {
        return this.directionId;
    }
    
    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }
    public Set getStopRealTimesHistories() {
        return this.stopRealTimesHistories;
    }
    
    public void setStopRealTimesHistories(Set stopRealTimesHistories) {
        this.stopRealTimesHistories = stopRealTimesHistories;
    }
    public Set getGtfsStopTimeses() {
        return this.gtfsStopTimeses;
    }
    
    public void setGtfsStopTimeses(Set gtfsStopTimeses) {
        this.gtfsStopTimeses = gtfsStopTimeses;
    }
    public Set getTripPositionses() {
        return this.tripPositionses;
    }
    
    public void setTripPositionses(Set tripPositionses) {
        this.tripPositionses = tripPositionses;
    }




}


