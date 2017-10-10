package sk.stopangin.validate;

import lombok.Builder;
import lombok.Data;

/**
 * Created by stopangin on 10/3/2017.
 */
@Builder
@Data
public class Dummy {
    @MyValidation("a")
    private String d1;

    @MyValidation("b")
    private String d2;
}
