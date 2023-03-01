package org.vhn.ecommerce.product.service.inbound

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import org.vhn.ecommerce.product.service.core.seller.ProductSellerService

@Controller
class ProductSellerController(val productSellerService: ProductSellerService) {

    @QueryMapping
    fun sellers(@Argument name: String) = productSellerService.getSellers(name)
}