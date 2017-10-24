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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gedsonfaria
 */
@Entity
@Table(name = "tb_historico_consumo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbHistoricoConsumo.findAll", query = "SELECT t FROM TbHistoricoConsumo t")
    , @NamedQuery(name = "TbHistoricoConsumo.findByIdHistoricoConsumo", query = "SELECT t FROM TbHistoricoConsumo t WHERE t.idHistoricoConsumo = :idHistoricoConsumo")
    , @NamedQuery(name = "TbHistoricoConsumo.findByQuantidadeRetirada", query = "SELECT t FROM TbHistoricoConsumo t WHERE t.quantidadeRetirada = :quantidadeRetirada")
    , @NamedQuery(name = "TbHistoricoConsumo.findByMotivoRetirada", query = "SELECT t FROM TbHistoricoConsumo t WHERE t.motivoRetirada = :motivoRetirada")
    , @NamedQuery(name = "TbHistoricoConsumo.findByDtRetirada", query = "SELECT t FROM TbHistoricoConsumo t WHERE t.dtRetirada = :dtRetirada")})
public class TbHistoricoConsumo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historico_consumo")
    private Long idHistoricoConsumo;
    @Column(name = "quantidade_retirada")
    private Integer quantidadeRetirada;
    @Size(max = 255)
    @Column(name = "motivo_retirada")
    private String motivoRetirada;
    @Column(name = "dt_retirada")
    @Temporal(TemporalType.DATE)
    private Date dtRetirada;
    @JoinColumn(name = "id_material_retirado", referencedColumnName = "id_consumo")
    @ManyToOne
    private TbConsumo idMaterialRetirado;
    @JoinColumn(name = "id_quem_retirou", referencedColumnName = "id_usuario")
    @ManyToOne
    private TbUsuario idQuemRetirou;

    public TbHistoricoConsumo() {
    }

    public TbHistoricoConsumo(Long idHistoricoConsumo) {
        this.idHistoricoConsumo = idHistoricoConsumo;
    }

    public Long getIdHistoricoConsumo() {
        return idHistoricoConsumo;
    }

    public void setIdHistoricoConsumo(Long idHistoricoConsumo) {
        this.idHistoricoConsumo = idHistoricoConsumo;
    }

    public Integer getQuantidadeRetirada() {
        return quantidadeRetirada;
    }

    public void setQuantidadeRetirada(Integer quantidadeRetirada) {
        this.quantidadeRetirada = quantidadeRetirada;
    }

    public String getMotivoRetirada() {
        return motivoRetirada;
    }

    public void setMotivoRetirada(String motivoRetirada) {
        this.motivoRetirada = motivoRetirada;
    }

    public Date getDtRetirada() {
        return dtRetirada;
    }

    public void setDtRetirada(Date dtRetirada) {
        this.dtRetirada = dtRetirada;
    }

    public TbConsumo getIdMaterialRetirado() {
        return idMaterialRetirado;
    }

    public void setIdMaterialRetirado(TbConsumo idMaterialRetirado) {
        this.idMaterialRetirado = idMaterialRetirado;
    }

    public TbUsuario getIdQuemRetirou() {
        return idQuemRetirou;
    }

    public void setIdQuemRetirou(TbUsuario idQuemRetirou) {
        this.idQuemRetirou = idQuemRetirou;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoricoConsumo != null ? idHistoricoConsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbHistoricoConsumo)) {
            return false;
        }
        TbHistoricoConsumo other = (TbHistoricoConsumo) object;
        if ((this.idHistoricoConsumo == null && other.idHistoricoConsumo != null) || (this.idHistoricoConsumo != null && !this.idHistoricoConsumo.equals(other.idHistoricoConsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TbHistoricoConsumo[ idHistoricoConsumo=" + idHistoricoConsumo + " ]";
    }
    
}
