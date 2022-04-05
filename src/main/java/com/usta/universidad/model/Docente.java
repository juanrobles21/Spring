package com.usta.universidad.model;

import javax.persistence.*;

@Entity
@Table(name = "docente")
public class Docente {
    private static final long serialVesionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_docente")
    private Long codDocente;

    @Column(name = "documento_docente")
    private String documentoDocente;

    @Column(name = "nombres_docente")
    private String nombresDocente;

    @Column(name = "apellidosdocente")
    private String apellidosDocente;

    @Column(name = "tipodocente")
    private int tipoDocente;

    @JoinColumn(name = "cod_facultad", referencedColumnName = "cod_facultad")
    @ManyToOne(fetch = FetchType.EAGER)
    private Facultad fkFacultades;

    public Docente() {
    }

    public Docente(Long codDocente, String documentoDocente, String nombresDocente, String apellidosDocente, int tipoDocente, Facultad fkFacultades) {
        this.codDocente = codDocente;
        this.documentoDocente = documentoDocente;
        this.nombresDocente = nombresDocente;
        this.apellidosDocente = apellidosDocente;
        this.tipoDocente = tipoDocente;
        this.fkFacultades = fkFacultades;
    }

    public Long getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(Long codDocente) {
        this.codDocente = codDocente;
    }

    public String getDocumentoDocente() {
        return documentoDocente;
    }

    public void setDocumentoDocente(String documentoDocente) {
        this.documentoDocente = documentoDocente;
    }

    public String getNombresDocente() {
        return nombresDocente;
    }

    public void setNombresDocente(String nombresDocente) {
        this.nombresDocente = nombresDocente;
    }

    public String getApellidosDocente() {
        return apellidosDocente;
    }

    public void setApellidosDocente(String apellidosDocente) {
        this.apellidosDocente = apellidosDocente;
    }

    public int getTipoDocente() {
        return tipoDocente;
    }

    public void setTipoDocente(int tipoDocente) {
        this.tipoDocente = tipoDocente;
    }

    public Facultad getFkFacultades() {
        return fkFacultades;
    }

    public void setFkFacultades(Facultad fkFacultades) {
        this.fkFacultades = fkFacultades;
    }
}
