/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "tb_bem_permanente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbBemPermanente.findAll", query = "SELECT t FROM TbBemPermanente t")
    , @NamedQuery(name = "TbBemPermanente.findByDescricaoBem", query = "SELECT t FROM TbBemPermanente t WHERE t.descricaoBem = :descricaoBem")
    , @NamedQuery(name = "TbBemPermanente.findByDtEntrada", query = "SELECT t FROM TbBemPermanente t WHERE t.dtEntrada = :dtEntrada")
    , @NamedQuery(name = "TbBemPermanente.findByObservacao", query = "SELECT t FROM TbBemPermanente t WHERE t.observacao = :observacao")
    , @NamedQuery(name = "TbBemPermanente.findByIdNumPatrimonio", query = "SELECT t FROM TbBemPermanente t WHERE t.idNumPatrimonio = :idNumPatrimonio")})
public class TbBemPermanente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "descricao_bem")
    private String descricaoBem;
    @Column(name = "dt_entrada")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;
    @Size(max = 255)
    @Column(name = "observacao")
    private String observacao;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_num_patrimonio")
    private Integer idNumPatrimonio;
    @JoinColumn(name = "id_estado_conservacao", referencedColumnName = "id_estado_bem_permanente")
    @ManyToOne
    private TbEstadoBemPermanente idEstadoConservacao;
    @JoinColumn(name = "sala_alocacao", referencedColumnName = "id_loca_lotacao")
    @ManyToOne
    private TbLocaisLotacaoBemPermanente salaAlocacao;
    @JoinColumn(name = "id_co_responsavel", referencedColumnName = "id_usuario")
    @ManyToOne
    private TbUsuario idCoResponsavel;
    @OneToMany(mappedBy = "idNumPatrimonio")
    private Collection<TbEmprestimoBemPermanente> tbEmprestimoBemPermanenteCollection;

    public TbBemPermanente() {
    }

    public TbBemPermanente(Integer idNumPatrimonio) {
        this.idNumPatrimonio = idNumPatrimonio;
    }

    public TbBemPermanente(Integer idNumPatrimonio, String descricaoBem) {
        this.idNumPatrimonio = idNumPatrimonio;
        this.descricaoBem = descricaoBem;
    }

    public String getDescricaoBem() {
        return descricaoBem;
    }

    public void setDescricaoBem(String descricaoBem) {
        this.descricaoBem = descricaoBem;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getIdNumPatrimonio() {
        return idNumPatrimonio;
    }

    public void setIdNumPatrimonio(Integer idNumPatrimonio) {
        this.idNumPatrimonio = idNumPatrimonio;
    }

    public TbEstadoBemPermanente getIdEstadoConservacao() {
        return idEstadoConservacao;
    }

    public void setIdEstadoConservacao(TbEstadoBemPermanente idEstadoConservacao) {
        this.idEstadoConservacao = idEstadoConservacao;
    }

    public TbLocaisLotacaoBemPermanente getSalaAlocacao() {
        return salaAlocacao;
    }

    public void setSalaAlocacao(TbLocaisLotacaoBemPermanente salaAlocacao) {
        this.salaAlocacao = salaAlocacao;
    }

    public TbUsuario getIdCoResponsavel() {
        return idCoResponsavel;
    }

    public void setIdCoResponsavel(TbUsuario idCoResponsavel) {
        this.idCoResponsavel = idCoResponsavel;
    }

    @XmlTransient
    public Collection<TbEmprestimoBemPermanente> getTbEmprestimoBemPermanenteCollection() {
        return tbEmprestimoBemPermanenteCollection;
    }

    public void setTbEmprestimoBemPermanenteCollection(Collection<TbEmprestimoBemPermanente> tbEmprestimoBemPermanenteCollection) {
        this.tbEmprestimoBemPermanenteCollection = tbEmprestimoBemPermanenteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNumPatrimonio != null ? idNumPatrimonio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBemPermanente)) {
            return false;
        }
        TbBemPermanente other = (TbBemPermanente) object;
        if ((this.idNumPatrimonio == null && other.idNumPatrimonio != null) || (this.idNumPatrimonio != null && !this.idNumPatrimonio.equals(other.idNumPatrimonio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TbBemPermanente[ idNumPatrimonio=" + idNumPatrimonio + " ]";
    }
    
}
