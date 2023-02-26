package org.vhn.ecommerce.product.service.core

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.Instant
import java.util.UUID

@Entity
data class Product(
    @Id
    val id: UUID,
    val created: Instant,
    val name: String,
    val description: String,
)
