package nttdata.grupouno.com.microwallet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clientWallet")
public class ClientWalletModel {
    @Id
    private String id;
    @NotEmpty
    private String numberDocument;
    @NotEmpty
    private String typeDocument;
    @NotEmpty
    @Indexed(unique=true)
    private String numberPhone;
    @NotEmpty
    private String imeiPhone;
    @Email
    private String email;
}
