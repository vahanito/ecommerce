package org.vhn.ecommerce.product.service.inbound

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import org.vhn.ecommerce.product.service.core.Product
import org.vhn.ecommerce.product.service.core.ProductService

@Controller
class ProductGraphQLController(val productService: ProductService) {

    @QueryMapping
    fun products(): MutableIterable<Product> {
        return productService.getProducts()
    }
}