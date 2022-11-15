package Repositories;

import Entitites.Flight;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class FlightsDBRepo implements FlightsRepository{
    private final String departure;
    private final String arrival;
    private final String depDate;
    private final String arrDate;
    private final String depTime;
    private final String arrTime;
    private final String depAirport;
    private final String arrAirport;
    private final String duration;
    private final String airline;
    private final int totalSits;
    private final int availableSits;
    private final int price;

    public FlightsDBRepo(String departure, String arrival, String depDate, String arrDate, String depTime, String arrTime, String depAirport, String arrAirport, String duration, String airline, int totalSits, int availableSits, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.depDate = depDate;
        this.arrDate = arrDate;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
        this.duration = duration;
        this.airline = airline;
        this.totalSits = totalSits;
        this.availableSits = availableSits;
        this.price = price;
    }

    @Override
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public List<Flight> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Flight> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Flight> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Flight entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Flight> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Flight> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Flight> findById(UUID uuid) {
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
    public <S extends Flight> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Flight> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Flight getOne(UUID uuid) {
        return null;
    }

    @Override
    public Flight getById(UUID uuid) {
        return null;
    }

    @Override
    public Flight getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends Flight> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Flight> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Flight> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Flight> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Flight, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
