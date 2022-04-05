package com.usta.universidad.model;

import javax.persistence.*;

@Entity
@Table(name = "facultad")
public class Facultad {
    private static final long serialVesionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_facultad")
    private Long codFacultad;

    @Column(name = "nombre_facultad")
    private String nombreFacultad;

    @JoinColumn(name = "idseccional", referencedColumnName = "idseccional")
    @ManyToOne(fetch = FetchType.EAGER)
    private Seccional fkSeccional;

    public Facultad() {
    }

    public Facultad(Long codFacultad, String nombreFacultad, Seccional fkSeccional) {
        this.codFacultad = codFacultad;
        this.nombreFacultad = nombreFacultad;
        this.fkSeccional = fkSeccional;
    }

    public Long getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(Long codFacultad) {
        this.codFacultad = codFacultad;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public Seccional getFkSeccional() {
        return fkSeccional;
    }

    public void setFkSeccional(Seccional fkSeccional) {
        this.fkSeccional = fkSeccional;
    }
}
