package org.vhn.ecommerce.product.service.core.seller

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.OffsetDateTime

@Entity
data class ProductSeller(
    @Id
    val id: Int,
    val created: OffsetDateTime,
    val name: String
)
