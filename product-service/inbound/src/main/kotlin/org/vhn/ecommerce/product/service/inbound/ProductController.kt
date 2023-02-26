package org.vhn.ecommerce.product.service.inbound

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.vhn.ecommerce.product.service.core.Product
import org.vhn.ecommerce.product.service.core.ProductService

@RestController
@RequestMapping("/products")
class ProductController(val productService: ProductService) {

    @GetMapping
    fun getProducts(): MutableIterable<Product> {
        return productService.getProducts()
    }
}