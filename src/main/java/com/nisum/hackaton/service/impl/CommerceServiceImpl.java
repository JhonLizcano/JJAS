package com.nisum.hackaton.service.impl;

import com.nisum.hackaton.model.Commerce;
import com.nisum.hackaton.model.DTO.RequestRegisterCommerce;
import com.nisum.hackaton.model.DTO.ResponseRegisterCommerce;
import com.nisum.hackaton.model.User;
import com.nisum.hackaton.repository.CommerceRepository;
import com.nisum.hackaton.repository.UserRepository;
import com.nisum.hackaton.service.CommerceService;
import com.nisum.hackaton.util.Constants;
import com.nisum.hackaton.util.CommerceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommerceServiceImpl implements CommerceService {

    @Autowired
    private CommerceRepository registerCommerceRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseRegisterCommerce saveCommerce(RequestRegisterCommerce requestRegisterCommerce) {
        Optional<Commerce> commerceValidate = registerCommerceRepository.findByName(requestRegisterCommerce.getName());
        if (!commerceValidate.isPresent()) {
            try {
                Optional<User> user = userRepository.findByIdUser(requestRegisterCommerce.getIdUser());
                if (user.isPresent()) {
                    Commerce commerce =
                            registerCommerceRepository.save(
                                    CommerceMapper.getCommerceFromRequestRegister(requestRegisterCommerce, user.get()));
                    return ResponseRegisterCommerce.builder()
                            .commerce(CommerceMapper.getCommerceDtoFromCommerce(commerce))
                            .build();
                } else {
                    return ResponseRegisterCommerce.builder()
                            .mensaje(Constants.USER_NOT_EXIST)
                            .build();
                }
            } catch (Exception e) {
                return ResponseRegisterCommerce.builder()
                        .mensaje(Constants.SAVE_ERROR)
                        .build();
            }
        } else {
            return ResponseRegisterCommerce.builder()
                    .mensaje(Constants.EXIST_COMMERCE)
                    .build();
        }
    }
}
