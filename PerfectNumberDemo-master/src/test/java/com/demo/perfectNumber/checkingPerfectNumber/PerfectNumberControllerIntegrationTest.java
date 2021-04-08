package com.demo.perfectNumber.checkingPerfectNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PerfectNumberControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * Method to test the three first perfect numbers return true
     */
    @Test
    public void checkPNTest() {
        // First test 6
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/6", String.class), "true");

        // Now test 28
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/28", String.class), "true");

        // Finally test 496
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/496", String.class), "true");
    }


    /**
     * Method to test three non-perfect random numbers return false
     */
    @Test
    public void checkNoPNTest() {
        // First 10
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/10", String.class), "false");

        // Now test 35
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/35", String.class), "false");

        // Finally test 600
        assertEquals(restTemplate.getForObject("http://localhost:" + port + "/checkPerfectNumber/600", String.class), "false");
    }
    
}