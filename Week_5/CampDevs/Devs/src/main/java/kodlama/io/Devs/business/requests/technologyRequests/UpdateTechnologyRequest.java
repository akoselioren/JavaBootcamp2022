package kodlama.io.Devs.business.requests.technologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateTechnologyRequest {
	private String oldName;
	private String newName;
}
