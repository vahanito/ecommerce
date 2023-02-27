package org.vhn.ecommerce.product.service.core

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import java.util.*

@Service
class ProductService(val productRepository: ProductRepository) : ApplicationListener<ContextRefreshedEvent> {

    fun saveProduct(product: Product) {
        productRepository.save(product)
    }

    override fun onApplicationEvent(event: ContextRefreshedEvent) {
        saveProduct(Product(UUID.randomUUID(), OffsetDateTime.now(), "test product", "awesome product"))
    }

    fun getProducts(): MutableIterable<Product> {
        return productRepository.findAll()
    }

}

