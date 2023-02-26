package org.vhn.ecommerce.product.service.app.logging

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Service
import org.springframework.web.filter.OncePerRequestFilter

@Service
class TransactionLoggingFilter : OncePerRequestFilter() {


    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        filterChain.doFilter(request, response)
        logger.info("TRAN [httpStatus]=%s [%s] %s".format(response.status, request.method, request.requestURI))
    }
}