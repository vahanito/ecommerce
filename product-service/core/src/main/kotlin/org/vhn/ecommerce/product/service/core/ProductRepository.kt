package org.vhn.ecommerce.product.service.core

import org.springframework.data.repository.CrudRepository
import org.springframework.graphql.data.GraphQlRepository
import java.util.*

@GraphQlRepository
interface ProductRepository : CrudRepository<Product, UUID> {
}