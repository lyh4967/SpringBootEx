package org.hoon.repository;

import org.hoon.domain.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile,Long> {
	
}
