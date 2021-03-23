package com.company;
import com.company.entity.EnginesType;
import com.company.entity.TramvDvigatel;
import com.company.entity.Tramvay;

public class Main {

    public static void main(String[] args) {
        TramvDvigatel dvigatTramv=new TramvDvigatel("vfgh",15,10, EnginesType.ELECTRIC);
        Tramvay tram22 = new Tramvay("Трамвай","раритет", dvigatTramv,60,22);
        tram22.move();
    }
}
