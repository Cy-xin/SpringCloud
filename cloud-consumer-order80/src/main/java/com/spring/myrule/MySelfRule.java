package com.spring.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xintianweng
 */
@Configuration
public class MySelfRule  {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }


}
