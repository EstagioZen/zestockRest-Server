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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gedsonfaria
 */
@Entity
@Table(name = "tb_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRoles.findAll", query = "SELECT t FROM TbRoles t")
    , @NamedQuery(name = "TbRoles.findByIdRole", query = "SELECT t FROM TbRoles t WHERE t.idRole = :idRole")
    , @NamedQuery(name = "TbRoles.findByRole", query = "SELECT t FROM TbRoles t WHERE t.role = :role")})
public class TbRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_role")
    private Integer idRole;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "role")
    private String role;
    @JoinTable(name = "tb_user_roles", joinColumns = {
        @JoinColumn(name = "id_role", referencedColumnName = "id_role")}, inverseJoinColumns = {
        @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")})
    @ManyToMany
    private Collection<TbUsuario> tbUsuarioCollection;

    public TbRoles() {
    }

    public TbRoles(Integer idRole) {
        this.idRole = idRole;
    }

    public TbRoles(Integer idRole, String role) {
        this.idRole = idRole;
        this.role = role;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<TbUsuario> getTbUsuarioCollection() {
        return tbUsuarioCollection;
    }

    public void setTbUsuarioCollection(Collection<TbUsuario> tbUsuarioCollection) {
        this.tbUsuarioCollection = tbUsuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRole != null ? idRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRoles)) {
            return false;
        }
        TbRoles other = (TbRoles) object;
        if ((this.idRole == null && other.idRole != null) || (this.idRole != null && !this.idRole.equals(other.idRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TbRoles[ idRole=" + idRole + " ]";
    }
    
}
