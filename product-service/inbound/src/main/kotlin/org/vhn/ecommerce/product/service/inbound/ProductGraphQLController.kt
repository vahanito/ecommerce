package org.vhn.ecommerce.product.service.inbound

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import org.vhn.ecommerce.product.service.core.pricing.ProductPricing
import org.vhn.ecommerce.product.service.core.pricing.ProductPricingService
import org.vhn.ecommerce.product.service.core.product.Product
import org.vhn.ecommerce.product.service.core.product.ProductService
import org.vhn.ecommerce.product.service.core.seller.ProductSeller
import org.vhn.ecommerce.product.service.core.seller.ProductSellerService

@Controller
class ProductGraphQLController(
    val productService: ProductService,
    val productPricingService: ProductPricingService,
    val productSellerService: ProductSellerService
) {

    @QueryMapping
    fun products(): MutableIterable<Product> {
        return productService.getProducts()
    }

    @SchemaMapping
    fun productPricingList(product: Product): Iterable<ProductPricing> {
        return productPricingService.getProductPricingList(product)
    }

    @SchemaMapping
    fun seller(productPricing: ProductPricing): ProductSeller {
        return productSellerService.getSeller(productPricing.sellerId)
    }
}