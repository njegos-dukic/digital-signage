package org.unibl.etf.ds.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDto {

    @NotNull
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String email;
}
