package com.nisum.hackaton.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String id;
    private Date created;
    private Date modified;
    private Date last_login;
    private String token;
    private Boolean isactive;
}
