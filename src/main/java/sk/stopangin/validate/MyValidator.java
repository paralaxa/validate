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
        cvc.buildConstraintViolationWithTemplate("myValidatorMessage")
                .addConstraintViolation().disableDefaultConstraintViolation();
        return false;
    }
}
