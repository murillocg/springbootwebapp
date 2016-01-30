package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String dataAgenda;
    private String horarioInicio;
	private String horarioFim;
    private String cliente;
    private String assunto;
    private String observacoes;

    public String getDataAgenda() {
		return dataAgenda;
	}
	public void setDataAgenda(String dataAgenda) {
		this.dataAgenda = dataAgenda;
	}
    public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
    
}
