package com.stefanini.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Agente;

@Path("/agente")
@RequestScoped
public class AgenteController {

	
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Agente> get() {
        ArrayList<Agente> agentes= new ArrayList<Agente>();
        Agente agente1 = new Agente();
        Agente agente2= new Agente();
        agente1.setIdAgente(1);
        agente1.setNome("Joao");
        agente1.setDtContratacao(new Date(1992,11,30));
        agente1.setTempoServico(10);
        agente2.setIdAgente(2);
        agente2.setNome("Jose");
        agente2.setDtContratacao(new Date(2010,10,11));
        agente2.setTempoServico(50);
        agentes.add(agente1);
        agentes.add(agente2);
    	return agentes;
    }
}