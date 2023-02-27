package org.vhn.ecommerce.product.service.inbound

import graphql.scalars.ExtendedScalars
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.execution.RuntimeWiringConfigurer


@Configuration
@ComponentScan
class InboundConfig {

    @Bean
    fun runtimeWiringConfigurer(): RuntimeWiringConfigurer? {
        return RuntimeWiringConfigurer { wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.DateTime) }
    }
}