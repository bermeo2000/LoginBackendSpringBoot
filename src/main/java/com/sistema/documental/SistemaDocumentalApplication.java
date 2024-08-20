package com.sistema.documental;

import com.sistema.documental.entidades.Rol;
import com.sistema.documental.entidades.Usuario;
import com.sistema.documental.entidades.UsuarioRol;
import com.sistema.documental.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaDocumentalApplication implements CommandLineRunner {
	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaDocumentalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
			Usuario usuario = new Usuario();

			usuario.setNombre("Fiorella");
			usuario.setApellido("Macias");
			usuario.setUsername("fiore2000");
			usuario.setPassword("12345");
			usuario.setEmail("fiore@gmail.com");
			usuario.setTelefono("988212020");
			usuario.setImagen("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");

			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());
*/
	}
}
