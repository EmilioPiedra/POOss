package ec.edu.utpl.cc.poo.semana15.conecciones;

import ec.edu.utpl.cc.poo.semana15.model.Estudiante;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class JbdiDaoImpl implements IDao {
    private Jdbi jdbi;
    private DBConfig config;

    public JbdiDaoImpl(DBConfig config) {
        this.config = config;
        jdbi = Jdbi.create(config.getJdbcURL(),config.getUsername(),config.getPasword());

    }

    @Override
    public boolean create(Estudiante estudiante) {
        String sqlInsert = """
                INSERT INTO ESTUDIANTE (
                CEDULA, 
                APELLIDO, 
                NOMBRE, 
                EMAIL, 
                EDAD, 
                PESO) VALUES (
                :cedula,
                :apellido,
                :nombre, 
                :email,
                :edad,
                :peso)
                """;
        int n = jdbi.withHandle(handle -> handle.createUpdate(sqlInsert)
                .bindBean(estudiante)
                .execute());
        return n >0;
    }

    @Override
    public Estudiante read(String cedula) {
        String sqlSelect = "SELECT * FROM ESTUDIANTE WHERE CEDULA = :cedula";
       return jdbi.withHandle(handle -> (handle.createQuery(sqlSelect)
                .bind("cedula",cedula)
                .mapToBean(Estudiante.class).one())
        );
    }

    @Override
    public boolean update(Estudiante estudiante) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Estudiante> readAll() {
        return null;
    }
}
