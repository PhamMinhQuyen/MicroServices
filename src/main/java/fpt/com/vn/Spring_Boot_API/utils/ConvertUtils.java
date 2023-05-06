package fpt.com.vn.Spring_Boot_API.utils;

import fpt.com.vn.Spring_Boot_API.entity.EmailEntity;
import fpt.com.vn.Spring_Boot_API.entity.PhoneEntity;
import fpt.com.vn.Spring_Boot_API.model.Email;
import fpt.com.vn.Spring_Boot_API.model.Phone;

public class ConvertUtils {
    public static Phone convertPhoneFromPhoneEntity(PhoneEntity phoneEntity) {
        Phone phone = new Phone();
        phone.setId(phoneEntity.getId());
        phone.setPhone(phoneEntity.getPhone());
        return phone;
    }

    public static Email convertGmailFromGmailEntity(EmailEntity emailEntity) {
        Email email = new Email();
        email.setId(emailEntity.getId());
        email.setTo(emailEntity.getEmailTo());
        email.setSubject(emailEntity.getSubject());
        email.setMessage(emailEntity.getMessage());
        return email;
    }
}
