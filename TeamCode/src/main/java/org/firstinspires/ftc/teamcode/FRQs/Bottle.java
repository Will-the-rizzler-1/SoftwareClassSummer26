package org.firstinspires.ftc.teamcode.FRQs;

public class Bottle {
    private double maxAmt;
    private double amt;

    public Bottle(double maxCap) {
        amt = maxCap;
        this.maxAmt = maxCap;

    }



    public double updateAmount(double remove) {
        double remaining = amt - remove;
        amt = remaining;
        if (remaining < 0.25 * maxAmt)
            amt = maxAmt;

        return amt;
    }




}

