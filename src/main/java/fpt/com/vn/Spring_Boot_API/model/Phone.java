/**
 * Copyright 2023 FPT. All rights reserved.
 */

package fpt.com.vn.Spring_Boot_API.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Số điện thoại
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private int id;

    @NotNull
    private String phone;
}
