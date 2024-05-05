package com.example.carrental.model.dto;

import com.example.carrental.domain.Role;
import com.example.carrental.domain.RoleEnum;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Role}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public final class RoleDto implements Serializable {
    private Long id;
    private RoleEnum name;
}