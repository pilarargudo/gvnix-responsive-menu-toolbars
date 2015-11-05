package com.springsource.petclinic.services;
import org.springframework.stereotype.Service;
import org.gvnix.service.roo.addon.annotations.GvNIXWebService;

@Service
@GvNIXWebService(name = "ws_get_all_petsPortType", targetNamespace = "http://services.petclinic.springsource.com/", serviceName = "ws_get_all_pets", address = "PetsServices", fullyQualifiedTypeName = "com.springsource.petclinic.services.PetsServices", exported = false)
public class PetsServices {

    public void ws_list_pets() {
        // TODO: You have to place the method logic here.
        return;
    }
}
