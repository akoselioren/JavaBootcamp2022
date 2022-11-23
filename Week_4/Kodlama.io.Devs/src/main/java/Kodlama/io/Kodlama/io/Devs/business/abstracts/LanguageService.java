package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	 List<Language> getAll();
		void create (Language language) throws Exception;
		void delete(int id) throws Exception;
		void update(Language language, int id) throws Exception;
		Language getById(int id) throws Exception;
	 
 }
