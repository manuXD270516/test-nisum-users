package io.reflectoring.buckpal.account.application.port.in.user;

import io.reflectoring.buckpal.account.domain.dtos.PhoneDto;
import io.reflectoring.buckpal.common.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Value
@EqualsAndHashCode(callSuper = false)
public class CreateUserCommand extends SelfValidating<CreateUserCommand> {

    @NotNull
    private String fullname;

    @NotNull
    @Length(max = 50)
    //@Email
    private String email;

    @NotNull
    @Length(min = 8)
    private String password;

    @NotNull
    @NotEmpty
    private List<PhoneDto> phones;

    public CreateUserCommand(String fullname, String email, String password, List<PhoneDto> phones) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.validateSelf();
    }
}
