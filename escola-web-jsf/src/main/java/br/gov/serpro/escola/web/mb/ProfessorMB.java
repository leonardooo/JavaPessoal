package br.gov.serpro.escola.web.mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.gov.serpro.escola.model.Professor;
import br.gov.serpro.escola.model.dao.ProfessorDAO;
import br.gov.serpro.escola.model.dao.ProfessorDAOImpl;

@ManagedBean
@RequestScoped
public class ProfessorMB {
	
	private ProfessorDAO dao = ProfessorDAOImpl.getInstance();
	private List<Professor> list, filteredList;
	private Professor professor = new Professor();
	
	public List<Professor> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<Professor> filteredList) {
		this.filteredList = filteredList;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ProfessorMB() {
		updateList();
	}
	
	public void acao() {
		System.out.println("acao");
	}

	public List<Professor> getList() {
		return list;
	}

	public void setList(List<Professor> list) {
		this.list = list;
	}
	
	private void updateList() {
		list = dao.list();
	}
	
	public void insert() {
		dao.insert(professor);
		
		professor = new Professor();
		
		FacesMessage mes = new FacesMessage("Professor incluído com sucesso", "Tá tranquilo, Tá favorável");
		FacesContext.getCurrentInstance().addMessage(null, mes);
	}

}
