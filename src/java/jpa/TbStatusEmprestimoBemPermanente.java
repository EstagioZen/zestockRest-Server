/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gedsonfaria
 */
@Entity
@Table(name = "tb_status_emprestimo_bem_permanente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbStatusEmprestimoBemPermanente.findAll", query = "SELECT t FROM TbStatusEmprestimoBemPermanente t")
    , @NamedQuery(name = "TbStatusEmprestimoBemPermanente.findByIdStatus", query = "SELECT t FROM TbStatusEmprestimoBemPermanente t WHERE t.idStatus = :idStatus")
    , @NamedQuery(name = "TbStatusEmprestimoBemPermanente.findByDescricao", query = "SELECT t FROM TbStatusEmprestimoBemPermanente t WHERE t.descricao = :descricao")})
public class TbStatusEmprestimoBemPermanente implements Serializable {

    @OneToMany(mappedBy = "idStatus")
    private Collection<TbFasesEmprestimoBemPermanente> tbFasesEmprestimoBemPermanenteCollection;
    @OneToMany(mappedBy = "idStatusEmprestimo")
    private Collection<TbEmprestimoBemPermanente> tbEmprestimoBemPermanenteCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_status")
    private Integer idStatus;
    @Size(max = 64)
    @Column(name = "descricao")
    private String descricao;

    public TbStatusEmprestimoBemPermanente() {
    }

    public TbStatusEmprestimoBemPermanente(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatus != null ? idStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbStatusEmprestimoBemPermanente)) {
            return false;
        }
        TbStatusEmprestimoBemPermanente other = (TbStatusEmprestimoBemPermanente) object;
        if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TbStatusEmprestimoBemPermanente[ idStatus=" + idStatus + " ]";
    }

    @XmlTransient
    public Collection<TbFasesEmprestimoBemPermanente> getTbFasesEmprestimoBemPermanenteCollection() {
        return tbFasesEmprestimoBemPermanenteCollection;
    }

    public void setTbFasesEmprestimoBemPermanenteCollection(Collection<TbFasesEmprestimoBemPermanente> tbFasesEmprestimoBemPermanenteCollection) {
        this.tbFasesEmprestimoBemPermanenteCollection = tbFasesEmprestimoBemPermanenteCollection;
    }

    @XmlTransient
    public Collection<TbEmprestimoBemPermanente> getTbEmprestimoBemPermanenteCollection() {
        return tbEmprestimoBemPermanenteCollection;
    }

    public void setTbEmprestimoBemPermanenteCollection(Collection<TbEmprestimoBemPermanente> tbEmprestimoBemPermanenteCollection) {
        this.tbEmprestimoBemPermanenteCollection = tbEmprestimoBemPermanenteCollection;
    }
    
}
