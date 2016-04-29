package vdd.spring.beans.instruments;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import vdd.spring.beans.musiciens.Joueur;

import vdd.spring.exception.JouerException;


@Component("groupe")
public class GroupeMusique implements Joueur {
	private String nom;
	
	@Value("{instruments}")
	private Collection<Instrument> instruments;
	

	public GroupeMusique() {
		super();
	}

	public void jouerMorceau() throws JouerException {
		System.out.println(nom+ " joue ");
		for (Instrument instrument : instruments) {
			System.out.print(" à la fois ");
			instrument.jouer();
			
			
			
			
			
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Instrument> getInstruments() {
		return instruments;
	}
}
