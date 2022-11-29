package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequests.GetLanguageByIdRequest;
import kodlama.io.Devs.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languageResponses.GetLanguageByIdResponse;

public interface LanguageService {
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;

	List<GetAllLanguagesResponse> getAll();

	void delete(DeleteLanguageRequest deleteLanguageRequest);

	void update(UpdateLanguageRequest updateLanguageRequest) throws Exception;

	GetLanguageByIdResponse getById(GetLanguageByIdRequest getLanguageByIdRequest);

	boolean isValid(CreateLanguageRequest createLanguageRequest);

}