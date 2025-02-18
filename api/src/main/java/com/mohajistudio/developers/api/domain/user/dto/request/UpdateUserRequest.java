package com.mohajistudio.developers.api.domain.user.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class UpdateUserRequest {
    private UUID profileImageId;

    @NotNull
    @Pattern(regexp = "^(?![0-9]+$)[a-zA-Z0-9_](?:[a-zA-Z0-9_]*(?:\\.[a-zA-Z0-9_]+)?){1,19}$")
    private String nickname;
    private String jobRole;
    private String bio;
    private List<UpdateContactRequest> contacts;
}
