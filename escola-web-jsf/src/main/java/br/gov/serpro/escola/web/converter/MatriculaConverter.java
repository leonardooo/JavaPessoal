package br.gov.serpro.escola.web.converter;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.gov.serpro.escola.model.Matricula;

@FacesConverter("matricula.converter")
public class MatriculaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent ui, String str) {
		String[] tokens = str.split("-");
		Matricula m = null;
		
		try {
			m = new Matricula(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		} catch(Exception e) {
			FacesMessage msg = new FacesMessage();
			msg.setSummary("Erro de conversão");
			msg.setDetail("Erro de conversão do valor [" + str + "] para matrícula.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			
			throw new ConverterException(msg, e);
		}
		
		return m;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent ui, Object obj) {
		
		String s = "";
		
		if(obj instanceof Matricula) {
			
			Matricula m = (Matricula) obj;
			s = m.getNumero() + "-" + m.getDigito();
			
		} else {
			throw new ConverterException("Campo não está associado à Matrícula.");
		}
		
		return s;
	}

}
