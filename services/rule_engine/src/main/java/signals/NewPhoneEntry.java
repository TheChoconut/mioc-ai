package signals;

import com.mindsmiths.sdk.core.api.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewPhoneEntry extends Message {
    String phone;
}
