package com.example.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("tourBean")
@SessionScoped
public class TourBean implements Serializable {
    private String kindOfTour;

    public TourBean() {

    }

    public String getKindOfTour() {
        return kindOfTour;
    }

    public void setKindOfTour(String kindOfTour) {
        this.kindOfTour = kindOfTour;
    }

    public String startTheTour() {
        if (kindOfTour != null && kindOfTour.equals("city")) {
            return "city_tour";
        }
        else {
            return "country_tour";
        }
    }
}
