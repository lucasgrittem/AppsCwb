package br.com.fuelclub.controller;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import br.com.fuelclub.bo.CidadeBo;
import br.com.fuelclub.dao.CidadeDao;
import br.com.fuelclub.entity.Cidade;
import br.com.fuelclub.entity.Estado;

@ManagedBean (name = "CidadeBean")
@SessionScoped
public class CidadeController {

	private static final long serialVersionUID = 1L;
	
	private Cidade cidade;
	private CidadeDao cidadeDao;
	private List<Cidade> cidades;
	private Estado estado;
	private CidadeBo cidadeBo;
	
	
	public CidadeBo getCidadeFacade() {
		return cidadeBo;
	}
	public void setCidadeFacade(CidadeBo cidadeFacade) {
		this.cidadeBo = cidadeFacade;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public CidadeDao getCidadeDao() {
		return cidadeDao;
	}
	public void setCidadeDao(CidadeDao cidadeDao) {
		this.cidadeDao = cidadeDao;
	}
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cidadeDao == null) ? 0 : cidadeDao.hashCode());
		result = prime * result + ((cidadeBo == null) ? 0 : cidadeBo.hashCode());
		result = prime * result + ((cidades == null) ? 0 : cidades.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CidadeController other = (CidadeController) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cidadeDao == null) {
			if (other.cidadeDao != null)
				return false;
		} else if (!cidadeDao.equals(other.cidadeDao))
			return false;
		if (cidadeBo == null) {
			if (other.cidadeBo != null)
				return false;
		} else if (!cidadeBo.equals(other.cidadeBo))
			return false;
		if (cidades == null) {
			if (other.cidades != null)
				return false;
		} else if (!cidades.equals(other.cidades))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CidadeController [cidade=" + cidade + ", cidadeDao=" + cidadeDao + ", cidades=" + cidades + ", estado="
				+ estado + ", cidadeFacade=" + cidadeBo + ", getCidadeFacade()=" + getCidadeFacade()
				+ ", getCidade()=" + getCidade() + ", getCidadeDao()=" + getCidadeDao() + ", getCidades()="
				+ getCidades() + ", getEstado()=" + getEstado() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	public CidadeController(Cidade cidade, CidadeDao cidadeDao, List<Cidade> cidades, Estado estado) {
		super();
		this.cidade = cidade;
		this.cidadeDao = cidadeDao;
		this.cidades = cidades;
		this.estado = estado;
	}
	public CidadeController() {
		super();
		
	}
	
	
	public List<Cidade> listarPorEstado (ValueChangeEvent evento){
		
		CidadeBo cidadeBo = new CidadeBo();
		estado = (Estado) evento.getNewValue();
		Long id;
		id = estado.getEstado_id();
		cidades = cidadeBo.listarPorEstado(id);
		return cidadeBo.listarPorEstado(id);
		
	}
	
	
}
