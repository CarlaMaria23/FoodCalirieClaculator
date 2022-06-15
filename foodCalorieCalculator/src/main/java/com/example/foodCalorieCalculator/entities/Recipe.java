package com.example.foodCalorieCalculator.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Recipe")
@SequenceGenerator(name = "DEFAULT_ID_SEQ_GEN", sequenceName = "SEQ_RECIPE_ID")
public class Recipe extends BaseEntity{
    private String name;

    private BigDecimal lipid;
}
