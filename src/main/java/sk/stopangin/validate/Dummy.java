package sk.stopangin.validate;

import lombok.Builder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by stopangin on 10/3/2017.
 */
@Builder
public class Dummy {
    @NotNull
    private String d1;

    @Size(min = 2)
    private String d2;
}
