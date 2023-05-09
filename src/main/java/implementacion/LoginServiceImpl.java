package implementacion;

import interfaces.*;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public class LoginServiceImpl implements LoginInterface {
    @Override
    public Optional<String> getUsername(HttpServletRequest request) {
        return Optional.empty();
    }
}
