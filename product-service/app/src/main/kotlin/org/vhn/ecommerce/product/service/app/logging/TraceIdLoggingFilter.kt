package org.vhn.ecommerce.product.service.app.logging

import io.micrometer.tracing.Tracer
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.MDC
import org.springframework.stereotype.Service
import org.springframework.web.filter.OncePerRequestFilter

@Service
class TraceIdLoggingFilter(val tracer: Tracer) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val context = tracer.currentTraceContext().context()!!
        val traceId = context.traceId()
        val spanId = context.spanId()
        MDC.put("traceid", traceId)
        response.setHeader("trace-id", traceId)
        response.setHeader("span-id", spanId)
        
        filterChain.doFilter(request, response)
    }
}