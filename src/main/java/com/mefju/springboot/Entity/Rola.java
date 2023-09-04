package com.mefju.springboot.Entity;

import jakarta.persistence.*;

    @Entity
    @Table(name = "authorities")
    public class Rola
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "username")
        private String ID;

        @Column(name = "authority")
        private String rola;

        public Rola() {
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getRola() {
            return rola;
        }

        public void setRola(String rola) {
            this.rola = "ROLE_" + rola.toUpperCase();
        }
    }
