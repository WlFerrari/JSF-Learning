package com.example.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("studentTwo")
@SessionScoped
public class StudentTwo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String country;
    private String[] favoriteLanguages;

    List<String> countryOptions;

    public StudentTwo() {
        countryOptions = new ArrayList<String>();

        countryOptions.add("India");
        countryOptions.add("England");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("Italy");
        countryOptions.add("Japan");
        countryOptions.add("Sweden");
        countryOptions.add("Switzerland");
        countryOptions.add("Greece");
        countryOptions.add("United Kingdom");
        countryOptions.add("United States");
        countryOptions.add("Brazil");
    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(List<String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String[] getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public void setFavoriteLanguages(String[] favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
