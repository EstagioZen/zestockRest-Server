/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gedson
 */
@Entity
@Table(name = "tb_fases_emprestimo_bem_permanente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFasesEmprestimoBemPermanente.findAll", query = "SELECT t FROM TbFasesEmprestimoBemPermanente t")
    , @NamedQuery(name = "TbFasesEmprestimoBemPermanente.findByIdFasesEmprestimo", query = "SELECT t FROM TbFasesEmprestimoBemPermanente t WHERE t.idFasesEmprestimo = :idFasesEmprestimo")
    , @NamedQuery(name = "TbFasesEmprestimoBemPermanente.findByDtStatus", query = "SELECT t FROM TbFasesEmprestimoBemPermanente t WHERE t.dtStatus = :dtStatus")})
public class TbFasesEmprestimoBemPermanente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fases_emprestimo")
    private Integer idFasesEmprestimo;
    @Column(name = "dt_status")
    @Temporal(TemporalType.DATE)
    private Date dtStatus;
    @JoinColumn(name = "id_pedido_emprestimo", referencedColumnName = "id_pedido_emprestimo")
    @ManyToOne
    private TbEmprestimoBemPermanente idPedidoEmprestimo;
    @JoinColumn(name = "id_status", referencedColumnName = "id_status")
    @ManyToOne
    private TbStatusEmprestimoBemPermanente idStatus;
    @JoinColumn(name = "id_responsavel", referencedColumnName = "id_usuario")
    @ManyToOne
    private TbUsuario idResponsavel;

    public TbFasesEmprestimoBemPermanente() {
    }

    public TbFasesEmprestimoBemPermanente(Integer idFasesEmprestimo) {
        this.idFasesEmprestimo = idFasesEmprestimo;
    }

    public Integer getIdFasesEmprestimo() {
        return idFasesEmprestimo;
    }

    public void setIdFasesEmprestimo(Integer idFasesEmprestimo) {
        this.idFasesEmprestimo = idFasesEmprestimo;
    }

    public Date getDtStatus() {
        return dtStatus;
    }

    public void setDtStatus(Date dtStatus) {
        this.dtStatus = dtStatus;
    }

    public TbEmprestimoBemPermanente getIdPedidoEmprestimo() {
        return idPedidoEmprestimo;
    }

    public void setIdPedidoEmprestimo(TbEmprestimoBemPermanente idPedidoEmprestimo) {
        this.idPedidoEmprestimo = idPedidoEmprestimo;
    }

    public TbStatusEmprestimoBemPermanente getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(TbStatusEmprestimoBemPermanente idStatus) {
        this.idStatus = idStatus;
    }

    public TbUsuario getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(TbUsuario idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFasesEmprestimo != null ? idFasesEmprestimo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFasesEmprestimoBemPermanente)) {
            return false;
        }
        TbFasesEmprestimoBemPermanente other = (TbFasesEmprestimoBemPermanente) object;
        if ((this.idFasesEmprestimo == null && other.idFasesEmprestimo != null) || (this.idFasesEmprestimo != null && !this.idFasesEmprestimo.equals(other.idFasesEmprestimo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TbFasesEmprestimoBemPermanente[ idFasesEmprestimo=" + idFasesEmprestimo + " ]";
    }
    
}
