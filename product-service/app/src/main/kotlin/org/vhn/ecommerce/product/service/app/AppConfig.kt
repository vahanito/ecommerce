package org.vhn.ecommerce.product.service.app

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.vhn.ecommerce.product.service.core.CoreConfig
import org.vhn.ecommerce.product.service.inbound.InboundConfig

@Configuration
@Import(value = [InboundConfig::class, CoreConfig::class])
@ComponentScan
class AppConfig