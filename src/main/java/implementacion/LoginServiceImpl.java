package implementacion;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

import java.util.Optional;

public class LoginServiceImpl implements LoginImpl {

    @Override
    public Optional<String> getUsername(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username != null){
            return Optional.of(username);
        }
        return Optional.empty();
    }
}