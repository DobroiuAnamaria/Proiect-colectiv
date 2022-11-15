package Repositories;

import Entitites.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class UsersDBRepo implements UsersRepository{
    private final String lastName;
    private final String firstName;
    private final String email;
    private final String password;

    public UsersDBRepo(String lastName, String firstName, String email, String password) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    @Override
    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\FlightReservationDB");
            PreparedStatement statement = connection.prepareStatement("select * from User");
            ResultSet resultSet = statement.executeQuery()){

            while(resultSet.next()){
                String id = resultSet.getString("id");
                String last_name = resultSet.getString("lastName");
                String first_name = resultSet.getString("firstName");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                User user = new User(last_name, first_name, email, password);
                user.setID(UUID.fromString(id));
                users.add(user);
            }

            return users;

        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {
        String sql = "delete from User where id = ?";

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\FlightReservationDB");
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, String.valueOf(uuid));
            statement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(User entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(UUID uuid) {
        return null;
    }

    @Override
    public User getById(UUID uuid) {
        return null;
    }

    @Override
    public User getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }
}
