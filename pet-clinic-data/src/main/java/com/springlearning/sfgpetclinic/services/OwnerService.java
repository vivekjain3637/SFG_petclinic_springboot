package com.springlearning.sfgpetclinic.services;

import com.springlearning.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
