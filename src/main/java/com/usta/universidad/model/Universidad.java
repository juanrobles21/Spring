package com.usta.universidad.model;

import javax.persistence.*;

@Entity
@Table(name = "universidad")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduniversidad")
    private Long idUniversidad;

    @Column(name = "nombreuniversidad")
    private String nombreUniversidad;

    @Column(name = "nituniversidad")
    private String nitUniversiad;

    public Universidad() {
    }

    public Universidad(Long idUniversidad, String nombreUniversidad, String nitUniversiad) {
        this.idUniversidad = idUniversidad;
        this.nombreUniversidad = nombreUniversidad;
        this.nitUniversiad = nitUniversiad;
    }

    public Long getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Long idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getNitUniversiad() {
        return nitUniversiad;
    }

    public void setNitUniversiad(String nitUniversiad) {
        this.nitUniversiad = nitUniversiad;
    }
}
