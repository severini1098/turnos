package com.dis;

import com.dis.model.Paciente;
import com.dis.model.Profesional;
import com.dis.model.Turno;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TurnosApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void createProfesional() {
        Profesional profesional = new Profesional();
        profesional.setNombre("Diego");
        profesional.setApellido("Severini");
        ResponseEntity<Profesional> responseEntity =
                restTemplate.postForEntity("/profesionals", profesional, Profesional.class);
        Profesional profesional1 = responseEntity.getBody();

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals("Diego", profesional1.getNombre());
    }
}
