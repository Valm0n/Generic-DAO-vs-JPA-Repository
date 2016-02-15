/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;
import stuff.valm0n.genericdaopoc.service.manual.ManualService;

/**
 *
 * @author vsimon
 */
@RestController
@RequestMapping(value = "/generic/manuals")
public class GenericManualController {

    @Autowired(required = true)
    private ManualService repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Manual> viewManuals() {
        return repository.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Manual getManual(@PathVariable Long id) {
        return repository.get(id);
    }
    
    @RequestMapping(value = "/{id}/rules", method = RequestMethod.GET)
    public List<Rule> getRules(@PathVariable Long id){
        return repository.getRules(id);
    }

}
