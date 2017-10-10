package sk.stopangin.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidator implements ConstraintValidator<MyValidation, String> {
   private String val;

    @Override
    public void initialize(MyValidation myValidation) {
        val = myValidation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        if (s.equals(val)) {
            return true;
        }
        cvc.buildConstraintViolationWithTemplate("${validatedValue} is not {value}")
                .addConstraintViolation().disableDefaultConstraintViolation();
        return false;
    }
}
