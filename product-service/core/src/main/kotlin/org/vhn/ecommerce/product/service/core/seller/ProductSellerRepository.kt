package org.vhn.ecommerce.product.service.core.seller

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ProductSellerRepository : CrudRepository<ProductSeller, UUID>, JpaSpecificationExecutor<ProductSeller>