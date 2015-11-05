package com.springsource.petclinic.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.activerecord.RooJpaActiveRecord;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.persistence.ManyToOne;
import com.springsource.petclinic.reference.PetType;
import javax.persistence.Enumerated;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import org.gvnix.occ.roo.addon.annotations.GvNIXEntityOCCChecksum;
import javax.persistence.Transient;
import javax.persistence.Version;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "PET_SEQ", finders = { "findPetsByNameAndWeight", "findPetsByOwner", "findPetsBySendRemindersAndWeightLessThan", "findPetsByTypeAndNameLike" })
@GvNIXEntityOCCChecksum
public class Pet {

    /**
     */
    @NotNull
    private boolean sendReminders;

    /**
     */
    @NotNull
    @Size(min = 1)
    private String name;

    /**
     */
    @NotNull
    @Min(0L)
    private BigDecimal weight;

    /**
     */
    @ManyToOne
    private Owner owner;

    /**
     */
    @NotNull
    @Enumerated
    private PetType type;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<Visit>();

    @Version
    @Transient
    private String occChekcsum;
}
