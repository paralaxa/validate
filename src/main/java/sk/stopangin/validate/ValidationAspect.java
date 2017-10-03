package sk.stopangin.validate;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashSet;
import java.util.Set;


public class ValidationAspect implements MethodInterceptor {
    private Validator validator;
    private Logger log = LoggerFactory.getLogger(ValidationAspect.class);

    public ValidationAspect() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        log.debug("invocation of {}", methodInvocation.getMethod().getName());
        Set<ConstraintViolation<Object>> validationResult = new HashSet<>();
        Object[] arguments = methodInvocation.getArguments();
        for (Object argument : arguments) {
            validationResult = validator.validate(argument);
        }
        log.debug(validationResult.toString());
        return methodInvocation.proceed();
    }
}
