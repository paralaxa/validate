package sk.stopangin.validate;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by stopangin on 10/3/2017.
 */
@Configuration
public class AppConfiguration {
    @Bean
    public Advice myAdvice() {
        return new ValidationAspect();
    }

    @Bean
    public Advisor myAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(public * sk.stopangin.validate.*Service.*(..))");
        return new DefaultPointcutAdvisor(pointcut, myAdvice());
    }
}
