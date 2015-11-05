package com.springsource.petclinic.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.annotations.RooIntegrationTest;

@RooIntegrationTest(entity = Pet.class)
public class PetIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
