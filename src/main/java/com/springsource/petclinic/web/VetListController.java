package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Vet;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.gvnix.addon.datatables.annotations.GvNIXDatatables;

@RequestMapping("/vetlist")
@Controller
@RooWebScaffold(path = "vetlist", formBackingObject = Vet.class)
@GvNIXWebJQuery
@GvNIXDatatables(ajax = true)
public class VetListController {
}
