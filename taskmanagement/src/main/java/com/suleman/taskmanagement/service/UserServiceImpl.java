package com.suleman.taskmanagement.service;

import com.suleman.taskmanagement.model.Role;
import com.suleman.taskmanagement.model.User;
import com.suleman.taskmanagement.repository.RoleRepository;
import com.suleman.taskmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@Service
//public class UserServiceImpl implements UserService{
//
//    @Autowired
//    public UserRepository userRepository;
//
//    private UserRepository userRepositoryRepository;
//    private RoleRepository roleRepository;
//    private PasswordEncoder passwordEncoder;
//
//
//    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
//                                    PasswordEncoder passwordEncoder) {
//        super();
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//
//    @Override
//    public void saveUser(User user) {
//      user.setUsername(user.getUsername() );
//        user.setEmail(user.getEmail());
//        // Encrypt the password using Spring Security
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//
//        Role role = roleRepository.findByName("ROLE_USER");
//        if (role == null) {
//            role = checkRoleExist();
//        }
//        user.setRoles(Arrays.asList(role));
//        userRepository.save(user);
//
//    }
//
//    private Role checkRoleExist() {
//        Role role = new Role();
//        role.setName("ROLE_USER");
//        return roleRepository.save(role);
//    }
//
//    @Override
//    public User findByEmail(String email) {
//       return userRepository.findByEmail(email);
//    }
//
//    @Override
//    public List<User> findAllUsers() {
//        List<User> users = userRepository.findAll();
//        return users;
//    }
//}
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(User user) {
        user.setUsername(user.getUsername());
        user.setEmail(user.getEmail());
        // Encrypt the password using Spring Security
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role role = roleRepository.findByName("ROLE_USER");
        if (role == null) {
            role = checkRoleExist();
        }
        user.setRoles(Collections.singletonList(role));
        userRepository.save(user);
    }

    private Role checkRoleExist() {
        Role role = new Role();
        role.setName("ROLE_USER");
        return roleRepository.save(role);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
