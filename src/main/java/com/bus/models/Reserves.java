package com.bus.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Reserves {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Long dateId;
    private String passport;

    public Reserves(String description, Long dateId, String passport) {
        this.description = description;
        this.dateId = dateId;
        this.passport = passport;
    }
}
