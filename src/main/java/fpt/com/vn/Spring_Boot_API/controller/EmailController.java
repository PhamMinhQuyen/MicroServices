/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.controller;

import fpt.com.vn.Spring_Boot_API.entity.EmailEntity;
import fpt.com.vn.Spring_Boot_API.model.Email;
import fpt.com.vn.Spring_Boot_API.service.EmailService;
import fpt.com.vn.Spring_Boot_API.utils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Gmail controller
 */
@RequestMapping("/api")
@RestController
public class EmailController {

    /**
     * Gmail service
     */
    @Autowired
    private EmailService gmailService;

    @GetMapping("/gmails")
    public ResponseEntity<List<Email>> getGmails() {
        List<EmailEntity> gmailEntities = gmailService.getGmails();
        if (gmailEntities != null && gmailEntities.size() > 0) {
            List<Email> gmails = new ArrayList<>();
            for (EmailEntity gmailEntity : gmailEntities) {
                gmails.add(ConvertUtils.convertGmailFromGmailEntity(gmailEntity));
            }
            return new ResponseEntity<List<Email>>(gmails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     *
     * @param gmail
     * @return
     */
    @PostMapping("/send_email")
    public ResponseEntity<?> sendEmail(@RequestBody Email gmail) {
        System.out.println("+++++++" + gmail.getTo());
        boolean result = this.gmailService.sendEmail(gmail.getSubject(),
                gmail.getMessage(), gmail.getTo());
        System.out.println("result: " + result);
        if (result) {
            return  ResponseEntity.ok("Email send successfully.");
        }else{
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("Email send fail.");
        }
    }
}
