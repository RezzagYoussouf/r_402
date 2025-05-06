package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
            Voiture voiture = new Voiture("AissaniMobile",500);
            voiture.setId(95);
            assertEquals(voiture.getMarque(), "AissaniMobile");
            assertEquals(voiture.getPrix(), 500);
            assertEquals(voiture.getId(), 95);
    }

}
