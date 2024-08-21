package com.daniela.persona.service;

import com.daniela.persona.infrastructure.dto.AddPersonDTO;
import com.daniela.persona.infrastructure.dto.EditPersonDTO;
import com.daniela.persona.infrastructure.dto.PersonDTO;

import java.util.List;

public interface PersonService {
    PersonDTO findPerson(String document);

    PersonDTO findPerson(Long id);

    List<PersonDTO> findAllEntries();

    String savePerson(AddPersonDTO personDTO);

    String updatePerson(EditPersonDTO personDTO);

    String deletePerson(Long id);
}
