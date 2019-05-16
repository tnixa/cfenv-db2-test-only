package org.terrence.cfenvprocessors.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.terrence.cfenvprocessors.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}