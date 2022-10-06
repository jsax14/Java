public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Juan");
        cliente.setEdad(26);
        cliente.setTelefono("32715645");
        cliente.setCredito(10000);
        trabajador.setSalario(20000);

        System.out.println("nombre: "+ cliente.getNombre()+"\n"+
                           "edad: "+ cliente.getEdad()+"\n"+
                "Telefono: "+ cliente.getTelefono()+"\n"+
                "Credito: "+ cliente.getCredito()+"\n"+
                "Salario: "+ trabajador.getSalario()+"\n"
        );

    }
}
     class Persona {

        private String nombre;
        private int edad;
        private String telefono;

         public String getNombre() {
             return nombre;
         }

         public void setNombre(String nombre) {
             this.nombre = nombre;
         }

         public int getEdad() {
             return edad;
         }

         public void setEdad(int edad) {
             this.edad = edad;
         }

         public String getTelefono() {
             return telefono;
         }

         public void setTelefono(String telefono) {
             this.telefono = telefono;
         }
     }
    class Cliente extends Persona { //el cliente esta heredando el nombre,telefono y edad de Persona
        private int credito;//solo estoy agregando el credito
        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }


    }
    class Trabajador extends Cliente{ //esta clase esta heredando multiple a cliente y a su vez a persona
        private int salario;

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
    }

