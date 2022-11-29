package kodlama.io.Devs.business.requests.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLanguageRequest {
	private String oldName;
	private String newName;
}