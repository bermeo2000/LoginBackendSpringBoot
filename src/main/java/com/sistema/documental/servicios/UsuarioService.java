package com.sistema.documental.servicios;

import com.sistema.documental.entidades.Usuario;
import com.sistema.documental.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
