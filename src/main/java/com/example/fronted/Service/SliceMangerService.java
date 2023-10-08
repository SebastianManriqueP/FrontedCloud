package com.example.fronted.Service;

import com.example.fronted.entities.Slice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SliceMangerService {

    private String sliceManager ="localhost:8081";



    public Slice detalleSlice() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Slice> respuesta = restTemplate.getForEntity("http://localhost:8081/listar/detalle", Slice.class);
        Slice slice =respuesta.getBody();

        return slice;
    }
}
