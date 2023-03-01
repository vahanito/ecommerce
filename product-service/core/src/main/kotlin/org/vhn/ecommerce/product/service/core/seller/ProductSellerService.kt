package org.vhn.ecommerce.product.service.core.seller

import jakarta.annotation.PostConstruct
import org.springframework.expression.Expression
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import java.util.*

@Service
class ProductSellerService(val productSellerRepository: ProductSellerRepository) {

    @PostConstruct
    fun initSeller() = productSellerRepository.save(ProductSeller(UUID.randomUUID(), OffsetDateTime.now(), "abc"))

    fun getSellers() = productSellerRepository.findAll();

    fun getSellers(name: String) = productSellerRepository.findAll { root, query, criteriaBuilder ->
        criteriaBuilder.equal(root.get<Expression>("name"), name)
    }
}