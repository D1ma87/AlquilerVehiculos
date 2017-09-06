package beans;

public class Usuario {
		
		public String dni;
		public String password;
		public String email;
		public String nombre;
		public String apellido;
		public int administrador;
		public Usuario(String dni, String password, String email, String nombre, String apellido, int administrador) {
			super();
			this.dni = dni;
			this.password = password;
			this.email = email;
			this.nombre = nombre;
			this.apellido = apellido;
			this.administrador=administrador;
		}
		public int getAdministrador() {
			return administrador;
		}
		public void setAdministrador(int administrador) {
			this.administrador = administrador;
		}
		public Usuario() {
			super();
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
}
