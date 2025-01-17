package com.rarible.opensea.client.autoconfigure

import com.rarible.opensea.client.OpenSeaClient
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@SpringBootConfiguration
@EnableAutoConfiguration
class OpenSeaClientAutoConfigurationTest {

    @Autowired
    private lateinit var openSeaClient: OpenSeaClient

    @Test
    fun `test default consumer initialized`() {
        assertNotEquals(openSeaClient, null)
    }
}
