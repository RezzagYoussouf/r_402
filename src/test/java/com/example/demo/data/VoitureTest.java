package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
            Voiture voiture = new Voiture("AissaniMobile",5000);
            assertEquals(voiture.getMarque(), "AissaniMobile");
            assertEquals(voiture.getPrix(), 5000);
    }

}
