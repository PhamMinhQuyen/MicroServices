/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Số điện thoại
 */
@Getter
@Setter
@Entity
@Table(name = "phone")
public class PhoneEntity implements Serializable {
    /**
     * id số điện thoaại
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * Số điện thoại
     */
    @Column(name = "phone")
    private String phone;
}
