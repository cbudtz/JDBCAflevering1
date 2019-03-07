package dal;

import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//TODO Rename class
public class UserDAOImpls134000 implements IUserDAO {
    //TODO Make a connection to the database
    private Connection createConnection() throws SQLException {
        return  DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/chbu?"
                    + "user=chbu&password=4thVbCaMOxnXi3aJ4");
    }

    @Override
    public UserDTO getUser(int userId) throws DALException {


        //TODO Implement this - should retrieve a user from db and parse it to a UserDTO
       try (Connection c = createConnection()){


           UserDTO user = new UserDTO();
           //TODO: Make a user from the resultset
           return user;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }

    }



    @Override
    public List<UserDTO> getUserList() throws DALException {
        //TODO Implement this - Should retrieve ALL users from db and parse the resultset to a List of UserDTO's.
        return null;
    }

    @Override
    public void createUser(UserDTO user) throws DALException {
        //TODO Implement this - Should insert a user into the db using data from UserDTO object.
    }

    @Override
    public void updateUser(UserDTO user) throws DALException {
        //TODO Implement this - Should update a user in the db using data from UserDTO object.
    }

    @Override
    public void deleteUser(int userId) throws DALException {
        //TODO Implement this - Should delete a user with the given userid from the db.
    }
}
