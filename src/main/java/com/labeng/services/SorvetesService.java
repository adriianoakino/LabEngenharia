package com.labeng.services;

import java.util.List;

import com.labeng.entities.Sorvetes;

public interface SorvetesService {

    void addSorvete(Sorvetes sorvete);
    void updateSorvete(Sorvetes sorvete);
    void criaSorvetes();
    List<Sorvetes> findByAll();
}
