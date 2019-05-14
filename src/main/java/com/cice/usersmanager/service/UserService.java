package com.cice.usersmanager.service;

import com.cice.usersmanager.controller.dto.UserDTO;

public interface UserService {

    /**
     * metodo que buscara un usuario en base a los datos obtenidos
     * @param userDTO
     * @return
     */
    Long searchUserByPassword(UserDTO userDTO);
}
