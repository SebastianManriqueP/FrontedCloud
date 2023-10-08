package com.example.fronted.Controller;


import com.example.fronted.Service.SliceMangerService;
import com.example.fronted.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("")
public class Prueba {

    @Autowired
    private SliceMangerService sliceMangerService;

    @GetMapping("/inicio")
    List inicio(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("BIENVENIDO",false);
        Datos dato2 = new Datos("Ingrese usuario: ",true,"usuario");
        Datos dato3 = new Datos("Ingrese contraseña: ",true,"contraseña");
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/login","POST");
        Datos dato4 = new Datos("",false,"",uriSiguiente );
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        return datosD;}

    @PostMapping("/login")
    public ResponseEntity<HashMap<String, String>> validar(@RequestBody Usuario usuario){
        HashMap<String, String> respuesta = new HashMap<>();
        if (usuario.usuario.equals("sebas")){
            respuesta.put("uriSiguiente", "/menu");
            respuesta.put("metodo", "GET");
        }else{
            respuesta.put("uriSiguiente", "/inicio");
            respuesta.put("metodo", "GET");
        }
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/menu")
    List menu(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#          MENU        #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("1. Listar Slice",false,"");
        Datos dato5 = new Datos("2. Crear Slice",false,"");
        Datos dato6 = new Datos("3. Editar Slice",false,"");
        Datos dato7 = new Datos("4. Borrar Slice",false,"");
        Datos dato8 = new Datos("5. Salir ",false,"");
        Datos datoi = new Datos("Ingrese opcion: ",true,"opcion");
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/menu/","GET");
        Datos datoSiguiente = new Datos("",false,"",uriSiguiente );
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        datosD.add(dato5);
        datosD.add(dato6);
        datosD.add(dato7);
        datosD.add(dato8);
        datosD.add(datoi);
        datosD.add(datoSiguiente);
        return datosD;}

    @GetMapping("/menu/1")
    List menuListar(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#     Lista Slices     #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("1. Slice 1 ",false,"");
        Datos dato5 = new Datos("2. Slice 2 ",false,"");
        Datos dato6 = new Datos("3. Slice 3 ",false,"");
        Datos dato7 = new Datos("4. Salir ",false,"");
        Datos datoi = new Datos("Ingrese opcion: ",true,"opcion");
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/menu/lista/","GET");
        Datos datoSiguiente = new Datos("",false,"",uriSiguiente );
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        datosD.add(dato5);
        datosD.add(dato6);
        datosD.add(dato7);
        datosD.add(datoi);
        datosD.add(datoSiguiente);
        return datosD;}

    @GetMapping("/menu/2")
    List menuCrear(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#      Crear Slice     #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("Nombre del Slice: ",true,"nombre");
        Datos dato5 = new Datos("Seleccione una topología: ",false,"");
        Datos dato6 = new Datos("1. Lineal",false,"");
        Datos dato7 = new Datos("2. Malla",false,"");
        Datos dato8 = new Datos("3. Árbol",false,"");
        Datos dato9 = new Datos("4. Anillo ",false,"");
        Datos dato10 = new Datos("5. Bus ",false,"");
        Datos dato11 = new Datos("6. Ninguna ",false,"");
        Datos dato12 = new Datos("Seleccione ocpion: ",true,"topologia");
        Datos dato13 = new Datos("Ingrese numero de VM: ",true,"numeroVM");
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/menu/crearVM","POST");
        Datos datoSiguiente = new Datos("",false,"",uriSiguiente );
        /**/
        datosD.add(dato); datosD.add(dato2); datosD.add(dato3); datosD.add(dato4); datosD.add(dato5); datosD.add(dato6); datosD.add(dato7);
        datosD.add(dato8); datosD.add(dato9); datosD.add(dato10); datosD.add(dato11); datosD.add(dato12); datosD.add(dato13); datosD.add(datoSiguiente);
        return datosD;}

    @GetMapping("/menu/3")
    List menuEditar(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#     Editar Slice     #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("1. Slice 1 ",false,"");
        Datos dato5 = new Datos("2. Slice 2 ",false,"");
        Datos dato6 = new Datos("3. Slice 3 ",false,"");
        Datos dato7 = new Datos("4. Salir ",false,"");
        Datos datoi = new Datos("Ingrese opcion: ",true,"opcion");
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        datosD.add(dato5);
        datosD.add(dato6);
        datosD.add(dato7);
        datosD.add(datoi);
        return datosD;}

    @GetMapping("/menu/4")
    List borrarEditar(){
        List datosD = new ArrayList<>();
        /**/
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#     Borrar Slice    #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("1. Slice 1 ",false,"");
        Datos dato5 = new Datos("2. Slice 2 ",false,"");
        Datos dato6 = new Datos("3. Slice 3 ",false,"");
        Datos dato7 = new Datos("4. Salir ",false,"");
        Datos datoi = new Datos("Ingrese opcion: ",true,"opcion");
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        datosD.add(dato5);
        datosD.add(dato6);
        datosD.add(dato7);
        datosD.add(datoi);
        return datosD;}

    @GetMapping("/menu/5")
    public RedirectView Salir(){
        /**/
        RedirectView redirectView = new RedirectView("/inicio");
        return redirectView;}


    @GetMapping("/menu/lista/{id}")
    List menuListarDetalle(@PathVariable ("id") Integer id){
        Slice slice = sliceMangerService.detalleSlice();
        List datosD = new ArrayList<>();
        Datos dato = new Datos("########################",false);
        Datos dato2 = new Datos("#      "+slice.getNombre()+"      #",false);
        Datos dato3= new Datos("########################",false);
        Datos dato4 = new Datos("", false, "", "JSON", slice);
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/menu","GET");
        Datos datoSiguiente = new Datos("",false,"",uriSiguiente );
        /**/
        datosD.add(dato);
        datosD.add(dato2);
        datosD.add(dato3);
        datosD.add(dato4);
        datosD.add(datoSiguiente);

        return datosD;}


    @PostMapping("/menu/crearVM")
    public List crearVM(@RequestBody SliceInicial sliceInicial){
        List datosD = new ArrayList<>();
        Integer numeroVMS=Integer.parseInt(sliceInicial.getNumeroVM());
        /**/
        for (int i = 1; i <= numeroVMS; i++) {
            Datos dato = new Datos("Nombre de VM "+i+": ",true,"nombre");
            Datos dato2 = new Datos("Cantidad de cores: ",true,"cores");
            Datos dato3 = new Datos("Cantidad de RAM (GB): ",true,"RAM");
            Datos dato4 = new Datos("Cantidad de almacenamiento (GB): ",true,"GB");

            datosD.add(dato); datosD.add(dato2);datosD.add(dato3); datosD.add(dato4);

        }
        /*Siguiente Uri*/
        Uri uriSiguiente = new Uri("/menu","GET");
        Datos datoSiguiente = new Datos("",false,"",uriSiguiente );
        datosD.add(datoSiguiente);
        /**/
        return datosD;}
}


