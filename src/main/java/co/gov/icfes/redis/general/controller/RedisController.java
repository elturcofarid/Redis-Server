package co.gov.icfes.redis.general.controller;

import javax.websocket.server.PathParam;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Autor: Farid Ureche
 * @Date: 20/08/2020 
 * */

@RestController
@RequestMapping(value = "/redis")
public class RedisController {
	
	
	@Cacheable(value = "sesion", key = "#key")
	@RequestMapping(value = "/{key}", method = RequestMethod.GET)
	public Object getSesion(@PathVariable long key) {		
		return null;
	}
	
	@CachePut(value = "sesion", key = "#key")	
	@RequestMapping(method = RequestMethod.POST)
	public Object putSesion(@PathParam(value = "key") long key, @PathParam(value = "object") Object object) {		
		return object;
	}
	
	
	
	@CachePut(value = "sesion", key = "#key")	
	@RequestMapping(value= "/json",method = RequestMethod.POST)
	public Object putSesion2(@PathParam(value = "key") long key, @RequestBody Object object) {		
		return object;
	}
	
}
  
	
