package org.vhn.ecommerce.product.service.core.pricing

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.OffsetDateTime

@Entity
data class ProductPricing(
    @Id
    val id: Int,
    val created: OffsetDateTime,
    val price: Double,
    val productId: Int,
    val sellerId: Int,
)
