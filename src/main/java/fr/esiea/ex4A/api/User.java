package fr.esiea.ex4A.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    public final String email;
    public final String name;
    public final String twitter;
    public final String pays;
    public final String sex;
    public final String sexPref;

    public User(@JsonProperty("userEmail") String email, @JsonProperty("userName") String prenom,
                @JsonProperty("userTweeter") String twitter, @JsonProperty("userCountry") String pays,
                @JsonProperty("userSex") String sex, @JsonProperty("userSexPref") String userSexPref) {
        this.email = email;
        this.name = prenom;
        this.twitter = twitter;
        this.pays = pays;
        this.sex = sex;
        this.sexPref = userSexPref;
    }

    @Override
    public String toString() {
        return "email='" + email + ", name='" + name + ", twitter='" + twitter + ", pays='" + pays + ", sex='" + sex + ", sexPref='" + sexPref;
    }
}
