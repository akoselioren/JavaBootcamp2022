package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public void create(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Hata! - Programlama dili boş bırakılamaz");
		}
		for (Language lang : getAll()) {
			if (lang.getId() == language.getId()) {
				throw new Exception("Hata! - Programlama isimleri tekrar edemez!");
			}
		}
		languageRepository.create(language);
	}

	@Override
	public void update(Language language, int id) throws Exception {
		if (languageRepository.getById(id) == null) {
			throw new Exception("Hata! - Güncellemek istediğiniz programlama dili sistemde kayıtlı değil!");
		}
		languageRepository.update(language, id);

	}

	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
		System.out.println(id + " nolu id'ye ait kaydın silme işlemi gerçekleşti.!");

	}

	@Override
	public Language getById(int id) throws Exception {

		return languageRepository.getById(id);
	}

}
