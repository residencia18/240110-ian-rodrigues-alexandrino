package org.passwordrecovery.ap002.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PasswordTokenPublicData {

    private final String email;
    private final Long ceateAtTimestamp;

}
