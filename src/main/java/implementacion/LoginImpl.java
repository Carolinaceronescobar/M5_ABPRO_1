package implementacion;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public interface LoginImpl {
    Optional<String> getUsername(HttpServletRequest request);
}