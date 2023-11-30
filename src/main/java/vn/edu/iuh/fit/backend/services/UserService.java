package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.models.User;
import vn.edu.iuh.fit.backend.repositories.UserRepository;

public class UserService {
    private UserRepository userRepository;
    public User login(String email, String password) {
        return userRepository.findByEmailAndPasswordHash(email, password).orElse(null);
    }
}
