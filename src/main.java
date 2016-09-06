/**
 * Jose Jo Escobar,14343
 * Alejandro Chaclan, 15018
 * Hoja de trabajo No 6
 * Algortimos y estructura de datos
 * on 31/08/2016.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Variable para leer los datos ingresados por el usuario
        boolean flag = true; //Bandera para cuando el usuario ya no quiera ingresar mas nombres
        int opc; //Variable para guardar la opcion
        String nombre, conjs; //Variables para guardar la informacion ingresada por el usuario
        Set<String> java = null, web = null, cel = null;
        char c;

        //Se muestran las opciones del Set
        System.out.println("Ingrese que tipo de implementacion Set desea:\n"
                + "1. HashSet\n"
                + "2. TreeSet\n"
                + "3. LinkedHashSet");

        //Se lee la opcion
        opc = (int)teclado.nextDouble();

        //Dependiendo de la opcion elegido, se instancian las diferentes clases
        switch(opc) {
            case 1:
                java = new HashSet();
                web = new HashSet();
                cel = new HashSet();
                break;
            case 2:
                java = new TreeSet();
                web = new TreeSet();
                cel = new TreeSet();
                break;
            case 3:
                java = new LinkedHashSet();
                web = new LinkedHashSet();
                cel = new LinkedHashSet();
                break;
        }

        //Se realiza un ciclo para que el usuario ingrese nombres hasta que eliga que ya no lo desea
        do{
            //Se pide el nombre
            System.out.println("Ingrese el nombre de la persona:");

            teclado.nextLine();
            nombre = teclado.nextLine();

            //Se muestran las opciones de tipos de desarrolladores
            System.out.println("Ingrese a los conjuntos que pertenece la persona separados por coma (Ej:1, 2, 3)\n"
                    + "1. Desarrolladores Java\n"
                    + "2. Desarrolladores Web\n"
                    + "3. Desarrolladores Celulares");

            //Se lee la opcion
            conjs = teclado.nextLine();
            //Se recorre el string ingresado por el usuario, y segun las opciones que ingreso, se agrega el nombre al Set correspondiente
            while (!conjs.isEmpty()) {
                c = conjs.charAt(0);
                switch (c) {
                    case '1':
                        java.add(nombre);
                        break;
                    case '2':
                        web.add(nombre);
                        break;
                    case '3':
                        cel.add(nombre);
                        break;
                }
                conjs = conjs.substring(1);
            }

            //Se le pregunta el usuario si quiere ingresar otro nombre
            System.out.println("¿Desea ingresar otro nombre? (si o no)");

            if (teclado.next().equals("no"))
                flag = false;
        } while (flag);
        
        //Primera pregunta
        System.out.println("\nLos desarrolladores en Java, web y celulares son:");
        for (String s : java) {
            //Se revisa si el nombre encontrado en Java pertenece tambien a Web
            boolean flagWeb = web.contains(s);
            //Se revisa si el nombre encontrado en Java pertenece tambien a Cel
            boolean flagCel = cel.contains(s);
            if (flagWeb && flagCel) {
                System.out.println(s);
            }
        }
        
        //Segunda pregunta
        System.out.println("\nLos desarrollares en Java pero no en web son:");
        for (String s : java) {
            //Se revisa si el nombre encontrado en Java pertenece tambien a Web
            boolean flagWeb = web.contains(s);
            if (!flagWeb)
                System.out.println(s);
        }
        
        //Tercera pregunta
        System.out.println("\nLos desarrollares de Web y Celulares pero no de Java son:");
        for (String s : web) {
            //Se revisa si el nombre encontrado en Web pertenece tambien a Java
            boolean flagJava = java.contains(s);
            //Se revisa si el nombre encontrado en Web pertenece tambien a Cel
            boolean flagCel = cel.contains(s);
            if (!flagJava && flagCel)
                System.out.println(s);
        }
        
        //Cuarta pregunta
        System.out.println("\nLos desarrolladores de Web o Celulares pero no de Java");
        for (String s : web) {
            //Se revisa si el nombre encontrado en Web pertenece tambien a Java
            boolean flagJava = java.contains(s);
            if (!flagJava)
                System.out.println(s);
        }
        for (String s : cel) {
            //Se revisa si el nombre encontrado en Cel pertenece tambien a Java
            boolean flagJava = java.contains(s);
            //Se revisa si el nombre encontrado en Cel pertenece tambien a Web
            boolean flagWeb = web.contains(s);
            if (!flagJava && !flagWeb)
                System.out.println(s);
        }
        
        //Quinta pregunta
        if (web.containsAll(java)) {
            System.out.println("\nEl conjunto de desarrolladores java SI es un subconjunto de desarrolladores web");
        } else {
            System.out.println("\nEl conjunto de desarrolladores java NO es un subconjunto de desarrolladores web");
        }
        
        //Sexta y Septima pregunta
        TreeSet<String> sorted = null;
        if (java.size() >= cel.size() && java.size() >= web.size()){
            System.out.println("\nColeccion mas grande: Desarrolladores de Java");
            sorted = new TreeSet<String>(java);
            System.out.println("\nLos desarrolladores de Java ordenados ascendentemente son:");
        } else if(cel.size() >= java.size() && cel.size() >= web.size()){
             System.out.println("\nColeccion mas grande: Desarrolladores de Celulares");
            sorted = new TreeSet<String>(cel);
            System.out.println("\nLos desarrolladores de Celular ordenados ascendentemente son:");
        }else {
             System.out.println("\nColeccion mas grande: Desarrolladores Web");
            sorted = new TreeSet<String>(web);
            System.out.println("\nLos desarrolladores Web ordenadados ascendentemente son:");
        }
        for (String s : sorted) {
            System.out.println(s);
        }
    }
}
