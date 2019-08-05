package com.company.CalculatorBMI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Integer id;

        private String name;

        private  String surrname;

        private double weight;

        private double hight;

        private String result;

        private String gender;

        private double bmi;

        public void setBmi(double bmi) {
                this.bmi = bmi;
        }

        @Override
        public String toString(){
            return getName()+" "+getSurrname()+" "+getHight()+" "+getWeight()+" "+getWeight()+" "+getResult();
        }



    }

