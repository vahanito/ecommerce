package org.vhn.ecommerce.product.service.core.product

import org.springframework.data.repository.CrudRepository
import java.util.*

interface ProductRepository : CrudRepository<Product, UUID> {
}