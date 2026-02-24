package org.anudip.repository;

import org.anudip.bo.AuthUserBO;
import org.springframework.data.repository.CrudRepository;

public interface IAuthUserRepo extends CrudRepository<AuthUserBO, Long> {

}
