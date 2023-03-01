package org.vhn.ecommerce.product.service.core.product

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.OffsetDateTime
import java.util.*

@Entity
data class Product(
    @Id
    val id: UUID,
    val created: OffsetDateTime,
    val name: String,
    val description: String,
)
