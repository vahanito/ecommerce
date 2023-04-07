package org.vhn.ecommerce.product.service.core.pricing

import org.springframework.data.repository.CrudRepository
import java.util.*

interface ProductPricingRepository : CrudRepository<ProductPricing, UUID> {

    fun findAllByProductId(productId: Int): Iterable<ProductPricing>
}