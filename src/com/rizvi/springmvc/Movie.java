package com.rizvi.springmvc;

import java.util.LinkedHashMap;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Movie {
	
	@NotNull(message="Judul harus ada")
	@Size(min=1, message="is required")
	private String judul;
	
	@NotNull(message="Tahun harus ada")
	@Size(min=1, message="is required")
	private String tahun;
	
	private String genre;
	private String negara;
	private String bahasa;
	private String sutradara;
	private LinkedHashMap<String, String> negaraOptions;
	
	public Movie() {
		negaraOptions = new LinkedHashMap<String, String>();
		negaraOptions.put("United Kingdom", "United Kingdom");
		negaraOptions.put("Jepang", "Jepang");
		negaraOptions.put("Indonesia", "Indonesia");
	}
	
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getTahun() {
		return tahun;
	}
	public void setTahun(String tahun) {
		this.tahun = tahun;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNegara() {
		return negara;
	}

	public void setNegara(String negara) {
		this.negara = negara;
	}
	public LinkedHashMap<String, String> getNegaraOptions() {
		return negaraOptions;
	}
	public void setNegaraOptions(LinkedHashMap<String, String> negaraOptions) {
		this.negaraOptions = negaraOptions;
	}
	
	public String getBahasa() {
		return bahasa;
	}
	public void setBahasa(String bahasa) {
		this.bahasa = bahasa;
	}
	public String getSutradara() {
		return sutradara;
	}
	public void setSutradara(String sutradara) {
		this.sutradara = sutradara;
	}

	public Movie(String judul, String tahun, String genre, String negara, String bahasa, String sutradara,
			LinkedHashMap<String, String> negaraOptions) {
		super();
		this.judul = judul;
		this.tahun = tahun;
		this.genre = genre;
		this.negara = negara;
		this.bahasa = bahasa;
		this.sutradara = sutradara;
		this.negaraOptions = negaraOptions;
	}

}
