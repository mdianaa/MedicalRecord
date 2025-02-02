package org.nbu.medicalrecord.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medical_records")
public class MedicalRecord extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private Patient patient; // name, personal id, date of birth

    @OneToMany(mappedBy = "medicalRecord", targetEntity = Visit.class, cascade = CascadeType.ALL)
    private Set<Visit> visits;

}
