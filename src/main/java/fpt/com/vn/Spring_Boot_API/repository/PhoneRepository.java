/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.repository;

import fpt.com.vn.Spring_Boot_API.entity.PhoneEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Số điện thoại Repository
 */
@Repository
public interface PhoneRepository extends CrudRepository<PhoneEntity, Integer> {

}
