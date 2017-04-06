/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.guiaturistica.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author marieuri
 */
@Entity
@Table(name = "lugarturistico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugarturistico.findAll", query = "SELECT l FROM Lugarturistico l")
    , @NamedQuery(name = "Lugarturistico.findByIdlugarturistico", query = "SELECT l FROM Lugarturistico l WHERE l.idlugarturistico = :idlugarturistico")
    , @NamedQuery(name = "Lugarturistico.findByDescripcion", query = "SELECT l FROM Lugarturistico l WHERE l.descripcion = :descripcion")
    , @NamedQuery(name = "Lugarturistico.findByTipolugar", query = "SELECT l FROM Lugarturistico l WHERE l.tipolugar = :tipolugar")
    , @NamedQuery(name = "Lugarturistico.findByIdmarcaturistica", query = "SELECT l FROM Lugarturistico l WHERE l.idmarcaturistica = :idmarcaturistica")})
public class Lugarturistico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlugarturistico")
    private Integer idlugarturistico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipolugar")
    private Character tipolugar;
    @Column(name = "idmarcaturistica")
    private Integer idmarcaturistica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idlugarturistico")
    private List<Recursosmultimedia> recursosmultimediaList;

    public Lugarturistico() {
    }

    public Lugarturistico(Integer idlugarturistico) {
        this.idlugarturistico = idlugarturistico;
    }

    public Lugarturistico(Integer idlugarturistico, String descripcion, Character tipolugar) {
        this.idlugarturistico = idlugarturistico;
        this.descripcion = descripcion;
        this.tipolugar = tipolugar;
    }

    public Integer getIdlugarturistico() {
        return idlugarturistico;
    }

    public void setIdlugarturistico(Integer idlugarturistico) {
        this.idlugarturistico = idlugarturistico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getTipolugar() {
        return tipolugar;
    }

    public void setTipolugar(Character tipolugar) {
        this.tipolugar = tipolugar;
    }

    public Integer getIdmarcaturistica() {
        return idmarcaturistica;
    }

    public void setIdmarcaturistica(Integer idmarcaturistica) {
        this.idmarcaturistica = idmarcaturistica;
    }

    @XmlTransient
    public List<Recursosmultimedia> getRecursosmultimediaList() {
        return recursosmultimediaList;
    }

    public void setRecursosmultimediaList(List<Recursosmultimedia> recursosmultimediaList) {
        this.recursosmultimediaList = recursosmultimediaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlugarturistico != null ? idlugarturistico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugarturistico)) {
            return false;
        }
        Lugarturistico other = (Lugarturistico) object;
        if ((this.idlugarturistico == null && other.idlugarturistico != null) || (this.idlugarturistico != null && !this.idlugarturistico.equals(other.idlugarturistico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ittepic.edu.mx.guiaturistica.entidades.Lugarturistico[ idlugarturistico=" + idlugarturistico + " ]";
    }
    
}
