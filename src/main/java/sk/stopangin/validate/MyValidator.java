package sk.stopangin.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidator implements ConstraintValidator<MyValidation, String> {
    @Override
    public void initialize(MyValidation myValidation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        if (s.equals("a")) {
            return true;
        }
        cvc.buildConstraintViolationWithTemplate("${validatedValue} is not {value}")
                .addConstraintViolation().disableDefaultConstraintViolation();
        return false;
    }
}
