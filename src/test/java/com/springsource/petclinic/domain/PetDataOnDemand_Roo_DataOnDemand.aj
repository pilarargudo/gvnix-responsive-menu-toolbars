// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.petclinic.domain;

import com.springsource.petclinic.domain.OwnerDataOnDemand;
import com.springsource.petclinic.domain.Pet;
import com.springsource.petclinic.domain.PetDataOnDemand;
import com.springsource.petclinic.reference.PetType;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect PetDataOnDemand_Roo_DataOnDemand {
    
    declare @type: PetDataOnDemand: @Component;
    
    private Random PetDataOnDemand.rnd = new SecureRandom();
    
    private List<Pet> PetDataOnDemand.data;
    
    @Autowired
    OwnerDataOnDemand PetDataOnDemand.ownerDataOnDemand;
    
    public Pet PetDataOnDemand.getNewTransientPet(int index) {
        Pet obj = new Pet();
        setName(obj, index);
        setSendReminders(obj, index);
        setType(obj, index);
        setWeight(obj, index);
        return obj;
    }
    
    public void PetDataOnDemand.setName(Pet obj, int index) {
        String name = "name_" + index;
        obj.setName(name);
    }
    
    public void PetDataOnDemand.setSendReminders(Pet obj, int index) {
        Boolean sendReminders = true;
        obj.setSendReminders(sendReminders);
    }
    
    public void PetDataOnDemand.setType(Pet obj, int index) {
        PetType type = PetType.class.getEnumConstants()[0];
        obj.setType(type);
    }
    
    public void PetDataOnDemand.setWeight(Pet obj, int index) {
        BigDecimal weight = BigDecimal.valueOf(index);
        obj.setWeight(weight);
    }
    
    public Pet PetDataOnDemand.getSpecificPet(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Pet obj = data.get(index);
        Long id = obj.getId();
        return Pet.findPet(id);
    }
    
    public Pet PetDataOnDemand.getRandomPet() {
        init();
        Pet obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Pet.findPet(id);
    }
    
    public boolean PetDataOnDemand.modifyPet(Pet obj) {
        return false;
    }
    
    public void PetDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Pet.findPetEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Pet' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Pet>();
        for (int i = 0; i < 10; i++) {
            Pet obj = getNewTransientPet(i);
            try {
                obj.persist();
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
