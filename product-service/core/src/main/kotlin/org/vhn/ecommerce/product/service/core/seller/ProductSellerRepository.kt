package org.vhn.ecommerce.product.service.core.seller

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository

interface ProductSellerRepository : CrudRepository<ProductSeller, Int>, JpaSpecificationExecutor<ProductSeller>