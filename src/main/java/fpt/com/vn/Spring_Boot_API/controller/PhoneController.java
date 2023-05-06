/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.controller;

import fpt.com.vn.Spring_Boot_API.entity.PhoneEntity;
import fpt.com.vn.Spring_Boot_API.model.Phone;
import fpt.com.vn.Spring_Boot_API.service.PhoneService;
import fpt.com.vn.Spring_Boot_API.utils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/phones")
    public ResponseEntity<List<Phone>> getPhones() {
        List<PhoneEntity> phoneEntities = phoneService.getPhones();
        if (phoneEntities != null && phoneEntities.size() > 0) {
            List<Phone> phones = new ArrayList<>();
            for (PhoneEntity phoneEntity : phoneEntities) {
                phones.add(ConvertUtils.convertPhoneFromPhoneEntity(phoneEntity));
            }
            return new ResponseEntity<List<Phone>>(phones, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
