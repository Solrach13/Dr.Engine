package com.example.hansel.drengine;

/**
 * Created by Hansel on 29/11/2016.
 */

class Combustibles {

    String diesel = "21,33";
    String Gsuper = "24,12";
    String regular = "23,79";

    public Combustibles() {
    }

    public Combustibles(String diesel, String gsuper, String regular) {
        this.diesel = diesel;
        Gsuper = gsuper;
        this.regular = regular;
    }

    public String getDiesel() {
        return diesel;
    }

    public String getGsuper() {
        return Gsuper;
    }

    public String getRegular() {
        return regular;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }

    public void setGsuper(String gsuper) {
        Gsuper = gsuper;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
