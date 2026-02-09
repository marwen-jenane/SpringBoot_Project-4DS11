package tn.esprit.ds.championnat.services;

import tn.esprit.ds.championnat.entities.Pilote;
import tn.esprit.ds.championnat.repository.PiloteRepository;

public class PiloteService implements IPiloteService{
    private PiloteRepository piloteRepository;

    @Override
    public String addPilote(Pilote p){
        piloteRepository.save(p);
        return "Pilote ajouté avec succès";
    }

}
