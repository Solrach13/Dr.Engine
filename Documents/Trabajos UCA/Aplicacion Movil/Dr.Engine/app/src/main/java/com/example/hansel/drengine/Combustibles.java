package com.example.hansel.drengine;

/**
 * Created by Hansel on 29/11/2016.
 */

class Combustibles {

    String diesel;
    String gsuper;
    String regular;

    public Combustibles() {
    }

    public Combustibles(String diesel, String gsuper, String regular) {
        this.diesel = diesel;
        this.gsuper = gsuper;
        this.regular = regular;
    }

    public String getDiesel() {
        return diesel;
    }

    public String getGsuper() {
        return gsuper;
    }

    public String getRegular() {
        return regular;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }

    public void setGsuper(String gsuper) {
        this.gsuper = gsuper;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
