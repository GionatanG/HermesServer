/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wlspa.hermesserver.servlet;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author gionatanG
 */

public class Event {

    /**
     * This is a sample web service operation
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/measurement")
    public String hello(
        @QueryParam("name") String name) {
        return "Hello " + name + " !";
    }
}
