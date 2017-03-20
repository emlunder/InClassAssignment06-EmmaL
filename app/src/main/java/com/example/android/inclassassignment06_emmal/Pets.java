package com.example.android.inclassassignment06_emmal;

import java.io.Serializable;

/**
 * Created by default on 3/5/17.
 */

public class Pets implements Serializable
{
    private String speciesName;
    private int rankOflike;
    private boolean isPet;

    public Pets(String speciesName, int rankOflike, boolean isPet)

    {
        this.speciesName = speciesName;
        this.rankOflike = rankOflike;
        this.isPet = isPet;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }

    public int getRankOflike()
    {
        return rankOflike;
    }

    public boolean isPet()
    {
        return isPet;
    }

    @Override
    public String toString()
    {
        return "Pets" + "\n" + "Species Name: " + getSpeciesName()
                + "\nRank of like: " + getRankOflike() +
                "\nIs this a Pet Option?: " + isPet + "\n\n\n";
    }
}
