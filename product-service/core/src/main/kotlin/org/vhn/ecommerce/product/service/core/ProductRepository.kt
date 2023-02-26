package org.vhn.ecommerce.product.service.core

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ProductRepository : CrudRepository<Product, UUID> {
}