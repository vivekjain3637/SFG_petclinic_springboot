package com.springlearning.sfgpetclinic.services;

import com.springlearning.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
