package com.usta.universidad.model;

import javax.persistence.*;

@Entity
@Table(name = "seccional")
public class Seccional {
    private  static  final  long serialVersionUIDL =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseccional")
    private Long idSeccional;

    @Column(name = "direccionseccional")
    private String direccionSeccional;

    @Column(name = "nombreseccional")
    private String nombreSeccional;

    @JoinColumn(name = "iduniversidad", referencedColumnName = "iduniversidad")
    @ManyToOne(fetch = FetchType.EAGER)
    private Universidad fkUniversidad;

    public Seccional() {
    }

    public Seccional(Long idSeccional, String direccionSeccional, String nombreSeccional, Universidad fkUniversidad) {
        this.idSeccional = idSeccional;
        this.direccionSeccional = direccionSeccional;
        this.nombreSeccional = nombreSeccional;
        this.fkUniversidad = fkUniversidad;
    }

    public Long getIdSeccional() {
        return idSeccional;
    }

    public void setIdSeccional(Long idSeccional) {
        this.idSeccional = idSeccional;
    }

    public String getDireccionSeccional() {
        return direccionSeccional;
    }

    public void setDireccionSeccional(String direccionSeccional) {
        this.direccionSeccional = direccionSeccional;
    }

    public String getNombreSeccional() {
        return nombreSeccional;
    }

    public void setNombreSeccional(String nombreSeccional) {
        this.nombreSeccional = nombreSeccional;
    }

    public Universidad getFkUniversidad() {
        return fkUniversidad;
    }

    public void setFkUniversidad(Universidad fkUniversidad) {
        this.fkUniversidad = fkUniversidad;
    }
}
