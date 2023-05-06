/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.service;

import fpt.com.vn.Spring_Boot_API.entity.PhoneEntity;
import fpt.com.vn.Spring_Boot_API.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Số điện thoại service
 */
@Service
public class PhoneService {

    /**
     * Số điện thoại repostitoy
     */
    @Autowired
    private PhoneRepository phoneRepository;

    /**
     * Lấy danh sách số điện thoại
     * @return Thông tin số điện thoại
     */
    public List<PhoneEntity>  getPhones() {
        return (List<PhoneEntity>) phoneRepository.findAll();
    }
}
