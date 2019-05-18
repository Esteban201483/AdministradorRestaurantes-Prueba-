import Build.CodeGenerator;
import Build.DataBaseConfiguration;
import Build.FileConfiguration;

public class Prueba2 {

    public static void main(String args[])
    {
       /* System.out.println("Prueba");
        Prueba p = new Prueba();
        p.encontrarClases("ci1322.Prueba.Model");*/

        DataBaseConfiguration dataBaseConf = new DataBaseConfiguration();
        FileConfiguration fileConf = new FileConfiguration();

        dataBaseConf.setPassword("contraseña");
        dataBaseConf.setUserName("usuario");
        dataBaseConf.setMySQLCode(true);
        dataBaseConf.setPostgreSQL(false);
        dataBaseConf.setProjectPackage("ci1322.Prueba.Model");

        fileConf.setOutputFile("salida.txt");

        CodeGenerator generator = new CodeGenerator(dataBaseConf,fileConf);
        generator.generateDML();

    }
}
