package org.vhn.ecommerce.product.service.core.product

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository) : ApplicationListener<ContextRefreshedEvent> {

    fun saveProduct(product: Product) {
        productRepository.save(product)
    }

    override fun onApplicationEvent(event: ContextRefreshedEvent) {
//        saveProduct(Product(9, OffsetDateTime.now(), "test product", "awesome product"))
    }

    fun getProducts() = productRepository.findAll();

}

