package interfaces;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public interface LoginInterface {
    Optional<String> getUsername(HttpServletRequest request);
}
