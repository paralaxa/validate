package sk.stopangin.validate;

        import javax.validation.Constraint;
        import javax.validation.Payload;
        import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyValidator.class)
public @interface MyValidation {
    String message() default "default message";

    String value();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
