package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequests.GetLanguageByIdRequest;
import kodlama.io.Devs.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languageResponses.GetLanguageByIdResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;

	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();

		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

		for (Language language : languages) {// tek tek languages ler dolaşılır
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setLanguageId(language.getId());
			responseItem.setLanguageName(language.getName());

			languagesResponse.add(responseItem);
		}
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();

		if (createLanguageRequest.getLanguageName().isEmpty()) {
			throw new Exception("Please type a programming language!");
		} else if (!this.isValid(createLanguageRequest)) {
			throw new Exception("Programming language already exists!");
		} else {
			language.setName(createLanguageRequest.getLanguageName());
			this.languageRepository.save(language);
		}

	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		List<Language> languages = languageRepository.findAll();

		for (Language language : languages) {
			if (deleteLanguageRequest.getLanguageId() == language.getId()) {
				language.setId(deleteLanguageRequest.getLanguageId());
				this.languageRepository.delete(language);
				break;
			}
		}

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		List<Language> languages = languageRepository.findAll();
		for (Language language : languages) {
			if (language.getName().equalsIgnoreCase(updateLanguageRequest.getOldName())) {
				language.setName(updateLanguageRequest.getNewName());
				this.languageRepository.save(language);
				break;
			}
		}

	}

	@Override
	public GetLanguageByIdResponse getById(GetLanguageByIdRequest getLanguageByIdRequest) {
		List<Language> languages = languageRepository.findAll();// languages getLanguageByIdResponse tipine
																// dönüştürülüyor.
		GetLanguageByIdResponse responseItem = new GetLanguageByIdResponse();
		List<GetLanguageByIdResponse> languagesResponse = new ArrayList<GetLanguageByIdResponse>();
		for (Language language : languages) {
			if (language.getId() == getLanguageByIdRequest.getId())
				responseItem.setLanguageName(null);
			languagesResponse.add(responseItem);

		}
		return responseItem;
	}

	public boolean isValid(CreateLanguageRequest createLanguageRequest) {
		List<Language> languages = languageRepository.findAll();
		for (Language language1 : languages) {
			if (language1.getName().equalsIgnoreCase(createLanguageRequest.getLanguageName())) {
				return false;
			}
		}
		return true;
	}

}