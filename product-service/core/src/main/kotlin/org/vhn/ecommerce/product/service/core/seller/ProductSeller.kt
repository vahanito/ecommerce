package org.vhn.ecommerce.product.service.core.seller

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.OffsetDateTime
import java.util.*

@Entity
data class ProductSeller(
    @Id
    val id: UUID,
    val created: OffsetDateTime,
    val name: String
)
