package com.company;

import java.security.PublicKey;

public class Bnakszamla {
    private double egyenleg;
    private String bankszamlaszam;

    public Bnakszamla(double egyenleg, String bankszamlaszam)
    {
        this.egyenleg=egyenleg;
        this.bankszamlaszam=bankszamlaszam;
    }
    public Bnakszamla(double egyenleg)
    {
        this.egyenleg=egyenleg;
    }
    public double Bnakszamla(double egyenleg)
    {
        return this.egyenleg;
    }
    public double getEgyenleg()
    {
        return this.egyenleg;
    }
    public String toString()
    {
        return "Bankszamla: "+this.bankszamlaszam+" az egyenelg "+this.egyenleg;
    }

}
