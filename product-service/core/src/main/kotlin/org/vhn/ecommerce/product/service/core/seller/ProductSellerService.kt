package org.vhn.ecommerce.product.service.core.seller

import jakarta.persistence.criteria.Predicate
import org.springframework.expression.Expression
import org.springframework.stereotype.Service

@Service
class ProductSellerService(val productSellerRepository: ProductSellerRepository) {

//    @PostConstruct
//    fun initSeller() = productSellerRepository.save(ProductSeller(9, OffsetDateTime.now(), "abc"))

    fun getSellers(): MutableIterable<ProductSeller> = productSellerRepository.findAll();

    fun getSellers(name: String?): MutableList<ProductSeller> =
        productSellerRepository.findAll { root, _, criteriaBuilder ->
            val predicates = ArrayList<Predicate>()
            if (name != null) {
                predicates.add(criteriaBuilder.equal(root.get<Expression>("name"), name))
            }
            criteriaBuilder.and(*predicates.toTypedArray())
        }

    fun getSeller(sellerId: Int) = productSellerRepository.findById(sellerId).orElseThrow()
}