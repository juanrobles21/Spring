package com.usta.universidad.model;

import javax.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignaturas {
    private static final long serialVesionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasignatura")
    private Long idAsignatura;

    @Column(name = "semestreasignatura")
    private int semestreAsignatura;

    @Column(name = "nombreasignatura")
    private String nombreAsignatura;

    @Column(name = "codigoasignatura")
    private int codigoAsignatura;

    @JoinColumn(name = "iddocente", referencedColumnName = "cod_docente")
    @ManyToOne(fetch = FetchType.EAGER)
    private Docente fkDocente;

    public Asignaturas() {
    }

    public Asignaturas(Long idAsignatura, int semestreAsignatura, String nombreAsignatura, int codigoAsignatura, Docente fkDocente) {
        this.idAsignatura = idAsignatura;
        this.semestreAsignatura = semestreAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.fkDocente = fkDocente;
    }

    public Long getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getSemestreAsignatura() {
        return semestreAsignatura;
    }

    public void setSemestreAsignatura(int semestreAsignatura) {
        this.semestreAsignatura = semestreAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public Docente getFkDocente() {
        return fkDocente;
    }

    public void setFkDocente(Docente fkDocente) {
        this.fkDocente = fkDocente;
    }
}
