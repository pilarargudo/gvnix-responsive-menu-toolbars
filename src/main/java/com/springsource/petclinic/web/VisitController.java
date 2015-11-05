package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Visit;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.annotations.finder.RooWebFinder;
import com.springsource.petclinic.domain.VisitBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.gvnix.addon.datatables.annotations.GvNIXDatatables;
import org.gvnix.addon.loupefield.annotations.GvNIXLoupeController;

@RequestMapping("/visits")
@Controller
@RooWebScaffold(path = "visits", formBackingObject = Visit.class)
@RooWebFinder
@GvNIXWebJpaBatch(service = VisitBatchService.class)
@GvNIXWebJQuery
@GvNIXDatatables(ajax = true, inlineEditing = true)
@GvNIXLoupeController
public class VisitController {
}
