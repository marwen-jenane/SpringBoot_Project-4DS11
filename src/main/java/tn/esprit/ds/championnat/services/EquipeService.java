package tn.esprit.ds.championnat.services;

import tn.esprit.ds.championnat.entities.Equipe;
import tn.esprit.ds.championnat.repository.EquipeRepository;

public class EquipeService implements IEquipeService {
    private EquipeRepository equipeRepository;

    @Override
    public Equipe ajouterEquipe(Equipe p){
        return equipeRepository.save(p);
    }
}
