package com.example.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("student") // Acessível como #{student} nas páginas XHTML
@SessionScoped    // Mantém os dados durante a sessão do usuário
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;

    // Construtor padrão é necessário
    public Student() {}

    // Getters e Setters são essenciais para o JSF
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
}