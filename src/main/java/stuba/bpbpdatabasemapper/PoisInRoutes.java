package stuba.bpbpdatabasemapper;
// Generated Apr 7, 2015 10:21:49 PM by Hibernate Tools 3.6.0



/**
 * PoisInRoutes generated by hbm2java
 */
public class PoisInRoutes  implements java.io.Serializable {


     private Long id;
     private GtfsRoutes gtfsRoutes;
     private Poi poi;

    public PoisInRoutes() {
    }

    public PoisInRoutes(GtfsRoutes gtfsRoutes, Poi poi) {
       this.gtfsRoutes = gtfsRoutes;
       this.poi = poi;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public GtfsRoutes getGtfsRoutes() {
        return this.gtfsRoutes;
    }
    
    public void setGtfsRoutes(GtfsRoutes gtfsRoutes) {
        this.gtfsRoutes = gtfsRoutes;
    }
    public Poi getPoi() {
        return this.poi;
    }
    
    public void setPoi(Poi poi) {
        this.poi = poi;
    }




}


