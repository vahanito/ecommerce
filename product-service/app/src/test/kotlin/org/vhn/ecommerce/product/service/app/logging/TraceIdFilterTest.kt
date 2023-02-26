package org.vhn.ecommerce.product.service.app.logging

import io.micrometer.tracing.test.simple.SimpleSpan
import io.micrometer.tracing.test.simple.SimpleTracer
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.header


@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.MOCK,
    classes = [TraceIdFilterTest.TraceIdFilterTestConfig::class]
)
@AutoConfigureMockMvc(webClientEnabled = false)
class TraceIdFilterTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `verify trace id and span id in response headers`() {
        mockMvc.perform(get("/"))
            .andExpect(
                header().exists("trace-id")
            ).andExpect(
                header().exists("span-id")
            )
    }

    @Configuration
    class TraceIdFilterTestConfig {

        @Bean
        fun traceIdFilter(tracer: SimpleTracer): TraceIdLoggingFilter {
            return TraceIdLoggingFilter(tracer)
        }

        @Bean
        fun simpleTracer(): SimpleTracer {
            val simpleTracer = SimpleTracer()
            simpleTracer.withSpan(SimpleSpan())
            return simpleTracer
        }

    }
}