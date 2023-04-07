package org.vhn.ecommerce.product.service.core.pricing

import org.springframework.stereotype.Service
import org.vhn.ecommerce.product.service.core.product.Product

@Service
class ProductPricingService(val productPricingRepository: ProductPricingRepository) {

//    fun saveProduct(productPricing: ProductPricing) {
//        productPricingRepository.save(productPricing)
//    }
//
//    override fun onApplicationEvent(event: ContextRefreshedEvent) {
//        saveProduct(ProductPricing(UUID.randomUUID(), OffsetDateTime.now(), "test product", "awesome product"))
//    }

    fun getProductPricingList(product: Product) = productPricingRepository.findAllByProductId(product.id);

}

