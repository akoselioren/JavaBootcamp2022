package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequests.GetTechnologyByIdRequest;
import kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologyResponse;
import kodlama.io.Devs.business.responses.technologyResponses.GetTechnologyByIdResponse;

public interface TechnologyService {
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;

	List<GetAllTechnologyResponse> getAll();

	void delete(DeleteTechnologyRequest deleteTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;

	GetTechnologyByIdResponse getById(GetTechnologyByIdRequest getTechnologyByIdRequest);

	boolean isValid(CreateTechnologyRequest createTechnologyRequest);

}