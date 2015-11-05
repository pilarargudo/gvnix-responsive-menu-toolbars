package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Owner;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springsource.petclinic.domain.OwnerBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.gvnix.addon.datatables.annotations.GvNIXDatatables;
import org.gvnix.web.report.roo.addon.annotations.GvNIXReports;

@RequestMapping("/owners")
@Controller
@RooWebScaffold(path = "owners", formBackingObject = Owner.class)
@GvNIXWebJpaBatch(service = OwnerBatchService.class)
@GvNIXWebJQuery
@GvNIXDatatables(ajax = true, detailFields = { "pets", "vets" })
@GvNIXReports({ "report_owners|pdf" })
public class OwnerController {
}
