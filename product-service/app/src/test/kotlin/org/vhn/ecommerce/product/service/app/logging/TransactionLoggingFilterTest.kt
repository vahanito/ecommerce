package org.vhn.ecommerce.product.service.app.logging

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.boot.test.system.CapturedOutput
import org.springframework.boot.test.system.OutputCaptureExtension


@ExtendWith(OutputCaptureExtension::class)
class TransactionLoggingFilterTest {

    private val filter = TransactionLoggingFilter()

    @Test
    fun `verify transaction log`(capturedOutput: CapturedOutput) {
        val request = Mockito.mock(HttpServletRequest::class.java)
        val response = Mockito.mock(HttpServletResponse::class.java)
        val filterChain = Mockito.mock(FilterChain::class.java)
        filter.doFilter(request, response, filterChain)

        Assertions.assertThat(capturedOutput.out)
            .contains("TRAN [httpStatus]=")
    }
}