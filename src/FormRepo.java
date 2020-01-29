import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public FormRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sina","sg159753");
        connection.setAutoCommit(false);
    }

    public void insert(Form form)throws  Exception{
        preparedStatement = connection.prepareStatement("insert into formList (fullName,age,workExp,telephone,email,address)");
        preparedStatement.setString(1,form.getFullName());
        preparedStatement.setString(2,form.getAge());
        preparedStatement.setString(3,form.getWorkExp());
        preparedStatement.setString(4,form.getTelphone());
        preparedStatement.setString(5,form.getEmail());
        preparedStatement.setString(6,form.getAddress());
        preparedStatement.executeUpdate();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
