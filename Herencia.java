public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Darius Goldman");
        cliente.setAge("36");
        cliente.setPhone("654721696");
        cliente.setCredito("45.000€");

        System.out.println(cliente.getName());
        System.out.println(cliente.getAge());
        System.out.println(cliente.getPhone());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setName("Francisco Camelo");
        trabajador.setAge("29");
        trabajador.setPhone("852456951");
        trabajador.setSalario("30.000€ B/A");

        System.out.println(trabajador.getName());
        System.out.println(trabajador.getAge());
        System.out.println(trabajador.getPhone());
        System.out.println(trabajador.getSalario());
}
}

class Persona{
    private String name;
    private String age;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName () {
        return this.name;
    }
    public String getAge () {
        return this.age;
    }
    public String getPhone () {
        return this.phone;
    }
}

class Cliente extends Persona {
    private String credito;
    public void setCredito(String credito) {this.credito = credito;}
    public String getCredito() {return this.credito; }
}

class Trabajador extends Persona{
    private String salario;
    public void setSalario(String salario) {this.salario = salario;}
    public String getSalario() {return this.salario; }
}
