package br.gov.serpro.escola.web.mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.gov.serpro.escola.model.Aluno;
import br.gov.serpro.escola.model.dao.AlunoDAO;
import br.gov.serpro.escola.model.dao.AlunoDAOImpl;

@ManagedBean
@RequestScoped
public class AlunoMB {
	
	private AlunoDAO dao = AlunoDAOImpl.getInstance();
	private List<Aluno> list, filteredList;
	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<Aluno> filteredList) {
		this.filteredList = filteredList;
	}

	public AlunoMB() {
		updateList();
	}
	
	public void acao() {
		System.out.println("acao");
	}

	public List<Aluno> getList() {
		return list;
	}

	public void setList(List<Aluno> list) {
		this.list = list;
	}
	
	private void updateList() {
		list = dao.list();
	}
	
	public void insert() {
		dao.insert(aluno);
		
		aluno = new Aluno();
		
		FacesMessage mes = new FacesMessage("Aluno incluído com sucesso", "Tá tranquilo, Tá favorável");
		FacesContext.getCurrentInstance().addMessage(null, mes);
	}

}
